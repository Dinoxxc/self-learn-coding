package Java;

import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        int a = 10;
        int b = 0;
        
        try {
            int divisionResult = divideNumbers(a, b);
            System.out.println("Hasil pembagian: " + divisionResult);
        } catch (ArithmeticException exception) {
            System.out.println("Terjadi kesalahan: Pembagian oleh nol!");
        }
    }

    public static int divideNumbers(int dividend, int divisor) throws IOException {
        if (divisor == 0) {
            throw new IOException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }
}
