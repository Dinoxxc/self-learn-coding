package Java;

import java.util.*;

class Mahasiswa {
    private String nim;
    private String nama;
    private float nilai;

    public Mahasiswa(String nim, String nama, float nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}

public class PengurutanMahasiswa {
    public static void main(String[] args) {
        Queue<Mahasiswa> mahasiswaQueue = new PriorityQueue<>(Comparator.comparing(Mahasiswa::getNilai).reversed());

        // Menambahkan data mahasiswa ke dalam queue
        mahasiswaQueue.add(new Mahasiswa("19001", "John Doe", 80));
        mahasiswaQueue.add(new Mahasiswa("19002", "Jane Smith", 85));
        mahasiswaQueue.add(new Mahasiswa("19003", "David Johnson", 75));
        mahasiswaQueue.add(new Mahasiswa("19004", "Emma Davis", 90));
        mahasiswaQueue.add(new Mahasiswa("19005", "Michael Wilson", 70));
        mahasiswaQueue.add(new Mahasiswa("19006", "Sophia Brown", 95));
        mahasiswaQueue.add(new Mahasiswa("19007", "Daniel Lee", 65));
        mahasiswaQueue.add(new Mahasiswa("19008", "Olivia Taylor", 92));
        mahasiswaQueue.add(new Mahasiswa("19009", "Matthew Anderson", 88));
        mahasiswaQueue.add(new Mahasiswa("19010", "Ava Martinez", 77));

        System.out.println("Data Mahasiswa sebelum diurutkan:");
        int count = 1;
        for (Mahasiswa mahasiswa : mahasiswaQueue) {
            System.out.println(mahasiswa);
            count++;
        }

        System.out.println("\nData Mahasiswa setelah diurutkan berdasarkan nilai:");
        count = 1;
        while (!mahasiswaQueue.isEmpty()) {
            System.out.println("Nomor: " + count);
            System.out.println(mahasiswaQueue.poll());
            count++;
        }
    }
}
