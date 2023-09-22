package Java.MathOperation;

import java.util.Scanner;

public class MainOperation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan A: ");
            double bilanganA = scanner.nextDouble();

            System.out.print("Masukkan bilangan B: ");
            double bilanganB = scanner.nextDouble();

            Operation[] operations = new Operation[4];
            operations[0] = new Addition(bilanganA, bilanganB);
            operations[1] = new Subtraction(bilanganA, bilanganB);
            operations[2] = new Multiplication(bilanganA, bilanganB);
            operations[3] = new Division(bilanganA, bilanganB);

            for (Operation op : operations) {
                double result = op.calculate();
                if (op instanceof Addition) {
                    System.out.println("Hasil Pertambahan: " + result);
                } else if (op instanceof Subtraction) {
                    System.out.println("Hasil Pengurangan: " + result);
                } else if (op instanceof Multiplication) {
                    System.out.println("Hasil Perkalian: " + result);
                } else if (op instanceof Division) {
                    System.out.println("Hasil Pembagian: " + result);
                }
            }
        }
    }
}

