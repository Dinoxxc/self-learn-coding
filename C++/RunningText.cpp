#include <iostream>
#include <string>
using namespace std;

struct Mahasiswa {
    string mata_kuliah, keterangan;
    char grade;
    float nilai;
};

string nim, nama, prodi;
int kode;
char pesan;

const int MAX_SIZE = 100;
Mahasiswa dataMahasiswa[MAX_SIZE];
int jumlahData = 0;

void tambahData() {
    if (jumlahData < MAX_SIZE) {
        Mahasiswa mhs;
        cout << "Mata Kuliah: ";
        cin >> mhs.mata_kuliah;
        getline(cin, mhs.mata_kuliah);
        cout << "Nilai: ";
        cin >> mhs.nilai;

        if (mhs.nilai >= 40) {mhs.grade = 'E'; mhs.keterangan = "Tidak Lulus";}
        if (mhs.nilai >= 50) {mhs.grade = 'D'; mhs.keterangan = "Lulus";}
        if (mhs.nilai >= 60) {mhs.grade = 'C'; mhs.keterangan = "Lulus";}
        if (mhs.nilai >= 70) {mhs.grade = 'B'; mhs.keterangan = "Lulus";}
        if (mhs.nilai >= 80) {mhs.grade = 'A'; mhs.keterangan = "Lulus";}
         

        dataMahasiswa[jumlahData] = mhs;
        jumlahData++;
        cout << "Data mahasiswa berhasil ditambahkan.\n";
    } else {
        cout << "Data mahasiswa sudah penuh.\n";
    }
}

void tampilkanData() {
    if (jumlahData > 0) {
        cout<<"===================================================="<<endl;
        cout << "Data Mahasiswa:\n";
        cout<<"===================================================="<<endl;
        cout << "NIM   : " << nim << endl;
        cout << "Nama  : " << nama << endl;
        cout << "Prodi : " << prodi << endl;
        cout<<"\n"<<endl;
        cout<<"===================================================="<<endl;
        cout<< " No - MTK - Nilai - Grade - Keterangan"<<endl;
        cout<<"===================================================="<<endl;
        for (int i = 0; i < jumlahData; i++) {
            cout << i +1 <<" - " << dataMahasiswa[i].mata_kuliah <<" - " << dataMahasiswa[i].nilai << " - " << dataMahasiswa[i].grade  << " - " << dataMahasiswa[i].keterangan << endl;
            cout<<"====================================================";
            cout << endl;
        }
    } else {
        cout << "Belum ada data mahasiswa.\n";
    }
}

void ubahData() {
    string nim;
    cout << "Masukkan NIM mahasiswa yang ingin diubah: ";
    cin >> nim;

    // int index = -1;
    // for (int i = 0; i < jumlahData; i++) {
    //     if (dataMahasiswa[i].nim == nim) {
    //         index = i;
    //         break;
    //     }
    // }

    // if (index != -1) {
    //     Mahasiswa mhs;
    //     cout << "NIM baru: ";
    //     cin >> mhs.nim;
    //     cout << "Nama baru: ";
    //     cin.ignore();
    //     getline(cin, mhs.nama);
    //     cout << "Nilai baru: ";
    //     cin >> mhs.nilai;

    //     dataMahasiswa[index] = mhs;
    //     cout << "Data mahasiswa berhasil diubah.\n";
    // } else {
    //     cout << "NIM mahasiswa tidak ditemukan.\n";
    // }
}

void hapusData() {
    string nim;
    cout << "Masukkan NIM mahasiswa yang ingin dihapus: ";
    cin >> nim;

    // int index = -1;
    // for (int i = 0; i < jumlahData; i++) {
    //     if (dataMahasiswa[i].nim == nim) {
    //         index = i;
    //         break;
    //     }
    // }

    // if (index != -1) {
    //     for (int i = index; i < jumlahData - 1; i++) {
    //         dataMahasiswa[i] = dataMahasiswa[i + 1];
    //     }
    //     jumlahData--;
    //     cout << "Data mahasiswa berhasil dihapus.\n";
    // } else {
    //     cout << "NIM mahasiswa tidak ditemukan.\n";
    // }
}

int main()
{
    cout<<"======================================"<<endl;
    cout<<"=            PROGRAM KHS             ="<<endl;
    cout<<"======================================"<<endl;
    // Input NIM
    // ====================
    cout<<"Input NIM : ";
    cin>>nim;
    
    // ====================
    // Input Nama
    // ====================
    cout<<"Input Nama : ";
    cin>>nama;
    // ====================

    // ====================
    // Input Nama
    // ====================
    cout<<"Input Prodi : ";
    cin>>prodi;
    // ====================
   
    do {
        cout<<"======================================"<<endl;
        cout<<"=            SELECT ACTION            ="<<endl;
        cout<<"======================================"<<endl;
        cout<<""<<endl;
        cout<<"======================================"<<endl;
        cout<<"=      __________    ="<<endl;
        cout<<"=     | KODE |      ACTION      |    ="<<endl;
        cout<<"=     |------|------------------|    ="<<endl;
        cout<<"=     |   1  | Tambah Data      |    ="<<endl;
        cout<<"=     |   2  | Tampil Data      |    ="<<endl;
        cout<<"=     |   3  | Exit             |    ="<<endl;
        cout<<"=     |__|______|    ="<<endl;
        cout<<"=                                    ="<<endl;
        cout<<"====================================="<<endl;
        cout<<""<<endl;
        
        cout<<"===================================================="<<endl;
        // Input Kode Makanan
        // ====================
        cout<<"Masukan Kode : ";
        cin>>kode;
        // ====================
        
        cout<<"----------------------------------------------------"<<endl;
        
        // Pengechekan Kode Makanan Yang Diinput
        // Jika Kode Tidak Di Temukan Akan Terus Di Kembalikan Untuk Mengisi Ulang
        // ====================
        if(kode < 1 || kode > 5){
            do{
                cout<<"Kode yang anda input tidak ada! "<<endl;
                cout<<""<<endl;
                cout<<"Masukan Kode Kembali: ";
                cin>>kode;
                cout<<"----------------------------------------------------"<<endl;
            }while(kode < 1 || kode > 5);
        }
        // ====================
        
        // Pengecekan Kode Yang Diinput Berdasarkan Case
        switch (kode)
        {
            case 1:
                tambahData();
                cout<<""<<endl;
                cout<<"Masih Ada Yang Lain Y/T : ";
                cin>>pesan;
                break; 
                
            case 2:
                tampilkanData();
                cout<<""<<endl;
                cout<<"Masih Ada Yang Lain Y/T : ";
                cin>>pesan;
                break; 
                
            // case 3:
            //    ubahData();
            //    cout<<""<<endl;
            //     cout<<"Masih Ada Yang Lain Y/T : ";
            //     cin>>pesan;
            //     break; 
                
            // case 4:
            //     hapusData();
            //     cout<<""<<endl;
            //     cout<<"Masih Ada Yang Lain Y/T : ";
            //     cin>>pesan;
            //     break; 
                
            case 3:
                cout<<"===================================================="<<endl;
                cout<<"=        Terima Kasih Program Selesai \n           ="<<endl;
                cout<<"===================================================="<<endl;
                break; 
        }
            
    }while (pesan == 'Y' || pesan == 'y');
    return 0;
}