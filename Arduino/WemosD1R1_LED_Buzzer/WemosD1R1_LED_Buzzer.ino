cpp
int ledPins[] = {2, 3, 4, 5}; // Pin LED
int numberOfLeds = 4;
int delayTime = 1000;
void setup() {
 for (int i = 0; i < numberOfLeds; i++) {
 pinMode(ledPins[i], OUTPUT);
 digitalWrite(ledPins[i], LOW);
 }
}
void loop() {
 int colorValue = 1;
 while (true) {
 digitalWrite(ledPins[colorValue - 1], HIGH);
 delay(delayTime);
 digitalWrite(ledPins[colorValue - 1], LOW);
 colorValue = (colorValue % numberOfLeds) + 1;
 }
}