public class Cours15DemoTableau {
    public Cours15DemoTableau() {
        demoDeclarationTableau();
        testerCreerTableauDouble();
    }

    private void demoDeclarationTableau() {
        int tab1[] = {1, 2, -3};

        int tab2[];

        tab2 = new int[3];

        tab2[0] = 1;
        tab2[1] = 2;
        tab2[2] = -3;

        afficherTabInt(tab1);
        afficherTabInt(tab2);
    }

    private void afficherTabInt(int[] tab) {
        String separateur;
        String s;

        s = "";
        for (int i = 0; i < tab.length; i++) {
            //cond ? valeurSiVrai : valeurSiFaux
            separateur = (i == tab.length - 1 ? "" : ", ");
            s += tab[i] + separateur;
        }
        System.out.println("[" + s + "]");
    }

    private void afficherTabDouble(double[] tab) {
        String separateur;
        String s;

        s = "";
        for (int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1)
                separateur = "";
            else
                separateur = ", ";
            s += tab[i] + separateur;
        }
        System.out.println("[" + s + "]");
    }


    private void testerCreerTableauDouble() {
        double[] tab1;

        tab1 = creerTableauDouble(4, 1.45);

        afficherTabDouble(tab1);
    }

    // Créer un tableau de double longueur N initalisé avec la valeur v partout.
    private double[] creerTableauDouble(int longueur, double v) {
        double[] tableauRetourne;

        tableauRetourne = new double[longueur];

        for (int i = 0; i < tableauRetourne.length; i++) {
            tableauRetourne[i] = v;
        }

        return tableauRetourne;
    }


    public static void main(String[] args) {

        new Cours15DemoTableau();
    }
}
