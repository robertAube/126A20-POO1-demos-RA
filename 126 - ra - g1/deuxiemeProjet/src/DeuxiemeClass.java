//Robert Aubé
//Classe
public class DeuxiemeClass {

    //Constructeur : (a le même nom que la classe) (ALT-INSERT)
    public DeuxiemeClass() {
        System.out.println("Je suis dans le constructeur");
        // afficherMonNomEtPrenom();
        //calculerUnPlusUn();
        calculerAgeDuPereAQuelquUnV2();
        //  calculerAgeDuPereALucV2();
    }

    //Luc a 15 ans.
    //Père de Luc est 3 X plus âgé
    //Quelle est l'âge de son père.
    private void calculerAgeDuPereALucV1() {
        System.out.print("Le père à Luc a ");
        System.out.print(15 * 3);
        System.out.println(" ans.");
    }

    //Luc a 15 ans.
    //Père de Luc est 3 X plus âgé
    //Quelle est l'âge de son père.
    private void calculerAgeDuPereALucV2() {
        //int = Type
        //ageLuc : nom de la variable
        int ageLuc;
        int agePapaLuc;

        //affectation
        ageLuc = 15;
        agePapaLuc = ageLuc * 3;

        //Le + fait une concaténation de chaîne. (concaténation : mettre bout à bout.)
        System.out.println("Luc a " + ageLuc + " ans.");
        System.out.print("Le père à Luc a ");
        System.out.print(agePapaLuc);
        System.out.println(" ans.");

    }


    //QuelquUn a 15 ans.
    //Père de QuelquUn est 3 X plus âgé
    //Quelle est l'âge de son père.
    private void calculerAgeDuPereAQuelquUnV1() {
        int ageEnfant;
        int agePapa;
        String prenom;

        ageEnfant = 15;
        agePapa = ageEnfant * 3;
        prenom = "Louise";

        //Le + fait une concaténation de chaîne. (concaténation : mettre bout à bout.)
        System.out.println(prenom + " a " + ageEnfant + " ans.");
        System.out.print("Le père à " + prenom + " a ");
        System.out.print(agePapa);
        System.out.println(" ans.");

    }

    //QuelquUn a 15 ans.
    //Père de QuelquUn est 3 X plus âgé
    //Quelle est l'âge de son père.
    private void calculerAgeDuPereAQuelquUnV2() {
        double ageEnfant;
        double agePapa;
        String prenom;
        String affichage;

        ageEnfant = 15;
        agePapa = ageEnfant * 3.2451;
        prenom = "Louise";

        affichage = prenom + " a " + ageEnfant + " ans.\n" + "Age du papa = " + agePapa + " ans.";
        System.out.println(affichage);
    }


    private void calculerUnPlusUn() {
        System.out.print("1 + 1 = ");
        //addition de 1 + 1
        System.out.println(1 + 1);
    }

    //méthode
    private void afficherMonNomEtPrenom() {
        //appel  : afficherMonNom()
        afficherMonNom();
        afficherMonPrenom();
    }

    //méthode
    private void afficherMonPrenom() {
        System.out.println("Robert");
    }

    //méthode
    private void afficherMonNom() {
        System.out.println("Aubé");
    }

    //Live template : main
    public static void main(String[] args) {

        //Live template : sout
        System.out.println("Boujour le monde!!!!");
        System.out.println("Boujour LES AMIS d'amérique!!!!");

        //intanciation: appel au constructeur de la classe DeuxiemeClass
        new DeuxiemeClass();
        // new DeuxiemeClass();

    }
}
