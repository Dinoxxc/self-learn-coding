package Java.EmployeeData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class data_kepegawaian {
    public static void main(String[] args) {
        String pathToFile = "E:\\College\\Programming Code\\Java\\EmployeeData\\data_pegawai.txt"; // Ganti dengan path absolut ke file data_pegawai.txt
        ArrayList<Pegawai> daftarPegawai = bacaDataPegawai(pathToFile);

               // Menampilkan data pegawai, dengan Manajer terlebih dahulu diikuti oleh Programmer
        System.out.println("Data Manajer:");
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai instanceof Manajer) {
                pegawai.tampilData();
                System.out.println();
            }
        }

        System.out.println("Data Programmer:");
        for (Pegawai pegawai : daftarPegawai) {
            if (pegawai instanceof Programmer) {
                pegawai.tampilData();
                System.out.println();
            }
        }
    }

    // Method untuk membaca data pegawai dari file dan mengembalikan ArrayList dengan objek Pegawai
    private static ArrayList<Pegawai> bacaDataPegawai(String pathToFile) {
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        try {
            File file = new File(pathToFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String nama = data[0];
                int gajiPokok = Integer.parseInt(data[1]);
                int jenisPegawai = Integer.parseInt(data[2]);
                int dataTambahan = Integer.parseInt(data[3]);

                if (jenisPegawai == 2) { // Manajer
                    Manajer manajer = new Manajer(nama, gajiPokok, dataTambahan);
                    daftarPegawai.add(manajer);
                } else if (jenisPegawai == 1) { // Programmer
                    Programmer programmer = new Programmer(nama, gajiPokok, dataTambahan);
                    daftarPegawai.add(programmer);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return daftarPegawai;
    }
}
