public class Cours16DemoTableau {
    public Cours16DemoTableau() {
  //      testerAfficherTableau();

        testerCreerTableauDouble();
    }

    private void testerCreerTableauDouble() {
        double tabDouble[];

        tabDouble = creerTableauDouble(5, 2.12);

        afficherTableauDouble(tabDouble);

        tabDouble = creerTableauDouble(4, 3.4);

        afficherTableauDouble(tabDouble);
    }

    //Créer un tableau de double de longueur initialisé avec la valeur dans tous les éléments du tableau
    private double[] creerTableauDouble(int longueur, double valeur) {
        double [] tabRetour;

        tabRetour = new  double[longueur];

        for (int i = 0; i < tabRetour.length; i++) {
            tabRetour[i] = valeur;
        }

        return tabRetour;
    }

    private void testerAfficherTableau() {
        int[] tab;

        tab = new int[3];

        tab[0] = 200;
        tab[1] = 21;
        tab[2] = 44;

        afficherTableau(tab);

        int [] vide;

        vide = new int[0];

        afficherTableau(vide);
    }

    private void afficherTableau(int[] tab) {
        String seperateur;
        String s = "[";

        for (int i = 0; i < tab.length; i++) {
            seperateur = ((i == tab.length - 1) ? "" : ", "); //Cond ? valeurSiVrai : valeurSiFaux
            s += (tab[i] + seperateur);
        }
        System.out.println(s + "]");
    }

    private void afficherTableauDouble(double[] tab) {
        String seperateur;
        String s = "[";

        for (int i = 0; i < tab.length; i++) {
            seperateur = ((i == tab.length - 1) ? "" : ", "); //Cond ? valeurSiVrai : valeurSiFaux
            s += (tab[i] + seperateur);
        }
        System.out.println(s + "]");
    }


    private void afficherTableauV1(int[] tab) {
        String seperateur;
        for (int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1)
                seperateur = "";
            else
                seperateur = ", ";
            System.out.print(tab[i] + seperateur);
        }
    }

    public static void main(String[] args) {
        new Cours16DemoTableau();
    }
}

