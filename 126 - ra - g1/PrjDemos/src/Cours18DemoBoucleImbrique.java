//http://www.pythontutor.com/java.html#mode=edit
public class Cours18DemoBoucleImbrique {
    public Cours18DemoBoucleImbrique() {
        demoTableau2D();
    }

    private void demoTableau2D() {
        int [] vecteur = {1,2,3,4};

        afficherTabInt(vecteur);
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
