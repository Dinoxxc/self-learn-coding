#include <iostream>
#include <conio.h>
#include <stdlib.h>
using namespace std;

int main()
{
    int x, y, n;
    cout << "Masukkan input: ";
    cin >> n;

    for (x = 1; x <= n; x++)
    {
        for (y = 1; y <= n; y++)
        {
            if (x == y || y == n - x + 1)
            {
                cout << "x";
            }
            else
            {
                cout << " ";
            }
        }
        cout << "\n";
    }

    getch();
    return 0;
}
