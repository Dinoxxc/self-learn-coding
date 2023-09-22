package Java.Plant;

public class Anggrek extends Plant {
    private boolean tergantung;
  
    public Anggrek() {
        super();
        tergantung = true;
    }

    public boolean isTergantung() {
        return tergantung;
    }

    public void setTergantung(boolean tergantung) {
        this.tergantung = tergantung;
    }
  
    @Override
    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 2);
            setJumlahPupuk(getJumlahPupuk() - 1);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }
  
    @Override
    public void displayPlant() {
        super.displayPlant();
        System.out.println("Kekhususan Anggrek: Tergantung pada media pendukung");
    }
}