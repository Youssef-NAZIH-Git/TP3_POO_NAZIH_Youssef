public class MachineProduction{
    private int id;
    private int nombreProduits;
    private static int prochainId;
    private static int totalProduits;
    private static int plafondProduction;

    public MachineProduction(){
        id = prochainId + 1;
        prochainId++;
        nombreProduits = 0;
    }

    public static void setPlafondProduction(int plafond){
        plafondProduction = plafond;
    }

    public boolean produire(int quantite){
        if (quantite + totalProduits > plafondProduction){
            return false;
        }
        totalProduits += quantite;
        nombreProduits += quantite;
        return true;
    }
    
    public static int getTotalProduits(){
        return totalProduits;
    }

    public int getId(){
        return this.id;
    }
    public int getNombrePrdt(){
        return this.nombreProduits;
    }
}