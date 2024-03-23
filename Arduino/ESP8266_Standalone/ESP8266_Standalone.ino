
#define BLYNK_PRINT Serial

#define BLYNK_TEMPLATE_ID "TMPL6ZPhVXuzg"
#define BLYNK_TEMPLATE_NAME "Node MCU"
#define BLYNK_AUTH_TOKEN "Ra7T0u17RU9gtiEJFXqDag3dUM0_6PjQ"

#include <ESP8266WiFi.h>
#include <BlynkSimpleEsp8266.h>

char ssid[] = "Xiaomi 12";
char pass[] = "12345678901";

int ledRed = D3;

BLYNK_WRITE(V0){
  digitalWrite(ledRed, param.asInt());
}

void setup()
{
  // Debug console
  Serial.begin(9600);

  Blynk.begin(BLYNK_AUTH_TOKEN, ssid, pass);

  pinMode(ledRed, OUTPUT);
}

void loop()
{
  Blynk.run();
}

