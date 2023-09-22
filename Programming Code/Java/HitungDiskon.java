package Java;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HitungDiskon {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input nama pelanggan, tanggal, dan jam dengan real-time
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String tanggal = now.format(formatter);

            System.out.print("Masukkan total belanja: ");
            double totalBelanja = scanner.nextDouble();
            
            // Output nama pelanggan, tanggal, dan jam
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Tanggal: " + tanggal);
            
            if (totalBelanja > 1000000) {
                double diskon = hitungDiskon(totalBelanja);
                double totalBayar = totalBelanja - diskon;
                System.out.printf("Diskon 20%%: Rp %.2f%n", diskon);
                System.out.printf("Total bayar: Rp %.2f%n", totalBayar);
            } else {
                System.out.println("Total bayar: Rp " + totalBelanja);
            }

        }
    }
    
    public static double hitungDiskon(double totalBelanja) {
        double diskon = 0.2 * totalBelanja;
        return diskon;
    }

}
