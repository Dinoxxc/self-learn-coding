#include <iostream>
using namespace std;

int main() {
    float phi, diameter, jariJari, luas, keliling;
    
    cout << "Apakah ingin menghitung lingkaran berdasarkan diameter atau jari-jari?" << endl;
    cout << "1. Diameter" << endl;
    cout << "2. Jari-jari" << endl;

    phi = 3.14;

    int pilihan;
    cin >> pilihan;

    if (pilihan == 1) {
        cout << "Masukkan nilai diameter lingkaran: ";
        cin >> diameter;
        jariJari = diameter / 2.0;
    } else if (pilihan == 2) {
        cout << "Masukkan nilai jari-jari lingkaran: ";
        cin >> jariJari;
        diameter = jariJari * 2.0;
    } else {
        cout << "Input tidak valid." << endl;
        return 0;
    }

    luas = phi * jariJari * jariJari;
    keliling = phi * diameter;

    cout << "Lingkaran dengan diameter " << diameter << " memiliki luas " << luas << endl;
    cout << "Lingkaran dengan diameter " << diameter << " memiliki keliling " << keliling << endl;

    return 0;
}
