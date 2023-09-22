package Java;

import java.util.Scanner;

public class AmbilNama {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        // Meminta input NIM dan nama dari pengguna
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        // Menampilkan NIM dan nama
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        
        // Memperoleh 4 karakter terakhir dari kata pertama pada nama
        String[] namaArray = nama.split("\\s+");
        String namaPertama = namaArray[0];
        String namaAkhir;
        if (namaPertama.length() <= 4) {
          namaAkhir = namaPertama;
        } else {
          namaAkhir = namaPertama.substring(namaPertama.length()-4);
        }
        
        // Menampilkan 4 karakter terakhir dari kata pertama pada nama
        System.out.println("4 karakter terakhir dari kata pertama pada nama: " + namaAkhir);
    }
  }
}

//test
