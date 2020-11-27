public class RectangleTest {
    public RectangleTest() {
        testerEagaliteDe2Rectangle();
        //     testerCalculerAir();
    }

    private void testerEagaliteDe2Rectangle() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r1Copie = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(10, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r3 = new Rectangle(2, 40); //instanciation de mon rectangle en objet (ou instance)
        Rectangle rNull = null;

        System.out.println("r1 == r2" + (r1 == r1Copie));
        //    System.out.println("r1.equals(r2)" + r1.equals(r2));

        System.out.println("equals : la comparaison de la même instance devrait donner true");
      //  System.out.println(r1.equals(r1));

        System.out.println("equals : la comparaison avec un rectangle null retourne false");
     //   System.out.println(r1.equals(rNull));

        System.out.println("equals : la comparaison d'une variable de types différents retourne false");
   //     System.out.println(r1.equals(this));
   //     System.out.println(r1.equals("chat"));

        System.out.println("equals : la comparaison de 2 instances de rectangle avec des hauteurs différentes retourne false");
        System.out.println(r1.equals(r2));

        System.out.println("equals : la comparaison de 2 instances de rectangle avec des largeurs différentes retourne false");
        System.out.println(r1.equals(r3));

        System.out.println("equals : la comparaison de 2 instances avec la même largeur et hauteur retourne vrai");
        System.out.println(r1.equals(r1Copie));
    }

    private void testerCalculerAir() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(5, 1); //instanciation de mon rectangle en objet (ou instance)

        System.out.println(r1.getAir());
        System.out.println(r2.getAir());
        System.out.println(r1.getPerimetre());
        System.out.println(r1);
        System.out.println(r2.toString());
    }

    private void testerValiderHautLarg() {
        Rectangle r1;
        Rectangle r2;
        int hauteur;

        hauteur = 2;
        if (Rectangle.estHauteurValide(hauteur)) {
            r1 = new Rectangle(hauteur, 0);
            System.out.println(r1);
        }

        hauteur = -12;
        if (Rectangle.estHauteurValide(hauteur)) {
            r2 = new Rectangle(hauteur, 0);
            System.out.println(r2);
        }
    }

    private void testerConstanteStatic() {
        //  Rectangle.DEFAULT_LARGEUR = 0; //impossible de modifier une variable final (constante)
        System.out.println("Valeur de la constante largeur par défaut : " + Rectangle.DEFAULT_LARGEUR);
    }

    private void testerToString() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(5, 1); //instanciation de mon rectangle en objet (ou instance)

        //  testerGetSet();
        System.out.println(r1.toString());
        System.out.println(r2);
    }

    private void testerGetSet() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(5, 1); //instanciation de mon rectangle en objet (ou instance)

        System.out.println(r1.getHauteur());
        System.out.println(r1.getLargeur());

        r1.setLargeur(3);
        System.out.println(r1.getLargeur());
        r2.setLargeur(2);
        System.out.println(r2.getLargeur());
//        Rectangle.hauteur = 2;
//        r.hauteur = 2;
//        r.largeur = 1;
        //       r2.setLargeur(-2); //produit une Exception in thread "main" java.lang.IllegalArgumentException: Largeur invalide : -2
        System.out.println(r2.getLargeur());
    }

    public static void main(String[] args) {
        new RectangleTest();
    }
}
