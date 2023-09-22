package Java;

import java.util.Scanner; // import kelas Scanner dari package java.util

public class HitungPPN {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama kamu: "); // meminta input nama dari pengguna
            String nama = input.nextLine(); // membaca input nama dari pengguna

            System.out.print("Masukkan total pembelian: "); // meminta input total pembelian dari pengguna
            double totalPembelian = input.nextDouble(); // membaca input total pembelian dari pengguna

            double ppn = totalPembelian * 0.1; // menghitung PPN sebesar 10% dari total pembelian dan simpan dalam variabel ppn

            double totalHarga = totalPembelian + ppn; // menghitung total harga dengan menambahkan PPN ke total pembelian

            System.out.println("Halo Kak " + nama + ","); // menampilkan nama pengguna
            System.out.println("Total pembelian kamu adalah: Rp" + totalPembelian); // menampilkan total pembelian
            System.out.println("Ini merupakan total pembelian setelah dikenakan PPN: Rp" + totalHarga); // menampilkan menampilkan total pembelian setelah dikenakan PPN
        }
    }
}
