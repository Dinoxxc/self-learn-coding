#define BLYNK_PRINT Serial

#include <ESP8266WiFi.h>
#include <BlynkSimpleEsp8266.h>

#define BLYNK_TEMPLATE_ID "TMPL6ZPhVXuzg"
#define BLYNK_TEMPLATE_NAME "Node MCU"
#define BLYNK_AUTH_TOKEN "Ra7T0u17RU9gtiEJFXqDag3dUM0_6PjQ"

char auth[] = BLYNK_AUTH_TOKEN;
// =====================
// WIFI
const char ssid = "Xiaomi 12"; 
const char password = "12345678901"; 
// =====================

int ledRed = D3;

BLYNK_WRITE(V0){
  digitalwrite(ledRed, param.asInt());
}
void setup() {
  Serial.begin(115200);
  Blynk.begin(auth, ssid, pass);

  pinMode(ledRed, OUTPUT);
}

void loop() {
  Blynk.run();
}

