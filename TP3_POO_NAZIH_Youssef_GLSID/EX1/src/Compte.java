public class Compte {

    // Question 1
    private String numero;
    private double solde;
    public static int nbCompte;
    
    // Question 2
    public Compte(){
        this.numero = "";
        this.solde = 0;
        nbCompte++;
    }

    // Question 3
    
    public String getNumero(){
        return numero;
    }

    public double getSolde(){
        return solde;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setSolde(double solde){
        this.solde = solde;
    }

    // Question 4
    public void deposer(double montant){
        solde += montant;
    }

    // Question 5
    public void retirer(double montant){
        if (montant > solde){
            System.out.println("Erreur, solde insuffisant!");
            return;
        }
        solde -= montant;
    }

    // Question 6
    public void afficherCompteInfo(){
        System.out.println("Numero: " + numero);
        System.out.println("Solde: " + solde);
    }

    // Question 7
    public void afficherNbComptes(){
        System.out.println("Nombre de comptes: " + nbCompte);
    }
}
