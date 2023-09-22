package Java.Plant;

public class Plant {
    private int statusTumbuh; // 0-4
    private int jumlahAir;
    private int jumlahPupuk;

    public Plant() {
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }

    public int getJumlahAir() {
        return jumlahAir;
    }

    public void setJumlahAir(int n) {
        jumlahAir = n;
    }

    public int getJumlahPupuk() {
        return jumlahPupuk;
    }

    public void setJumlahPupuk(int n) {
        jumlahPupuk = n;
    }

    public void setStatusTumbuh(int n) {
        statusTumbuh = n;
    }

    public void beriAir() {
        jumlahAir++;
        cekKondisiTumbuh();
    }

    public void beriPupuk() {
        jumlahPupuk++;
        cekKondisiTumbuh();
    }

    public void cekKondisiTumbuh() {
        // cek kecukupan air dan pupuk
        if (jumlahAir >= 3 && jumlahPupuk >= 1) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (statusTumbuh < 4) {
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk - 1;
            statusTumbuh++;
        }
    }

    public void displayPlant() {
        System.out.println(getStatusTumbuhText());
        System.out.println("Jumlah Air: " + jumlahAir);
        System.out.println("Jumlah Pupuk: " + jumlahPupuk);
    }

    public String getStatusTumbuhText() {
        switch (statusTumbuh) {
            case 0:
                return "Benih";
            case 1:
                return "Tunas";
            case 2:
                return "Tanaman Kecil";
            case 3:
                return "Tanaman Dewasa";
            case 4:
                return "Berbunga";
            default:
                return "Status Tumbuh tidak valid";
        }
    }

    public int getStatusTumbuh() {
        return statusTumbuh;
    }

    public String getImagePath() {
        String tImagePath;
        switch (statusTumbuh) {
            case 0:
                tImagePath = "img/seed.png";
                break;
            case 1:
                tImagePath = "img/sprout.png";
                break;
            case 2:
                tImagePath = "img/small.png";
                break;
            case 3:
                tImagePath = "img/big.png";
                break;
            case 4:
                tImagePath = "img/blossom.png";
                break;
            default:
                tImagePath = "img/unknown.png";
                break;
        }
        return tImagePath;
    }
}
