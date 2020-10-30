import java.util.Scanner;

public class Cours11DemoBoucle {
    public Cours11DemoBoucle() {
        //compterDe1AN_VersionWhile(6);
        // compterDe1AN_VersionFor(0);
        //compterDe1AN_ErreurBoucleInfini(4);
//        testerGetUneLigneDEtoile_For();

        appuyerSurEscpaceEtEnterSVPFV2();
    }


    //Écrire une méthode qui demande à l'usager d’appuyer sur la barre d’espacement puis Enter tant et aussi longtemps qu’il ne le fait pas.
    private void appuyerSurEscpaceEtEnterSVPFV2() {
        String strSaisie;

        do {
            strSaisie = lireString("SVP Appuyer sur la barre d’espacement puis Enter : ");
        }
        while (!strSaisie.equals(" "));

    }


    //Écrire une méthode qui demande à l'usager d’appuyer sur la barre d’espacement puis Enter tant et aussi longtemps qu’il ne le fait pas.
    private void appuyerSurEscpaceEtEnterSVPV1() {
        String strSaisie;

        strSaisie = lireString("SVP Appuyer sur la barre d’espacement puis Enter : ");

        while (!strSaisie.equals(" ")) {
            strSaisie = lireString("SVP Appuyer sur la barre d’espacement puis Enter : ");
        }

    }


    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }


    //devrait retourner que des true
    private void testerGetUneLigneDEtoile_For() {
        String lEtoile; //type complexe le == ne fonctionne pas, il faut utiliser equals (voir ci-dessous)
        int i; // type simple == fonctionne
        boolean b; // type simple == fonctionne
        double d; // type simple == fonctionne
        char c; // type simple == fonctionne

        lEtoile = getUneLigneDEtoileFor(3);
        System.out.println(lEtoile.equals("***")); //
        lEtoile = getUneLigneDEtoileFor(0);
        System.out.println(lEtoile.equals("")); //
        lEtoile = getUneLigneDEtoileFor(-1);
        System.out.println(lEtoile.equals("")); //
        lEtoile = getUneLigneDEtoileFor(4);
        System.out.println(lEtoile.equals("****"));
    }

    //Écrire une méthode qui retourne une String d'étoiles dont la longueur est spécifiée en argument.
    private String getUneLigneDEtoileFor(int longueur) {
        String ligneEtoiles = "";

        for (int cpt = 0; cpt < longueur; cpt++) {
            ligneEtoiles += "*";
        }

        return ligneEtoiles;
    }

    //Écrire une méthode qui retourne une String d'étoiles dont la longueur est spécifiée en argument.
    private String getUneLigneDEtoileWhile(int longueur) {
        String ligneEtoiles = "";
        int cpt;

        cpt = 0;
        while (cpt < longueur) {
            ligneEtoiles += "*"; //concaténation d'une String
            cpt += 1;
        }

        return ligneEtoiles;
    }


    private void compterDe1AN_VersionFor(int nbMax) {
        //(initialisation;condition;incrémentation)
        for (int cpt = 1; cpt <= nbMax; cpt += 1) {
            System.out.println(cpt);
        }
    }

    private void compterDe1AN_VersionWhile(int nbMax) {
        int cpt;

        cpt = 1; //partie 1 du for
        while (cpt <= nbMax) { //partie 2 du for
            System.out.println(cpt); //contenu de la boucle du for
            cpt += cpt; //partie 3 du for
        }
    }

    private void compterDe1AN_ErreurBoucleInfini(int nbMax) {
        int cpt;

        cpt = 1; //partie 1 du for
        while (cpt <= nbMax) { //partie 2 du for
            System.out.println(cpt); //contenu de la boucle du for
        }
    }

    public static void main(String[] args) {

        new Cours11DemoBoucle();
    }
}
