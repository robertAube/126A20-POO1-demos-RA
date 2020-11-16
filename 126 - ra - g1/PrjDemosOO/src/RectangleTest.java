public class RectangleTest {
    public RectangleTest() {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setHauteur(3);
        r1.setLargeur(5);

      //  r2.setHauteur(-4); //lance une IllegalArgumentException
      //  r2.setLargeur(-2); //lance une IllegalArgumentException

        System.out.println(r1.getHauteur() + ", " + r1.getLargeur());
        System.out.println(r2.getHauteur() + ", " + r2.getLargeur());
    }

    public static void main(String[] args) {
        new RectangleTest();
    }
}
