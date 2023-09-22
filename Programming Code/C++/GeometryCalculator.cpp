#include <iostream>
#include <cmath>

using namespace std;

// Fungsi untuk menghitung luas permukaan kubus
double luasKubus(double sisi) {
    return 6 * pow(sisi, 2);
}

// Fungsi untuk menghitung volume kubus
double volumeKubus(double sisi) {
    return pow(sisi, 3);
}

// Fungsi untuk menghitung luas permukaan balok
double luasBalok(double panjang, double lebar, double tinggi) {
    return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
}

// Fungsi untuk menghitung volume balok
double volumeBalok(double panjang, double lebar, double tinggi) {
    return panjang * lebar * tinggi;
}

// Fungsi untuk menghitung luas permukaan tabung
double luasTabung(double jari_jari, double tinggi) {
    return 2 * M_PI * jari_jari * (jari_jari + tinggi);
}

// Fungsi untuk menghitung volume tabung
double volumeTabung(double jari_jari, double tinggi) {
    return M_PI * pow(jari_jari, 2) * tinggi;
}

// Fungsi untuk menghitung luas permukaan kerucut
double luasKerucut(double jari_jari, double garis_pelukis) {
    return M_PI * jari_jari * (jari_jari + garis_pelukis);
}

// Fungsi untuk menghitung volume kerucut
double volumeKerucut(double jari_jari, double tinggi) {
    return (1.0/3) * M_PI * pow(jari_jari, 2) * tinggi;
}

// Fungsi untuk menghitung luas permukaan limas
double luasLimas(double luas_alas, double luas_segitiga) {
    return luas_alas + 4 * luas_segitiga;
}

// Fungsi untuk menghitung volume limas
double volumeLimas(double luas_alas, double tinggi) {
    return (1.0/3) * luas_alas * tinggi;
}

// Fungsi untuk menghitung luas permukaan prisma
double luasPrisma(double luas_alas, double keliling_alas, double tinggi) {
    return 2 * luas_alas + keliling_alas * tinggi;
}

// Fungsi untuk menghitung volume prisma
double volumePrisma(double luas_alas, double tinggi) {
    return luas_alas * tinggi;
}

int main() {
    int pilihan;
    double sisi, panjang, lebar, tinggi, jari_jari, garis_pelukis, luas_alas, luas_segitiga, keliling_alas;

    cout << "Pilih bangun ruang:" << endl;
    cout << "1. Kubus" << endl;
    cout << "2. Balok" << endl;
    cout << "3. Tabung" << endl;
    cout << "4. Kerucut" << endl;
    cout << "5. Limas" << endl;
    cout << "6. Prisma" << endl;
    cout << "Masukkan pilihan (1-6): ";
    cin >> pilihan;

    switch (pilihan) {
        case 1: // Kubus
            cout << "Masukkan panjang sisi: ";
            cin >> sisi;
            cout << "Luas permukaan kubus: " << luasKubus(sisi) << endl;
            cout << "Volume kubus: " << volumeKubus(sisi) << endl;
            break;

        case 2: // Balok
            cout << "Masukkan panjang: ";
            cin >> panjang;
            cout << "Masukkan lebar: ";
            cin >> lebar;
            cout << "Masukkan tinggi: ";
            cin >> tinggi;
            cout << "Luas permukaan balok: " << luasBalok(panjang, lebar, tinggi) << endl;
            cout << "Volume balok: " << volumeBalok(panjang, lebar, tinggi) << endl;
            break;

        case 3: // Tabung
            cout << "Masukkan jari-jari: ";
            cin >> jari_jari;
            cout << "Masukkan tinggi: ";
            cin >> tinggi;
            cout << "Luas permukaan tabung: " << luasTabung(jari_jari, tinggi) << endl;
            cout << "Volume tabung: " << volumeTabung(jari_jari, tinggi) << endl;
            break;

        case 4: // Kerucut
            cout << "Masukkan jari-jari: ";
            cin >> jari_jari;
            cout << "Masukkan garis pelukis: ";
            cin >> garis_pelukis;
            cout << "Masukkan tinggi: ";
            cin >> tinggi;
            cout << "Luas permukaan kerucut: " << luasKerucut(jari_jari, garis_pelukis) << endl;
            cout << "Volume kerucut: " << volumeKerucut(jari_jari, tinggi) << endl;
            break;

        case 5: // Limas
            cout << "Masukkan luas alas: ";
            cin >> luas_alas;
            cout << "Masukkan luas segitiga sisi: ";
            cin >> luas_segitiga;
            cout << "Masukkan tinggi: ";
            cin >> tinggi;
            cout << "Luas permukaan limas: " << luasLimas(luas_alas, luas_segitiga) << endl;
            cout << "Volume limas: " << volumeLimas(luas_alas, tinggi) << endl;
            break;

        case 6: // Prisma
            cout << "Masukkan luas alas: ";
            cin >> luas_alas;
            cout << "Masukkan keliling alas: ";
            cin >> keliling_alas;
            cout << "Masukkan tinggi: ";
            cin >> tinggi;
            cout << "Luas permukaan prisma: " << luasPrisma(luas_alas, keliling_alas, tinggi) << endl;
            cout << "Volume prisma: " << volumePrisma(luas_alas, tinggi) << endl;
            break;

        default:
            cout << "Pilihan tidak valid." << endl;
            break;
    }

    return 0;
}
