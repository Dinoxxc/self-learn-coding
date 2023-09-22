#include <iostream>
using namespace std;

int main() {
    int candidate;

    cout << "How old are you?" << endl;
    cin >> candidate;

    if (candidate >= 18){
        cout << "Congrats, you can vote";
    } else{
        cout << "Sorry, you can't vote";
        return 0;
    }

    return 0;
}