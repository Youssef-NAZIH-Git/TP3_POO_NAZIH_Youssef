public class mainApp {
    public static void main(String[] args){
        Adherent adherent = new Adherent(5);
        adherent.setNom("Adherant1");
        adherent.setPrenom("Prenom1");
        adherent.setAge(30);
        adherent.setEmail("Adherant1@enset-media.ac.ma");
        adherent.setTel("0612341234");

        Auteur auteur = new Auteur(0);
        auteur.setNom("auteur");
        auteur.setPrenom("prenom2");
        auteur.setAge(50);
        auteur.setEmail("auteur@enset-media.ac.ma");
        auteur.setTel("0656785678");

        Livre livre = new Livre(0, "Titre", auteur);

        System.out.println(adherent.toString());
        System.out.println(livre.toString());

    }
}
