package Java.EmployeeData;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gajiPokok, int bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }

    public Object getNama() {
        return null;
    }

    public Object getGajiPokok() {
        return null;
    }

    public Object getBonus() {
        return null;
    }
}
