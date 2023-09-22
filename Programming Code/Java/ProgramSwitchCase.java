package Java;

import java.util.Scanner;

public class ProgramSwitchCase {
    public static void main(String[] args) {
        int kode;
        String nmbarang;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Kode Barang [1...3] : ");
            kode = input.nextInt();
        }

        if (kode == 1) {
            nmbarang = "Meja";
        } else if (kode == 2) {
            nmbarang = "Kursi";
        } else if (kode == 3) {
            nmbarang = "Lemari";
        } else {
            nmbarang = "Anda Salah Memasukkan Kode";
        }
        
        System.out.println("\nKode yang anda Pilih : " + nmbarang);
    }
}
