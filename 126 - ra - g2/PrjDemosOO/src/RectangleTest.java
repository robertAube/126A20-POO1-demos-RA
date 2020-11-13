public class RectangleTest {
    public RectangleTest() {
        testerCalculerAir();
    }

    private void testerCalculerAir() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(5,1); //instanciation de mon rectangle en objet (ou instance)

        System.out.println(r1.getAir());
        System.out.println(r2.getAir());
        System.out.println(r1);
        System.out.println(r2);

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
        Rectangle r2 = new Rectangle(5,1); //instanciation de mon rectangle en objet (ou instance)

        //  testerGetSet();
        System.out.println(r1.toString());
        System.out.println(r2);
    }

    private void testerGetSet() {
        Rectangle r1 = new Rectangle(2, 4); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(5,1); //instanciation de mon rectangle en objet (ou instance)

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
