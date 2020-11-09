package prjDemos.src;

//http://www.pythontutor.com/java.html#mode=edit
public class Cours18DemoTableau2D {
    public Cours18DemoTableau2D() {
        //    testerGetMinimum();
        demoTableau2D();
    }

    public void testerGetMinimum() {
        double t1[] = {1.1, 1.2, 1.3, 1.5};
        double t2[] = {1.1, 1.1, 1.1};
        double t3[] = {1.0, 1.1, 1.2, 1.3, 0.5};
        double t4[] = {1.1, 1.2, -0.3, 1.5, 1.6};
        double t5[] = {1.1};
        double tVide[] = {};

        System.out.println(getMinimum(t1) == 1.1);
        System.out.println(getMinimum(t2) == 1.1);
        System.out.println(getMinimum(t3) == 0.5);
        System.out.println(getMinimum(t4) == -0.3);
        System.out.println(getMinimum(t5) == 1.1);
        System.out.println(getMinimum(tVide) == 0); //génère un ArrayIndexOutOfBoundsException
    }

    private double getMinimum(double[] tab) {
        double minimum;

        if (tab.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Erreur: le tableau est vide.");
        }

        minimum = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minimum) {
                minimum = tab[i];
            }
        }
        return minimum;
    }

    ////////////////////////////////////////////////////////////////////////////
    private void demoTableau2D() {
        int[] t1 = {1, 2, 3, 4};
        int[][] t2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        afficherTabInt(t1);

        System.out.println("Ligne 0: Colonne 0 = " + t2d[0][0]);
        System.out.println("Ligne 3: Colonne 0 = " + t2d[3][0]);

        System.out.println(afficherTabInt2DV2(t2d));
  //      afficherTabInt2DV2(t2d);
    }

    private void afficherTabInt2DV1(int[][] t2d) {
        String s = "";

        //boucles imbriqués
        for (int ligne = 0; ligne < t2d.length; ligne++) { //pour chaque ligne
            s += ligne == 0 ? "[" : ", [";
            for (int colonne = 0; colonne < t2d[ligne].length; colonne++){ //pour chaque colonne
                s += colonne == 0 ? "" : ", ";
                s += t2d[ligne][colonne];
            }
            s += "]";
        }

        System.out.println("[" + s + "]");
    }

    private String afficherTabInt2DV2(int[][] t2d) {
        String s = "";
        for (int ligne = 0; ligne < t2d.length; ligne++) {
            s += ligne == 0 ? "": ", ";
            s += afficherTabInt(t2d[ligne]);
        }
        return "[" + s + "]";
    }

    private String afficherTabInt(int[] tab) {
        String seperateur;
        String s = "";

        for (int i = 0; i < tab.length; i++) {
            seperateur = ((i == tab.length - 1) ? "" : ", "); //Cond ? valeurSiVrai : valeurSiFaux
            s += (tab[i] + seperateur);
        }
        return "[" + s + "]";
    }

    public static void main(String[] args) {
        new Cours18DemoTableau2D();
    }
}

