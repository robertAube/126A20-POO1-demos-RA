public class RectangleTest {
    public RectangleTest() {

        //       testerGetSet();
        //   testerToString();
        //  testerVariableFinal();
        //testerValiderHauteurLargeur();
//        testerGetAir();
        testerEgalite();
    }

    //ref : https://www.java67.com/2012/11/difference-between-operator-and-equals-method-in.html
    private void testerEgalite() {
        Rectangle r1 = new Rectangle(14, 33);
        Rectangle r1Pareil = new Rectangle(14, 33);
        Rectangle r1Ref = r1;

        Rectangle r1HDif = new Rectangle(7, 33);
        Rectangle r1LDif = new Rectangle(14, 3);
        Rectangle rNull = null;
        String s1 = "chat";
        String s2 = "chat";

        System.out.println("r1 == r1Pareil ? " + (r1 == r1Pareil));
        System.out.println("r1 == r1Ref ? " + (r1 == r1Ref));

        System.out.println("r1.equals(r1Pareil)" + r1.equals(r1Pareil));
        System.out.println(" s1.equals(s2)" + s1.equals(s2));

        System.out.println("equals : la comparaison de la même instance devrait donner true");
        System.out.println("r1.equals(r1) ? " + r1.equals(r1));
        System.out.println("r1.equals(r1Ref) ? " + r1.equals(r1Ref));


        System.out.println("equals : la comparaison avec un rectangle null retourne false");
        System.out.println("r1.equals(rNull) ? = " + r1.equals(rNull));
        System.out.println("r1.equals(null) ? = " + r1.equals(null));

        System.out.println("equals : la comparaison d'une variable de types différents retourne false");
        System.out.println("r1.equals(s1) ? = " + r1.equals(s1)); //r1 est Rectangle et s1 est String donc différent.
        System.out.println("r1.equals(this) ? = " + r1.equals(this)); //ici this est de type RectangleTest donc différent de r1 qui est de type Rectangle

        System.out.println("equals : la comparaison de 2 instances de rectangle avec des hauteurs différentes retourne false");
        System.out.println("r1.equals(r1HDif) ? " + r1.equals(r1HDif));

        System.out.println("equals : la comparaison de 2 instances de rectangle avec des largeurs différentes retourne false");
        System.out.println("r1.equals(r1LDif) ? " + r1.equals(r1LDif));

        System.out.println("equals : la comparaison de 2 instances avec la même largeur et hauteur retourne vrai");
        System.out.println("r1.equals(r1Pareil) ? " + r1.equals(r1Pareil));
    }

    private void testerGetAir() {
        Rectangle r1; //r1 est pour conserver une instance vs Rectangle c'est la classe. (Structure de l'objet)
        Rectangle r2;
        int h = 2;
        int l = -4;

        System.out.println(Rectangle.DEFAULT_HAUTEUR);

        r1 = new Rectangle(3, 2);

        System.out.println(r1.toString());
        System.out.println("A un air de : " + r1.getAir());
        r2 = new Rectangle(4, 5);
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
