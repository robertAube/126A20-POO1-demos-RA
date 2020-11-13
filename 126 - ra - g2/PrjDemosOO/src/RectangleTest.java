public class RectangleTest {
    public RectangleTest() {
        Rectangle r1 = new Rectangle(); //instanciation de mon rectangle en objet (ou instance)
        Rectangle r2 = new Rectangle(); //instanciation de mon rectangle en objet (ou instance)

        r1.setLargeur(3);
        System.out.println(r1.getLargeur());
        r2.setLargeur(2);
        System.out.println(r2.getLargeur());
//        Rectangle.hauteur = 2;
//        r.hauteur = 2;
//        r.largeur = 1;
    }

    public static void main(String[] args) {
        new RectangleTest();
    }
}
