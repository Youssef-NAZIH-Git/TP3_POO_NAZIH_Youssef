public class Adherent extends Personne{
    private int numAdherent;

    public Adherent(int numAdherent){
        super();
        this.numAdherent = numAdherent;
    }

    public String toString(){
        return super.toString() + "\nNum Adherant: " + numAdherent;
    }
}
