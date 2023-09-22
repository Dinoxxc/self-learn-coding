package Java;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah baris: ");
            int rows = input.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
        }
    }
}