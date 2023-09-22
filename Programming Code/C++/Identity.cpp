#include <iostream>
using namespace std;

int main() {
    string firstName, middleName, lastName;
    string universityName, majorStudy;
    long nimStudent;
    int todayStudy;
    float scoreToday;

    cout << "Enter your first name: ";
    cin >> firstName;
    cout << "Enter your middle name: ";
    cin >> middleName;
    cout << "Enter your last name: ";
    cin >> lastName;

    cout << "Enter your university name: ";
    cin.ignore();
    getline(cin, universityName);
    cout << "Enter your major study: ";
    cin.ignore();
    getline(cin, majorStudy);
    cout << "Enter your student ID: ";
    cin >> nimStudent;
    
    cout << "Enter the number of study fields learned today: ";
    cin >> todayStudy;
    cout << "Enter your average score today: ";
    cin >> scoreToday;

    cout << "Hello, Mr. " << lastName << endl;
    cout << "How is your day in " << universityName << " University?" << endl;
    cout << "Your student ID is " << nimStudent << " with majoring in " << majorStudy << endl;
    cout << "Today you have learned " << todayStudy << " study field" << endl;
    cout << "You have got an average score of " << scoreToday;

    return 0;
}