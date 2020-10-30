import java.util.Scanner; //librairie nécessaire pour lire des caractères

public class Formatif3 {
    Formatif3() {
        testerAfficherInfoRectangle();
        demanderEtAfficherInfoRectangle();
        test2();
    }

    public void test1() {
        System.out.println(lireString("Quel est votre nom ? "));
        demoParseInt();
        System.out.println(lireEntier("Quel âge avez-vous ? "));
        System.out.println("L'air d'un rectangle de 2 par 3 est " + calculerAireRectangle(2, 3) + ".");
    }

    public void test2() {
        String q = "Quelle est votre couleur favorite?";
        afficherQuestion("Quelle est votre couleur favorite?");
        afficherQuestion("Combien d'heure avez vous dormis la nuit passée?");
        afficherQuestion("Pour qui allez vous voter à la prochaine élection?");
        afficherQuestion("Quelle est votre nom?");

        String  reponse = lireString("Où allez-vous ? ");
        System.out.println(reponse);

    }


    public void afficherQuestion(String question) {
        System.out.println(question);
    }


    public String lireString(String question) {
        Scanner sc; //Instance de l'utilitaire de lecture
        String reponse;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        afficherQuestion(question);
        reponse = sc.nextLine(); //lecture de la reponse

        return reponse;
    }

    /**
     * Lit un entier au clavier.
     *
     * @param question
     * @return
     */
    public int lireEntier(String question) {
        int reponse;

        String strLu = lireString(question);
        reponse = Integer.parseInt(strLu);
        return reponse;
    }

    public void demoParseInt() {
        String strValeur = "2020";
        int intValeur;

        System.out.println("Integer.parseInt est une méthode qui convertit une chaine en variable int:");
        intValeur = Integer.parseInt(strValeur);

        System.out.println("La chaine est " + strValeur);
        System.out.println("L'entier est " + intValeur);
        System.out.println("Si on ajoute 1 à l'entier, on a : " + (intValeur + 1));
        System.out.println("Si on ajoute 1 à la string, on a : " + (strValeur + 1));

        //Integer.parseInt( "1a23" );
    }

    public int calculerAireRectangle(int longueur, int largeur) {
        return (longueur * largeur);
    }

    private int calculerPerimetreRectangle(int longueur, int largeur) {
        return (2 * (longueur + largeur));
    }

    public void afficherInfoRectangle(String couleur, int longueur, int largeur) {
        System.out.println("Le rectangle a une longueur de " + longueur + " et une largeur de " + largeur + ".");
        System.out.println("Le rectangle est " + couleur + ".");
        System.out.println("Son périmètre est de " + calculerPerimetreRectangle(longueur, largeur) + ".");
        System.out.println("Son air est de " + calculerAireRectangle(longueur, largeur) + ".");
    }

    public void testerAfficherInfoRectangle() {
        afficherInfoRectangle("bleu", 3, 7);
    }

    public void demanderEtAfficherInfoRectangle() {
        int longueur = lireEntier("Quelle est la longueur de votre rectangle? ");
        int largeur = lireEntier("Quelle est la largeur de votre rectangle? ");
        String couleur = lireString("Quelle est la couleur de votre rectangle? ");
        afficherInfoRectangle(couleur, longueur, largeur);
    }

    public static void main(String[] args) {
        new Formatif3();
    }
}
