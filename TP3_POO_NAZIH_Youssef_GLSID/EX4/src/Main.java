public class Main {
    public static void main(String[] args){
        Vehicule vehicule = new Vehicule("Vehicule", 10_000);
        Voiture voiture = new Voiture("Voiture", 30_000, "Modele", 2005);
        Moto moto = new Moto("Moto", 5000, "Marque", "300HP");
        Avion avion = new Avion("Avion",100_000_000, "Boeing", 600);

        vehicule.emettreSon();
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        System.out.println("====");

        vehicule.afficherInformations();
        voiture.afficherInformations();
        moto.afficherInformations();
        avion.afficherInformations();
    }
}
