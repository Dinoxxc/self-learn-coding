#include <iostream>

using namespace std;

float hitung_luas_bangunan(float panjang, float lebar) {
    float luas = panjang * lebar;
    return luas;
}

int main() {
    float panjang_bangunan, lebar_bangunan, luas_bangunan;
    
    cout << "Masukkan panjang bangunan: ";
    cin >> panjang_bangunan;
    
    cout << "Masukkan lebar bangunan: ";
    cin >> lebar_bangunan;
    
    luas_bangunan = hitung_luas_bangunan(panjang_bangunan, lebar_bangunan);
    
    cout << "Luas bangunan adalah: " << luas_bangunan << " meter persegi." << endl;
    
    return 0;
}
