import java.util.Scanner;

/*
Voir vidéo coursera:
https://www.coursera.org/lecture/initiation-programmation-java/tableaux-declaration-RQ8Ra
 */

public class Cours14DemoTableau {
    public Cours14DemoTableau() {
        lireEtAfficherNote();
    }

    /**
     * Saisir des notes puis afficher toutes les notes saisies
     */
    private void lireEtAfficherNote() {
        int tabNotes[]; //Déclaration d'un tableau statique. (La grandeur ne change pas)
        int nbNotesASaisir;
        int note;

        nbNotesASaisir = lireEntierValide("Combien de notes à saisir?", 0, 25);
        tabNotes = new int[nbNotesASaisir]; //(La grandeur ne change pas)

        for (int i = 0 ; i < nbNotesASaisir; i++) {
            note = lireEntierValide("Donner la note de l'étudiant #" + (i + 1) + " : ", 0, 100);
            tabNotes[i] = note;
        }

        for (int i = 0; i < nbNotesASaisir; i++) {
            note = tabNotes[i];
            System.out.println("La note de l'étudiant #" + (i + 1) + " est : " + note);
        }
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

    public  int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }

    public  String lireString(String question) {
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
