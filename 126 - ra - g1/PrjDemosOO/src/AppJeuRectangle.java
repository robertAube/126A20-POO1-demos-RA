public class AppJeuRectangle {
    public AppJeuRectangle() {
        jeu1();
    }

    private void jeu1() {
        int largeur;
        int hauteur;
        Rectangle r;

        largeur = Util.lireEntierValide("Donner la largeur : ", 0, 1000);
        hauteur = Util.lireEntierValide("Donner la hauteur : ", 0, 1000);

        r = new Rectangle(hauteur, largeur);

        System.out.println(r.toString());
    }

    public static void main(String[] args) {
        new AppJeuRectangle();
    }
}
