package Java.Plant;

public class Mawar extends Plant {
    private boolean berduri;

    public Mawar() {
        super();
        berduri = true;
    }

    public boolean isBerduri() {
        return berduri;
    }

    public void setBerduri(boolean berduri) {
        this.berduri = berduri;
    }

    @Override
    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 4);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    @Override
    public void displayPlant() {
        super.displayPlant();
        System.out.println("Kekhususan Mawar: Memiliki duri");
    }
}