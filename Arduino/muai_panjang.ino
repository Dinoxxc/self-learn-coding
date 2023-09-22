#include <Wire.h>
#include <MPU6050.h>
#include <math.h> //library includes mathematical functions
#include <LiquidCrystal_I2C.h>
#include <EEPROM.h>
LiquidCrystal_I2C lcd(0x27, 16, 2);

MPU6050 mpu;
float si_n,pj_a;

int onoff=4;
int up=7;
int dw=6;
int mn=5;
int heater=8;
int relay=11;
int temp1,temp2,i,x,mnt,menit,detik,count,st,diameter;
float suhu1,suhu2,avg1,avg2,setsuhu;

void setup() 
{
  lcd.begin();
  lcd.backlight();
  Serial.begin(115200);
  Serial.println("Initialize MPU6050");
  while(!mpu.begin(MPU6050_SCALE_2000DPS, MPU6050_RANGE_2G))
  {
    Serial.println("Could not find a valid MPU6050 sensor, check wiring!");
    delay(500);
  }
  pinMode(onoff,INPUT);
  pinMode(dw,INPUT);
  pinMode(up,INPUT);
  pinMode(mn,INPUT);
  digitalWrite(onoff,HIGH);
  digitalWrite(dw,HIGH);
  digitalWrite(up,HIGH);
  digitalWrite(mn,HIGH);
  pinMode(heater,OUTPUT);
  digitalWrite(heater,HIGH);
  pinMode(relay,OUTPUT);
  digitalWrite(relay,LOW);
  
  mnt=EEPROM.read(1);
  if(mnt<1 || mnt>100){EEPROM.write(1,2);}
  setsuhu=EEPROM.read(2);
  if(setsuhu<40 || setsuhu>100){EEPROM.write(2,40);}
  diameter=EEPROM.read(3);
  if(diameter<3 || diameter>10){EEPROM.write(3,10);}
  detik=0;

  interrupts();             // enable all interruptsnoInterrupts();           // disable all interrupts

  TCCR1A = 0;
  TCCR1B = 0;
  TCNT1  = 0;
  OCR1A = 31250;            // compare match register 16MHz/256/2Hz
  TCCR1B |= (1 << WGM12);   // CTC mode
  TCCR1B |= (1 << CS12);    // 256 prescaler 
  TIMSK1 |= (1 << OCIE1A);  // enable timer compare interrupt

  interrupts();  
  st=0;
}
ISR(TIMER1_COMPA_vect)          // timer compare interrupt service routine

{count++;
  if(st==1){
 
 if(count>=2){count=0;detik++;}
 if(detik>=60){menit++;detik=0;} 
  } 
}

float degree(double deg)
{return(deg*22)/(7*180);}

void loop()
{
  avg1=avg2=0;
  diameter=EEPROM.read(3);
  for (x=0;x<10;x++){suhu1=suhu2=0;
  for(i=0;i<100;i++){
  temp1=analogRead(1);
  temp2=analogRead(0);
  suhu1=suhu1+(((float)temp1*5)/1024);
  suhu2=suhu2+(((float)temp2*5)/1024);
  }
  avg1=avg1+suhu1;
  avg2=avg2+suhu2;
  }
  avg2=avg2/10;avg1=avg1/10;
  lcd.setCursor(0,0);lcd.print("T1:");lcd.print(avg1,1);lcd.print("C ");
  lcd.setCursor(0,1);lcd.print("T2:");lcd.print(avg2,1);lcd.print("C ");

  
  Vector normAccel = mpu.readNormalizeAccel();
  int pitch = -(atan2(normAccel.XAxis, sqrt(normAccel.YAxis*normAccel.YAxis + normAccel.ZAxis*normAccel.ZAxis))*180.0)/M_PI;
  int roll = (atan2(normAccel.YAxis, normAccel.ZAxis)*180.0)/M_PI;
  Serial.print(" Sudut = ");
  Serial.print(roll);
  Serial.print(" Tan = ");Serial.print(tan(degree(roll)),4);
  pj_a=50-diameter*(tan(degree(roll)));
  Serial.print(" L =");Serial.print(pj_a,4);
  Serial.print(" set suhu =");Serial.print(setsuhu);
  Serial.print("  suhu =");Serial.println(avg1,1);
  //Serial.println();
  
  mnt=EEPROM.read(1);
  lcd.setCursor(9,0);lcd.print("dL:");lcd.print(pj_a,3);lcd.print("  ");
  if(st==0){lcd.setCursor(9,1);lcd.print("t:");lcd.print(mnt);lcd.print(":");lcd.print(detik);lcd.print("  ");}
  if(st==1){lcd.setCursor(9,1);lcd.print("t:");lcd.print(mnt-menit);lcd.print(":");lcd.print(59-detik);lcd.print("  ");
  if(avg1<=setsuhu && avg2<=setsuhu){digitalWrite(relay,HIGH);delay(100);digitalWrite(heater,LOW);} else {digitalWrite(heater,HIGH);delay(100);digitalWrite(relay,LOW);}
  if(menit==mnt && detik>=59){st=0;detik=0;digitalWrite(heater,HIGH);delay(1000);digitalWrite(relay,LOW);}
  }
  
  
  if(digitalRead(mn)==LOW && st==0){lcd.clear();menu();}
  if(digitalRead(onoff)==LOW && st==0){while(digitalRead(onoff)==LOW){delay(100);detik=59;}st=1;count=0;menit=0;}
  if(digitalRead(onoff)==LOW && st==1){digitalWrite(heater,HIGH);delay(100);while(digitalRead(onoff)==LOW){delay(100);}st=0;count=0;detik=0;digitalWrite(relay,LOW);}
  
}

void menu()
{
  while(digitalRead(mn)==LOW){delay(100);lcd.setCursor(0,0);lcd.print("Set Waktu");}
  while(digitalRead(mn)==HIGH)
  {
   mnt=EEPROM.read(1);
   if(digitalRead(up)==LOW && mnt<=100){mnt++;delay(300);} 
   if(digitalRead(dw)==LOW && mnt>2){mnt--;delay(300);} 
   EEPROM.write(1,mnt);
   lcd.setCursor(0,1);lcd.print(mnt); lcd.print(" menit  ");
  delay(300);
  }
  lcd.clear();
  while(digitalRead(mn)==LOW){delay(100);lcd.setCursor(0,0);lcd.print("Set Suhu  ");}
  while(digitalRead(mn)==HIGH)
  {
   setsuhu=EEPROM.read(2);
   if(digitalRead(up)==LOW && setsuhu<=100){setsuhu++;delay(300);} 
   if(digitalRead(dw)==LOW && setsuhu>40){setsuhu--;delay(300);} 
   EEPROM.write(2,setsuhu);
   lcd.setCursor(0,1);lcd.print(setsuhu,1); lcd.print(" ");
  delay(300);
  }
  lcd.clear();
  while(digitalRead(mn)==LOW){delay(100);lcd.setCursor(0,0);lcd.print("Shaft Diamter ");}
  while(digitalRead(mn)==HIGH)
  {
   diameter=EEPROM.read(3);
   if(digitalRead(up)==LOW && diameter<12){diameter++;delay(300);} 
   if(digitalRead(dw)==LOW && diameter>3){diameter--;delay(300);} 
   EEPROM.write(3,diameter);
   lcd.setCursor(0,1);lcd.print(diameter); lcd.print(" mm ");
  delay(300);
  }
  lcd.clear();
  while(digitalRead(mn)==LOW){delay(100);lcd.setCursor(0,0);lcd.print("Exit");}
  lcd.clear();
}
