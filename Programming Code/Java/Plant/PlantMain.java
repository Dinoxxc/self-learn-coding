package Java.Plant;

public class PlantMain {
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.beriAir();
        plant.beriPupuk();
        plant.displayPlant();

        Anggrek anggrek = new Anggrek();
        anggrek.setTergantung(true);
        anggrek.beriAir();
        anggrek.beriAir();
        anggrek.beriPupuk();
        anggrek.displayPlant();

        Mawar mawar = new Mawar();
        mawar.setBerduri(true);
        mawar.beriAir();
        mawar.beriAir();
        mawar.beriAir();
        mawar.beriPupuk();
        mawar.displayPlant();

        Melati melati = new Melati();
        melati.setHarum(true);
        melati.beriAir();
        melati.beriAir();
        melati.beriPupuk();
        melati.displayPlant();
    }
}
