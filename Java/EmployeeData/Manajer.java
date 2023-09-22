package Java.EmployeeData;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gajiPokok, int tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }

    public Object getNama() {
        return null;
    }

    public Object getGajiPokok() {
        return null;
    }

    public Object getTunjangan() {
        return null;
    }
}
