int ledPins[] = {D2, D3, D4, D5}; // Array untuk menyimpan pin yang terhubung ke LED
int numberOfLeds = 4; // Jumlah LED yang akan dikendalikan
int delayTime = 1000; // Waktu penundaan antara perubahan warna (dalam milidetik)

void setup() {
  // Inisialisasi pin LED sebagai OUTPUT dan matikan semua LED
  for (int i = 0; i < numberOfLeds; i++) {
    pinMode(ledPins[i], OUTPUT);
    digitalWrite(ledPins[i], LOW);
  }
}

void loop() {
  int colorValue = 1; // Inisialisasi warna pertama

  // Loop tak terbatas untuk mengganti warna LED
  while (true) {
    // Nyalakan LED sesuai dengan nilai warna
    digitalWrite(ledPins[colorValue - 1], HIGH);

    // Tunggu sejenak
    delay(delayTime);

    // Matikan LED
    digitalWrite(ledPins[colorValue - 1], LOW);

    // Ganti warna berikutnya (1 - kuning, 2 - merah, 3 - hijau, 4 - biru)
    colorValue = (colorValue % numberOfLeds) + 1;
  }
}
