#include <iostream>
#include <iomanip>
#include <locale>
using namespace std;

int main() {

    // Deklarasi variabel
    char golongan;
    string nama_pegawai, nomor_induk;
    int masa_kerja;
    long gaji_pokok, tunjangan, tpp, penghasilan_total, pajak_pph, pajak_ptkp, total_gaji, infaq;

    // Input data pegawai
    cout << "Masukkan nama pegawai: ";
    getline(cin >> ws, nama_pegawai, '\n');
    cout << "Masukkan nomor induk pegawai: ";
    cin >> nomor_induk;
    cin.ignore();
    cout << "Masukkan golongan pegawai (A/B/C/D): ";
    cin >> golongan;
    cout << "Masukkan masa kerja pegawai (dalam tahun): ";
    cin >> masa_kerja;

    // Menghitung gaji pokok
    if (golongan == 'A') {
        gaji_pokok = 5000000;
    } else if (golongan == 'B') {
        gaji_pokok = 10000000;
    } else if (golongan == 'C') {
        gaji_pokok = 15000000;
    } else if (golongan == 'D') {
        gaji_pokok = 20000000;
    } else {
        cout << "Golongan pegawai tidak valid." << endl;
        return 0;
    }

    // Menghitung tunjangan
    if (golongan == 'A') {
        tunjangan = 4 * gaji_pokok;
    } else if (golongan == 'B') {
        tunjangan = 3 * gaji_pokok;
    } else if (golongan == 'C') {
        tunjangan = 2 * gaji_pokok;
    } else if (golongan == 'D') {
        tunjangan = 1 * gaji_pokok;
    }

    // Menghitung TPP
    if (golongan == 'A') {
        tpp = gaji_pokok;
    } else if (golongan == 'B') {
        tpp = gaji_pokok / 2;
    } else if (golongan == 'C') {
        tpp = gaji_pokok / 3;
    } else if (golongan == 'D') {
        tpp = gaji_pokok / 4;
    }

    // Menghitung penghasilan total
    penghasilan_total = gaji_pokok + tunjangan + tpp;

    // Menghitung pajak PPH
    if (penghasilan_total <= 50000000) {
        pajak_pph = penghasilan_total * 5 / 100;
    } else if (penghasilan_total <= 250000000) {
        pajak_pph = penghasilan_total * 15 / 100;
    } else {
        pajak_pph = penghasilan_total * 30 / 100;
    }

    // Menghitung pajak PTKP
    if (masa_kerja <= 2) {
        pajak_ptkp = 36000000/12;
    } else if (masa_kerja <= 8) {
        pajak_ptkp = 42000000/12;
    } else {
        pajak_ptkp = 48000000/12;
    }

    // Menghitung infaq
    infaq = penghasilan_total * 25 / 1000;

    // Menghitung total gaji
    total_gaji = penghasilan_total - pajak_pph - pajak_ptkp - infaq;


    // Menampilkan hasil perhitungan
    cout << "=========================================" << endl;
    cout << "                SLIP GAJI                "<< endl;
    cout << "=========================================" << endl;
    cout << "Nama Pegawai       : " << nama_pegawai << endl;
    cout << "Nomor Induk Pegawai: " << nomor_induk << endl;
    cout << "Gaji pokok         : Rp " << gaji_pokok << endl;
    cout << "Tunjangan          : Rp " << tunjangan << endl;
    cout << "TPP                : Rp " << tpp << endl;
    cout << "Penghasilan total  : Rp " << penghasilan_total << endl;
    cout << "Pajak PPH          : Rp " << pajak_pph << endl;
    cout << "Pajak PTKP         : Rp " << pajak_ptkp << endl;
    cout << "Infaq              : Rp " << infaq << endl;
    cout << "=========================================" << endl;
    cout << "Total gaji         : Rp " << total_gaji << endl;
    cout << "=========================================" << endl;

return 0;
}

