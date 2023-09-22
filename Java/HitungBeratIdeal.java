package Java;

import java.util.Scanner;

public class HitungBeratIdeal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan tinggi badan (cm): ");
            double tinggi = input.nextDouble() / 100; // konversi dari cm ke m
            
            System.out.print("Masukkan jenis kelamin (P/W): ");
            char jenisKelamin = input.next().charAt(0);
            
            double beratBadanIdeal;
            if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                beratBadanIdeal = 22 * Math.pow(tinggi, 2);
            } else if (jenisKelamin == 'W' || jenisKelamin == 'w') {
                beratBadanIdeal = 20.8 * Math.pow(tinggi, 2);
            } else {
                System.out.println("Jenis kelamin tidak valid");
                return;
            }
            
            System.out.println("Berat badan ideal Anda adalah " + beratBadanIdeal + " kg");
        }
    }
}
