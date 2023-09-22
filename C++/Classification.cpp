#include <iostream>
using namespace std;

int main() {
  int nilai;

  cout << "Input skor Anda : ";
  cin >> nilai;
 
  if (nilai >= 85) {
    cout << "Predikat skor anda adalah A" << endl;
    cout << "Pertahankan!" << endl;
  }
  else if (nilai >= 75 and nilai < 85) {
    cout << "Predikat skor anda adalah B" << endl;
    cout << "Harus lebih baik lagi" << endl;
  }
  else if (nilai >= 65 and nilai < 75) {
    cout << "Predikat skor anda adalah C" << endl;
    cout << "Perbanyak belajar" << endl;
  }
  else if (nilai >= 55 and nilai < 65) {
    cout << "Predikat skor anda adalah D" << endl;
    cout << "Jangan keseringan main" << endl;
  }
  else if (nilai < 55 ) {
    cout << "Predikat skor anda adalah E" << endl;
    cout << "Kebanyakan bolos..." << endl;
  }
  else {
    cout << "Maaf, format nilai tidak sesuai" << endl;
  }
 
  return 0;
}