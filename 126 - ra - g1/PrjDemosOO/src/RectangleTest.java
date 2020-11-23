import org.w3c.dom.css.Rect;

public class RectangleTest {
    public RectangleTest() {

        //       testerGetSet();
        //   testerToString();
        //  testerVariableFinal();
        //testerValiderHauteurLargeur();
//        testerGetAir();
        testerEgalite();
    }

    private void testerEgalite() {
        Rectangle r1 = new Rectangle(14,33);
        Rectangle r2 = new Rectangle(14, 33);
        String s = "chat";

        s.equals(s);
        System.out.println("r1 == r2 ? " +  (r1.equals(r2)));
    }

    private void testerGetAir() {
        Rectangle r1; //r1 est pour conserver une instance vs Rectangle c'Est la classe. (Structure de l'objet)
        Rectangle r2;
        int h = 2;
        int l = -4;

        System.out.println(Rectangle.DEFAULT_HAUTEUR);

        r1 = new Rectangle(3,2);

        System.out.println(r1.toString());
        System.out.println("A un air de : " + r1.getAir());
        r2 = new Rectangle(4,5);
        System.out.println(r2);
        System.out.println("A un air de : " + r2.getAir());
    }

    private void testerValiderHauteurLargeur() {
        Rectangle r1;
        int hauteur;
        int largeur;

        hauteur = -3;
        largeur = 2;

        //hauteurEstValide & largeurEstValide ont été déclarés static pour que l'on puisse les accéder sans instance.
        if (Rectangle.hauteurEstValide(hauteur) && Rectangle.largeurEstValide(largeur)) {
            r1 = new Rectangle(hauteur, largeur);
            System.out.println(r1);
        } else {
            System.out.println("Le rectangle n'a pas pu être créé hauteur & largeur doivent être positifs " + hauteur + ", " + largeur);
        }

        hauteur = 3;

        //hauteurEstValide & largeurEstValide ont été déclarés static pour que l'on puisse les accéder sans instance.
        if (Rectangle.hauteurEstValide(hauteur) && Rectangle.largeurEstValide(largeur)) {
            r1 = new Rectangle(hauteur, largeur);
            System.out.println(r1);
        } else {
            System.out.println("Le rectangle n'a pas pu être créé hauteur & largeur doivent être positifs " + hauteur + ", " + largeur);
        }

    }

    private void testerVariableFinal() {
        int a;

        a = Rectangle.DEFAULT_HAUTEUR;

        System.out.println(Math.PI);

        //    Rectangle.DEFAULT_HAUTEUR = 3;  //impossible c'Est une constante.

    }

    private void testerToString() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(14, 33);

        System.out.println(r2);
        System.out.println(r1.toString());
    }

    private void testerGetSet() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(14, 33);

        System.out.println(r1.getHauteur() + ", " + r1.getLargeur());
        System.out.println(r2.getHauteur() + ", " + r2.getLargeur());

        r1.setHauteur(3);
        r1.setLargeur(5);

        r2.setHauteur(2);
        r2.setLargeur(7);


        //  r2.setHauteur(-4); //lance une IllegalArgumentException
        //  r2.setLargeur(-2); //lance une IllegalArgumentException

        System.out.println(r1.getHauteur() + ", " + r1.getLargeur());
        System.out.println(r2.getHauteur() + ", " + r2.getLargeur());
    }

    public static void main(String[] args) {
        new RectangleTest();
    }
}
