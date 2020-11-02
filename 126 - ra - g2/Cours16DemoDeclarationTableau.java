//http://www.pythontutor.com/java.html#mode=edit

public class Cours16DemoDeclarationTableau {
    public Cours16DemoDeclarationTableau() {
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
        String s = "";
        for (int i = 0; i < tab.length; i++) {
            separateur = (i == tab.length - 1 ? "" : ", ");
            s += tab[i] + separateur;
        }
        System.out.println("[" + s + "]");
    }

    public static void main(String[] args) {
        new Cours16DemoDeclarationTableau();
    }
}