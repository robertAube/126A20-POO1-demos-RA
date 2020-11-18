import java.util.Scanner;

public class Util {
    /**
     * Lit un entier au clavier.
     *
     * @param question
     * @return
     */
    public static int lireEntier(String question) {
        int reponse;
        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }

    public static String lireString(String question) {
        Scanner sc; //Instance de l'utilitaire de lecture
        String reponse;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.print(question);
        reponse = sc.nextLine(); //lecture du nom

        return reponse;
    }

    public static int lireEntierEntreBornes(String question, int minimum, int maximum) {
        int reponse;
        boolean estValide = false;

        do {
            reponse = lireEntier(question);

            if (!estEntreBornes(reponse, minimum, maximum)) {
                System.out.println("Votre réponse doit être entre " + minimum + " et " + maximum);
            }
            else {
                estValide = true;
            }
        }
        while (!estValide);
        return reponse;
    }


    public static boolean estEntreBornes(int nb, int borneMin, int borneMax) {
        boolean nbEstEntreMinEtMax;
        nbEstEntreMinEtMax = borneMin <= nb && nb <= borneMax;
        return nbEstEntreMinEtMax;
    }
}
