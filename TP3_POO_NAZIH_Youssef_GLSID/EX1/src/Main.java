

public class Main{
    public static void main(String[] args){
        Compte cpt = new Compte();
        cpt.setNumero("1234");
        cpt.setSolde(500.);

        System.out.println(cpt.getNumero());
        System.out.println(cpt.getSolde());

        cpt.deposer(100);
        System.out.println(cpt.getSolde());

        cpt.retirer(700);
        System.out.println(cpt.getSolde());

        cpt.retirer(200);
        System.out.println(cpt.getSolde());

        cpt.afficherCompteInfo();

        cpt.afficherNbComptes();

        Compte cpt2 = new Compte();

        cpt.afficherNbComptes();
    }


}