public class Vehicule{
    private String nom;
    private double prix;

    public Vehicule(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon(){
        System.out.println("Le vehicule emet un son inconnu");
    }
    public void afficherInformations(){
        System.out.println("\n\n\n====\nNom: " + nom + "\nPrix: " + prix + "\n");
    }
}