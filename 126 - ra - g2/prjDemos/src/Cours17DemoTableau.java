public class Cours17DemoTableau {
    public Cours17DemoTableau() {
        demo2();
    }

    private void demo1() {
        int[] tab = {1, 2, 3, 4};

        afficherTabInt(tab);
        initWithVal(tab, 0);
        afficherTabInt(tab);
    }

    private void demo2() {
        String s1 = "Bonjour USA";
        String s2;


        s2 = strGauche(s1, 7);

        System.out.println(s1);
        System.out.println(s2);

    }

    private String strGauche(String str, int nbDeCarAExtraireGauche) {
        String retour = "";

        for (int i = 0; i < nbDeCarAExtraireGauche; i++)
        {
            retour += str.charAt(i);
        }
        return retour;
    }

    private void initWithVal(int[] tab, int newVal) {
        for (int i = 0; i < tab.length; i++)
            tab[i] = newVal;
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
        new Cours17DemoTableau();
    }
}
