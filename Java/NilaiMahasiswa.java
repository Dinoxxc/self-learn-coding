package Java;

import java.util.Scanner; // import kelas Scanner dari package java.util
import java.time.LocalDate; // import kelas LocalDate dari package java.time
import java.time.LocalTime; // import kelas LocalTime dari package java.time
import java.time.format.DateTimeFormatter; // import kelas DateTimeFormatter dari package java.time

public class NilaiMahasiswa { // Mendeklarasikan kelas NilaiMahasiswa dengan modifier public
    public static void main(String[] args) { // Mendefinisikan method utama main dengan parameter String array args
        try (Scanner input = new Scanner(System.in)) { // Membuat objek Scanner untuk membaca input dari pengguna

            System.out.print("Masukkan NIM Anda : "); // Menampilkan teks "Masukkan NIM Anda : "
            String nim = input.nextLine(); // Membaca input NIM dari pengguna dan menyimpannya dalam variabel nim

            System.out.print("Masukkan Nama Anda : "); // Menampilkan teks "Masukkan Nama Anda : "
            String nama = input.nextLine(); // Membaca input Nama dari pengguna dan menyimpannya dalam variabel nama

            String jenisKelamin = ""; // Deklarasi variabel jenisKelamin dengan tipe data String dan nilai a
            while (!(jenisKelamin.equalsIgnoreCase("Laki-laki") || jenisKelamin.equalsIgnoreCase("Perempuan"))) { // Perulangan while untuk memastikan jenis kelamin yang dimasukkan benar (Laki-laki atau Perempuan)
                System.out.print("Masukkan Jenis Kelamin Anda (Laki-laki/Perempuan) : ");
                jenisKelamin = input.nextLine();
                
                if (!(jenisKelamin.equalsIgnoreCase("Laki-laki") || jenisKelamin.equalsIgnoreCase("Perempuan"))) { // Jika jenis kelamin yang dimasukkan salah, akan mencetak pesan error
                    System.out.println("Error: Jenis kelamin yang Anda masukkan salah.");
                }
            }
            
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy"); // Membuat objek dari kelas DateTimeFormatter dengan format tanggal "dd MMMM yyyy"
            LocalDate currentDate = LocalDate.now(); // Mengambil tanggal saat ini menggunakan kelas LocalDate dan menyimpannya ke dalam variabel currentDate
            String tanggal = currentDate.format(dateFormatter); // Mengubah tanggal menjadi string dengan format yang telah ditentukan dan menyimpannya ke dalam variabel tanggal

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss"); // Membuat objek dari kelas DateTimeFormatter dengan format waktu "hh:mm:ss"
            LocalTime currentTime = LocalTime.now(); // Mengambil waktu saat ini menggunakan kelas LocalTime dan menyimpannya ke dalam variabel currentTime
            String waktu = currentTime.format(timeFormatter); // Mengubah waktu menjadi string dengan format yang telah ditentukan dan menyimpannya ke dalam variabel waktu
                    
            System.out.print("Masukkan Nama Mata kuliah : "); //Menampilkan teks "Masukkan Nama Mata kuliah : "
            String namaMatkul = input.nextLine(); //Membaca input Nama mata kuliah dari pengguna dan menyimpannya dalam variabe namaMatkul.

            int absensi;
            do { //Menggunakan perulangan do-while untuk meminta pengguna memasukkan nilai absensi yang valid (dalam rentang 0-100). Jika nilai yang dimasukkan tidak valid, maka akan ditampilkan pesan kesalahan.
                System.out.print("Masukkan Nilai Absensi : ");
                absensi = input.nextInt();
                if (absensi < 0 || absensi > 100) {
                    System.out.println("Error: Nilai absensi harus berada di antara 0 dan 100.");
                }
            } while (absensi < 0 || absensi > 100); 
            

            int tugas;
            do { //Menggunakan perulangan do-while untuk meminta pengguna memasukkan nilai tugas yang valid (dalam rentang 0-100). Jika nilai yang dimasukkan tidak valid, maka akan ditampilkan pesan kesalahan.
                System.out.print("Masukkan Nilai tugas : ");
                tugas = input.nextInt();
                if (tugas < 0 || tugas > 100) {
                    System.out.println("Error: Nilai tugas harus berada di antara 0 dan 100.");
                }
            } while (tugas < 0 || tugas > 100); 
            

            int uts;
            do { //Menggunakan perulangan do-while untuk meminta pengguna memasukkan nilai UTS yang valid (dalam rentang 0-100). Jika nilai yang dimasukkan tidak valid, maka akan ditampilkan pesan kesalahan.
                System.out.print("Masukkan Nilai uts : ");
                uts = input.nextInt();
                if (uts < 0 || uts > 100) {
                    System.out.println("Error: Nilai uts harus berada di antara 0 dan 100.");
                }
            } while (uts < 0 || uts > 100); 

            int uas;
            do { //Menggunakan perulangan do-while untuk meminta pengguna memasukkan nilai UAS yang valid (dalam rentang 0-100). Jika nilai yang dimasukkan tidak valid, maka akan ditampilkan pesan kesalahan.
                System.out.print("Masukkan Nilai uas : ");
                uas = input.nextInt();
                if (uas < 0 || uas > 100) {
                    System.out.println("Error: Nilai uas harus berada di antara 0 dan 100."); //
                }
            } while (uas < 0 || uas > 100); 
            
            double nilaiAkhir = (absensi * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4); // Mendeklarasikan variabel nilaiAkhir sebagai tipe data double dan menghitung nilai akhir mahasiswa
            String grade = ""; // Mendeklarasikan variabel grade sebagai String untuk menentukan grade yang didapat berdasarkan nilai akhir
            if (nilaiAkhir >= 80) {  // Melakukan seleksi kondisi untuk menentukan grade yang sesuai dengan nilai akhir yang didapat
                grade = "A";
            } else if (nilaiAkhir >= 77) {
                grade = "A-";
            } else if (nilaiAkhir >= 74) {
                grade = "B+";
            } else if (nilaiAkhir >= 71) {
                grade = "B";
            } else if (nilaiAkhir >= 68) {
                grade = "B-";
            } else if (nilaiAkhir >= 64) {
                grade = "C+";
            } else if (nilaiAkhir >= 60) {
                grade = "C";
            } else if (nilaiAkhir >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            
            System.out.println("Mahasiswa dengan data sebagai berikut"); // Menampilkan teks "Mahasiswa dengan data sebagai berikut"
            System.out.println("Nama                     : " + nama); // Menampilkan teks "Nama : " yang diikuti oleh nilai dari variabel nama
            System.out.println("NIM                      : " + nim); // Menampilkan teks "NIM : " yang diikuti oleh nilai dari variabel nim
            System.out.println("Jenis kelamin            : " + jenisKelamin); // Menampilkan teks "Jenis kelamin: " yang diikuti oleh nilai dari variabel       
            System.out.println("Pada Mata Kuliah         : " + namaMatkul); // Menampilkan teks "Pada Mata Kuliah: " yang diikuti oleh nilai dari variabel namaMatkul
            System.out.println("Nilai Akhir Anda         : " + nilaiAkhir); // Menampilkan teks "Nilai Akhir Anda: " yang diikuti oleh nilai dari variabel nilaiAkhir
            if (nilaiAkhir >= 60) { // Memeriksa apakah nilaiAkhir lebih besar atau sama dengan 60, jika ya maka cetak "Lulus", jika tidak maka cetak "Tidak Lulus".
                System.out.println("Keterangan Nilai         : Lulus");
            } else {         
                System.out.println("Keterangan Nilai         : Tidak Lulus");
            }
            System.out.println("Grade Nilai Anda         : " + grade); // Menampilkan teks "Grade Nilai Anda: " yang diikuti oleh nilai dari variabel grade
            System.out.println("Input nilai pada tanggal : " + tanggal + " , " + waktu); // Menampilkan teks "Input nilai pada tanggal: " yang diikuti oleh nilai dari variabel tanggal dan variabel waktu
        
        }
    }
}



