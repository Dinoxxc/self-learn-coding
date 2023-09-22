package Java.Plant;

public class Melati extends Plant {
    private boolean harum;

    public Melati() {
        super();
        harum = true;
    }

    public boolean isHarum() {
        return harum;
    }

    public void setHarum(boolean harum) {
        this.harum = harum;
    }

    @Override
    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 1);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    @Override
    public void displayPlant() {
        super.displayPlant();
        System.out.println("Kekhususan Melati: Memiliki aroma harum");
    }
}