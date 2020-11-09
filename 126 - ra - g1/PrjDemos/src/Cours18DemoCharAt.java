public class Cours18DemoCharAt {
    public Cours18DemoCharAt () {
        demoCharAt();
    }

    private void demoCharAt() {
        String s1 = "Bonjour le monde!";
        String sGauche;

        sGauche = getGauche (s1, 4);
        System.out.println(s1);
        System.out.println(sGauche);
    }

    private String getGauche(String texte, int nbCar) {
        String retour = "";

        for (int i = 0; i < nbCar; i++) {
            retour += texte.charAt(i);
        }

        return retour;
    }

    public static void main(String[] args) {
        new Cours18DemoCharAt();
    }
}
