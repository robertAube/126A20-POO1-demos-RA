public class Cours17DemoTableau {
    public Cours17DemoTableau() {
        demoModifierTableau();
    }

    private void demoModifierTableau() {
        int[] tab = {1, 2, 3, 4};
        int newVal = 0;

        afficherTabInt(tab);
        initTabWithVal(tab, newVal);
        afficherTabInt(tab);
        System.out.println(newVal);
        initTabWithValInc(tab, 5);
        afficherTabInt(tab);
    }

    private void initTabWithVal(int[] tableau, int newVal) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = newVal;
        }
        newVal = 99; //ligne inutile: on ne peut pas modifier newVal
    }


    private void initTabWithValInc(int[] tableau, int newVal) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = newVal++;
        }
    }

    private void afficherTabInt(int[] tab) {
        String seperateur;
        String s = "[";

        for (int i = 0; i < tab.length; i++) {
            seperateur = ((i == tab.length - 1) ? "" : ", "); //Cond ? valeurSiVrai : valeurSiFaux
            s += (tab[i] + seperateur);
        }
        System.out.println(s + "]");
    }

    public static void main(String[] args) {
        new Cours17DemoTableau();
    }
}
