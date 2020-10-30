import java.util.Scanner;

public class Formatif3RA {
    public Formatif3RA() {

        demanderEtAfficherInfoRectangle();
        tester();
    }

    private void tester() {
        testerLireString();

        demoParseInt();
        testerCalcculerAir();
        testerLireEntier();
        afficherInfoRectangle("bleu", 3, 7);
    }


    private void demanderEtAfficherInfoRectangle() {
        int longueur;
        int largeur;
        String couleur;
        longueur = lireEntier("est la longueur de votre rectangle?");
        largeur = lireEntier("Quelle est la largeur de votre rectangle?");
        couleur = lireString("Quelle est la couleur de votre rectangle? ");
        afficherInfoRectangle(couleur, longueur, largeur);
    }

    private void afficherInfoRectangle(String couleur, int longueur, int largeur) {
        System.out.println("Le rectangle a une longueur de " + longueur + " et une largeur de " + largeur +".");
        System.out.println("Le rectangle est " + couleur);
        System.out.println("Son périmètre est de " + calculerPerimetre(longueur, largeur));
        System.out.println("Son air est de " + calculerAire(longueur,largeur));
    }

    private void testerCalcculerAir() {
        System.out.println("L'air d'un rectangle de 2 par 3 est " + calculerAire(2,3) + ".");
    }

    private int calculerAire(int longueur, int largeur) {
        return longueur * largeur;
    }

    private int calculerPerimetre(int longueur, int largeur) {
        int perimetre;
        perimetre = 2 * (largeur + longueur);
        return perimetre;
    }

    private void testerLireEntier() {
        int nombre;
        nombre = lireEntier("Donner un nombre? ");
        System.out.println("Ce nombre est " + nombre);

        System.out.println(lireEntier("Quel âge avez-vous ? "));
    }
    private int lireEntier(String question) {
        int reponse = 0;
        String strReponse;

        strReponse = lireString(question);
        reponse = Integer.parseInt( strReponse );

        return reponse;
    }

    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        afficherQuestion(question);
        reponse = sc.nextLine();

        return reponse;
    }

    public void testerLireString() {
        //Exemple 1
        System.out.println(lireString("Quel est votre prénom ? "));

        //Exemple 2
        String  reponse = lireString("Où allez-vous ? ");
        System.out.println(reponse);

        //Exemple 3
        lireString("À quel cégep tu vas ? ");
        System.out.println("Intéressant...");
    }


    public void demoParseInt() {
        String strValeur = "2020";
        int intValeur;

        intValeur = Integer.parseInt( strValeur );

        System.out.println("La chaîne est " + strValeur);
        System.out.println("L'entier est " + intValeur);
        System.out.println("Si on ajoute 1 à l'entier, on a : " + (intValeur + 1));
        System.out.println("Si on ajoute 1 à la string, on a : " + (strValeur + 1));
    }


    private void afficherQuestion(String question) {
        System.out.println("************************************");
        System.out.print(question);
    }

    public static void main(String[] args) {
        new Formatif3RA();
    }
}
