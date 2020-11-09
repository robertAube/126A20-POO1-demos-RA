//http://www.pythontutor.com/java.html#mode=edit
public class Cours18DemoBoucleImbrique {
    public Cours18DemoBoucleImbrique() {
        demoTableau2D();
    }

    private void demoTableau2D() {
        int[] vecteur = {1, 2, 3, 4};
        int[][] tab2D = {{1, 2, 3}, {4, 5, 6}};

        tab2D[1][0] = 44;
        System.out.println(afficherTabInt(vecteur));

        System.out.println(afficherTabInt2DV2(tab2D));
    }

    private String afficherTabInt2DV1(int[][] tableau2D) {
        String s = "";
        for (int ligne = 0; ligne < tableau2D.length; ligne++) {
            s += afficherTabInt(tableau2D[ligne]);
        }
        return s;
    }

    //Boucle Imbriqué
    private String afficherTabInt2DV2(int[][] tableau2D) {
        String s = "";
        for (int ligne = 0; ligne < tableau2D.length; ligne++) {
            s += ligne == 0 ? "[" : ", [";
            for (int colonne = 0; colonne < tableau2D[ligne].length; colonne++) {
                s += colonne == 0 ? "" : ", ";
                s += tableau2D[ligne][colonne];
            }
            s += "]";
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
        new Cours18DemoBoucleImbrique();
    }
}
