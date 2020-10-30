import java.util.Scanner;

/*
Voir vidéo coursera:
https://www.coursera.org/lecture/initiation-programmation-java/tableaux-declaration-RQ8Ra
 */

public class Cours14DemoTableau {
    public Cours14DemoTableau() {
        lireEtAfficherNotes();

    }

    /*
    Saisir des notes puis afficher la moyenne et toutes les notes saisies
     */

    private void lireEtAfficherNotes() {
        int nbNoteSaisi;
        int noteSaisi;
        int note;
        int tabNotes[]; // référence à un tableau statique d'entier
        int sommeNote = 0;
        double moyenne;

        nbNoteSaisi = lireEntierValide("Combien de notes à saisir? ", 0, 25);
        tabNotes = new int[nbNoteSaisi];  //instanciation du tableau

        for (int i = 0; i < nbNoteSaisi; i++) {
            noteSaisi = lireEntierValide("Donner la note de l'étudiant #" + (i + 1) + " : ", 0, 100);
            tabNotes[i] = noteSaisi;
            sommeNote += noteSaisi;
        }

        for (int i = 0; i < nbNoteSaisi; i++) {
            note = tabNotes[i];
            System.out.println("La note de l'étudiant #" + (i + 1) + " est : " + note);
        }

        moyenne = sommeNote / nbNoteSaisi;
        System.out.println("Moyenne = " + moyenne);
    }


    public int lireEntierValide(String question, int valeurMin, int valeurMax) {
        int valeurUsager;

        do {
            valeurUsager = lireInt(question);
            if (valeurUsager < valeurMin) {
                System.out.println("Erreur : " + valeurUsager + " est inférieur à " + valeurMin + ".");
            } else if (valeurUsager > valeurMax) {
                System.out.println("Erreur : " + valeurUsager + " est supérieur à " + valeurMax + ".");
            }
        } while (valeurUsager < valeurMin || valeurMax < valeurUsager);

        return valeurUsager;
    }

    public static int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public static String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    public static void main(String[] args) {
        new Cours14DemoTableau();
    }
}
