public class Personne{
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    public Personne(String nom, String prenom, String email, String tel, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String toString(){
        return "Nom: " + nom + "\nPrenom: " + prenom + "\nE-Mail: " + email + "\nNum Tele: " + tel + "\nAge: " + age; 
    }


    public Personne(){}
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAge(int age) {
        this.age = age;
    }
}