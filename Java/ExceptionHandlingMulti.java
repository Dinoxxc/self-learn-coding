package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nilai a: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan nilai b: ");
            int b = scanner.nextInt();

            // Penambahan
            int additionResult = a + b;
            System.out.println("Hasil penambahan: " + additionResult);

            // Pengurangan
            int subtractionResult = a - b;
            System.out.println("Hasil pengurangan: " + subtractionResult);

            // Perkalian
            int multiplicationResult = a * b;
            System.out.println("Hasil perkalian: " + multiplicationResult);

            // Pembagian
            int divisionResult = a / b;
            System.out.println("Hasil pembagian: " + divisionResult);

        } catch (ArithmeticException | InputMismatchException exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("Terjadi kesalahan: Pembagian oleh nol!");
            } else if (exception instanceof InputMismatchException) {
                System.out.println("Terjadi kesalahan: Masukan tidak valid!");
            }
        } finally {
            scanner.close();
            System.out.println("Eksekusi blok finally");
        }
    }
}