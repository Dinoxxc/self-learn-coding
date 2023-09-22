package Java;

import java.time.Year; // import kelas Year dari package java.time
import java.util.Scanner; // import kelas Scanner dari package java.util

public class HitungUsia {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama anda: "); // meminta input nama dari pengguna
            String nama = input.nextLine(); // membaca input nama dari pengguna

            System.out.print("Masukkan tahun lahir anda: "); // meminta input tahun lahir dari pengguna
            int tahunLahir = input.nextInt(); // membaca input tahun lahir dari pengguna

            int tahunSekarang = Year.now().getValue(); // mendapatkan tahun sekarang dari kelas Year
            int usia = tahunSekarang - tahunLahir; // menghitung usia dari pengguna

            System.out.println("Nama saya adalah " + nama); // menampilkan nama pengguna
            System.out.println("Saya lahir pada tahun " + tahunLahir); // menampilkan tahun lahir pengguna
            System.out.println("Jadi usia saya saat ini adalah antara " + usia + " tahun"); // menampilkan usia pengguna
        }
    }
}