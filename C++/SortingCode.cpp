#include<iostream>
using namespace std;

int main () {
    cout <<"=====''Universitas Esa Unggul''====="<<endl;
    cout <<"=====''Fakultas Ilmu Komputer''====="<<endl;
    cout <<"=======''Teknik Informatika''======="<<endl;
    cout <<endl;
    cout <<"Nama : Andika Noor Ismawan"<<endl;
    int x, y,temp;
    int a[11] = {2,0,2,1,0,8,0,1,4,6,5};
    cout <<"Nomor Induk Mahasiswa :\n";
        for(x = 0; x<11; x++) {
        cout <<a[x]<<"\t";
    }

    cout<<endl;
        for(x = 0; x<11; x++) {
        for(y = x+1; y<11; y++) 
        {
            if(a[y] < a[x]) {
            temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            }
        }
    }

cout <<"Nomor Induk Mahasiswa setelah diurutkan :\n";
    for(x = 0; x<11; x++) {
    cout <<a[x]<<"\t";
    }
return 0;
}