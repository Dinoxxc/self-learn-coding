package Java;

import java.time.LocalTime;
import java.util.Scanner;

public class Waktu {
    private int jam, menit, detik;

    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public void tambahWaktu(Waktu waktuLain) {
        detik += waktuLain.detik;
        menit += waktuLain.menit;
        jam += waktuLain.jam;

        if (detik >= 60) {
            detik -= 60;
            menit++;
        }

        if (menit >= 60) {
            menit -= 60;
            jam++;
        }

        if (jam >= 24) {
            jam -= 24;
        }
    }

    public void displayWaktu() {
        String sDetik, sMenit, sJam;
        if (detik < 10) {
            sDetik = "0" + detik;
        } else {
            sDetik = Integer.toString(detik);
        }

        if (menit < 10) {
            sMenit = "0" + menit;
        } else {
            sMenit = Integer.toString(menit);
        }

        if (jam < 10) {
            sJam = "0" + jam;
        } else {
            sJam = Integer.toString(jam);
        }

        System.out.println(sJam + ":" + sMenit + ":" + sDetik);
    }

    public static void main(String[] args) {
        LocalTime waktuSekarang = LocalTime.now().truncatedTo(java.time.temporal.ChronoUnit.SECONDS);
        System.out.println("Waktu saat ini: " + waktuSekarang);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan waktu yang ingin ditambahkan (format: jam:menit:detik): ");
            String waktuLainInput = scanner.nextLine();
            String[] waktuLainArr = waktuLainInput.split(":");
            int jamLain = Integer.parseInt(waktuLainArr[0]);
            int menitLain = Integer.parseInt(waktuLainArr[1]);
            int detikLain = Integer.parseInt(waktuLainArr[2]);
            Waktu waktu1 = new Waktu(waktuSekarang.getHour(), waktuSekarang.getMinute(), waktuSekarang.getSecond());
            Waktu waktuLain = new Waktu(jamLain, menitLain, detikLain);

            waktu1.tambahWaktu(waktuLain);
            System.out.print("Waktu setelah ditambahkan: ");
            waktu1.displayWaktu();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
