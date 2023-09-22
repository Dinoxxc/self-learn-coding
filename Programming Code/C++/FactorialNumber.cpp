#include <iostream>
using namespace std;

int factorial(int n) {
    if (n == 0 || n == 1)
        return 1;
    return n * factorial(n - 1);
}

void printFactorial(int n) {
    cout << n << "! = ";
    for (int i = n; i >= 1; i--) {
        cout << i;
        if (i > 1)
            cout << "x";
    }
    cout << " = " << factorial(n) << endl;
}

int main() {
    int number;
    cout << "Masukkan bilangan bulat positif: ";
    cin >> number;

    if (number < 0) {
        cout << "Masukkan bilangan bulat positif!";
    } else {
        cout << "Berikut adalah faktorisasi dari " << number << "!" << endl;
        printFactorial(number);
    }
    
    return 0;
}
