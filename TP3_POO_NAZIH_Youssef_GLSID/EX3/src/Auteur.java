public class Auteur extends Personne {
    private int numAuteur;
    
    public Auteur(int numAuteur){
        super();
        this.numAuteur = numAuteur;
    }

    public String toString(){
        return super.toString() + "\nNum Auteur: " + numAuteur;
    }
}
