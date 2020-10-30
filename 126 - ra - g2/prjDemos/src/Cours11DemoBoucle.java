import java.util.Scanner;

public class Cours11DemoBoucle {
    public Cours11DemoBoucle() {
       // compterDe1NVersionFor(10);
       //   compterDeA1NVersionWhile(4);
      //  testerFaireUneLigneDEtoile();
//        System.out.println(faireUneLigneDEtoileWhile(6));
              appuyerSurEspaceETEnterSVP();
    }


    //https://forms.office.com/Pages/ResponsePage.aspx?id=kh_mliiINEWdiQ8wAbj6O7Yl94a5vktNnIYA5HZIlHxUQ0dHU09HTDhEUVNMRzhFOUNTSVJENlNXQy4u

    //Écrire une méthode qui demande à l'usager d’appuyer sur la barre d’espacement puis Enter tant et aussi longtemps qu’il ne le fait pas.
    public void appuyerSurEspaceETEnterSVP() {
        String strSaisie;
        // double, int, boolean & char (Type simple) on peut utiliser le == pas les String (type complexe)

        //On doit faire la boucle avant d'évaluer la condition
        do {
            strSaisie = lireString("SVP Appuyer sur la barre d’espacement puis Enter : ");
        }
        while (!strSaisie.equals(" "));

        System.out.println("Merci d'avoir appuyé sur l'espace!");
    }


    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    //afficher que des vrai si les tests passes
    private void testerFaireUneLigneDEtoile() {
        String ligne; //type complexe
        int i;  //type simple
        char c; //type simple
        boolean b; //type simple
        double d; //type simple


        ligne = faireUneLigneDEtoileFor(0);
        System.out.println(ligne.equals(""));
        ligne = faireUneLigneDEtoileFor(1);
        System.out.println(ligne.equals("*"));
        ligne = faireUneLigneDEtoileFor(3);
        System.out.println(ligne.equalsIgnoreCase("***"));  //

        System.out.println(faireUneLigneDEtoileFor(4));
    }

    //Écrire une méthode qui retourne une String d'étoiles dont la longueur est spécifiée en argument
    private String faireUneLigneDEtoileFor(int longueur) {
        String ligneEtoiles = "";
        for (int cpt = 0; cpt < longueur; cpt += 1) {
            ligneEtoiles += "*";
        }

        return ligneEtoiles;
    }

    //Écrire une méthode qui retourne une String d'étoiles dont la longueur est spécifiée en argument
    private String faireUneLigneDEtoileWhile(int longueur) {
        String ligneEtoiles = "";
        int cpt = 0;
        while (cpt < longueur) {
            ligneEtoiles += "*";
            cpt += 1;
        }

        return ligneEtoiles;
    }


    private void compterDeA1NVersionWhile(int nb) {
        int cpt; //compteur xxx

        cpt = 1; //partie 1 du for
        while (cpt <= nb) { //répéter la boucle tant que la condition est vrai (Partie 2 dur for)
            System.out.println(cpt); //intruction répétée (Boucle du for)
            cpt += 1; // incrémentation du compteur (Partie 3 du for)
        }
    }


    private void compterDe1NVersionFor(int nb) {
        //Boucle
        // for (initialisation du compteur; conditio qui doit être vrai pour entrer dans la boucle et la poursuivre;
        // 1- exécuter la premieère partie du for
        // 2- vérfier c'Est cérifier la condition: (2 partie du for) :
        //      - si c'Est vrai on exécute l'intérieur du for
        //      - si c'Est faux on sort de la boucle
        // 3- on exécécute la 3e partie du for. qui est normalement une incrémentation.
        // 4- On retounre faire 2

        for (int cpt = 0; cpt <= nb; cpt ++) {
            System.out.println(cpt); //intruction répétée
        }

        //   System.out.println(cpt); //la variable compteur n'existe plus

    }

    public static void main(String[] args) {
        new Cours11DemoBoucle();
    }
}
