#include <iostream>
using namespace std;

int main()
{
    int n, f1 = 0, f2 = 1, berikutnya = 0;

    cout << "Masukkan Batas Deret Bilangan Fibonacci: ";
    cin >> n;
    cout << "Deret Fibonacci: ";

    for (int i = 1; i <= n; ++i)
    {
        // Mencetak dua bilangan Fibonacci pertama.
        if (i == 1)
        {
            cout << f1 << " ";
            continue;
        }
        if (i == 2)
        {
            cout << f2 << " ";
            continue;
        }

        berikutnya = f1 + f2;
        f1 = f2;
        f2 = berikutnya;
        
        // Mencetak bilangan Fibonacci berikutnya.
        cout << berikutnya << " ";
    }

    return 0;
}
