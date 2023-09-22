#include <iostream>
using namespace std;

int main() {
    string kalimat;
    cout << "Masukkan kalimat: ";
    getline(cin, kalimat); // Membaca kalimat dari input

    int panjang = kalimat.length(); // Mendapatkan panjang kalimat
    int indeks = 0; // Inisialisasi indeks dengan 0

    while (indeks < panjang) { // Perulangan untuk menghapus karakter satu per satu
        cout << kalimat << endl; // Menampilkan kalimat sebelum karakter dihapus
        kalimat.erase(indeks, 1); // Menghapus karakter pada indeks yang diberikan
        panjang = kalimat.length(); // Memperbarui panjang kalimat setelah karakter dihapus
    }

    cout << "Kalimat telah dihapus habis." << endl;

    return 0;
}
