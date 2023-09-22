#include <iostream>
using namespace std;

int main() {
    int x, y;
    float tambah, kurang, kali, bagi;
    cout << "Masukkan angka pertama = ";
    cin >> x;
    cout << "Masukkan angka kedua = ";
    cin >> y;

    tambah = x + y;
    kurang = x - y;
    kali = x * y;
    bagi = x / y;
    
    cout << x << " + " << y << " = " << tambah << endl;
    cout << x << " - " << y << " = " << kurang << endl;
    cout << x << " x " << y << " = " << kali << endl;
    cout << x << " : " << y << " = " << bagi << endl;

    return 0;
}