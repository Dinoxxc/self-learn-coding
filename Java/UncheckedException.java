package Java;

public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int index = 4; // Indeks yang tidak valid

        try {
            int value = getElement(numbers, index);
            System.out.println("Elemen pada indeks " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Terjadi kesalahan: Indeks array diluar batas!");
        }
    }

    public static int getElement(int[] array, int index) {
        return array[index]; // Mencoba mengakses indeks yang tidak valid
    }
}
