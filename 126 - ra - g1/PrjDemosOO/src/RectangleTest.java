public class RectangleTest {
    public RectangleTest() {

        //       testerGetSet();
        //   testerToString();
        //  testerVariableFinal();
        testerValiderHauteurLargeur();

    }

    private void testerValiderHauteurLargeur() {
        Rectangle r1;
        int hauteur;

        hauteur = -2;


        if (Rectangle.hauteurEstValide(hauteur)) {
            r1 = new Rectangle(hauteur, 0);
            System.out.println(r1);
        }
    }

    private void testerVariableFinal() {
        int a;

        a = Rectangle.DEFAULT_HAUTEUR;

//        System.out.println(Math.PI);

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
