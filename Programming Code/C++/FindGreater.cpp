#include <iostream>
using namespace std;

int findGreater(int num1, int num2) {
    int result;
    if (num1 > num2) {
        result = num1;
    } else {
        result = num2;
    }
    return result;
}

int main() {
    int x, y;
    cout << "Masukkan bilangan pertama: ";
    cin >> x;
    cout << "Masukkan bilangan kedua: ";
    cin >> y;
    cout << "Bilangan yang lebih besar adalah " << findGreater(x, y) << endl;
    return 0;
}
