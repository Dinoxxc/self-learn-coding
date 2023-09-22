#include <iostream>
using namespace std;

int main() {
    const int n = 10;
    string DaftarAbsen[n+1] = {"", "Andi", "Diva", "Gilang", "Kay", "Olan", "Rudy", "Tika", "Udin", "Vina"};
    string DaftarJurusan[n+1] = {"", "Teknik Informatika", "Psikologi", "Hukum", "Teknik Sipil", "Akuntansi", "Manajemen", "Sistem Informasi", "Bahasa Inggris", "Sosiologi"};

    int i;
    cout << "Masukkan nomor absen: ";
    cin >> i;

    if (i >= 1 && i <= n) {
        cout << "Absen nomor " << i << " adalah " << DaftarAbsen[i] << endl;
        cout << DaftarAbsen[i] << " terdaftar sebagai mahasiswa/i jurusan " << DaftarJurusan[i] << endl;
    } else {
        cout << "Maaf, data absen tidak ada" << endl;
    }

    for (int i = 1; i < n; i++)
    {
        cout << "Absen nomor " << i << " adalah " << DaftarAbsen[i] << endl;
        cout << DaftarAbsen[i] << " terdaftar sebagai mahasiswa/i jurusan " << DaftarJurusan[i] << endl;
    }
    
    return 0; 
}
