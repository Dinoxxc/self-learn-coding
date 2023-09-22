#include <iostream>
using namespace std;

int main() {
    int StokBarang = 50, BarangKeluar, BarangMasuk;
    float HargaPerSatuan;
    double HargaTotal;

    cout << "Apa yang ingin dilakukan?" << endl;
    cout << "1. Barang Keluar" << endl;
    cout << "2. Barang Masuk" << endl;

    int pilihan;
    cin >> pilihan;

    if (pilihan == 1) {
        cout << "Masukkan jumlah barang: ";
        cin  >> BarangKeluar;

        cout << "Masukkan harga per satuan: ";
        cin  >> HargaPerSatuan;

        HargaTotal = BarangKeluar * HargaPerSatuan;

        if (BarangKeluar > StokBarang) {
            cout << "Stok barang tidak mencukupi." << endl;
        } else {
            StokBarang -= BarangKeluar;
            cout << "Jumlah " << BarangKeluar << " barang, total harganya adalah " << HargaTotal << endl;
            cout << "Stok barang sekarang: " << StokBarang << endl;
        }

    } else if (pilihan == 2) {
        cout << "Berapa barang yang masuk? ";
        cin >> BarangMasuk;
        StokBarang = StokBarang + BarangMasuk;
        cout << "Stok barang sekarang: " << StokBarang << endl;

    } else {
        cout << "Input tidak valid." << endl;
        return 0;
    }

    return 0;
}
