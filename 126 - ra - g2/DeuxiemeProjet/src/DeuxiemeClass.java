public class DeuxiemeClass {
    //Constructeur - méthode a le même le même nom que la classe
    public DeuxiemeClass() {
        System.out.println("Je suis dans le constructeur");
        afficherPrenomEtNom();
    }


    //méthode
    private void afficherPrenomEtNom() {
        afficherNom();
        afficherPrenom();
    }

    //méthode
    private void afficherNom() {
        System.out.println("Aubé");
    }

    //méthode
    private void afficherPrenom() {
        System.out.println("Robert");
    }

    public static void main(String[] args) {
        System.out.println("Bonjour le monde!");
        //instanciation
        new DeuxiemeClass();
    }
}



