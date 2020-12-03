public class AppJouerAuRectangle {
    public AppJouerAuRectangle() {
        Jeu1();
    }

    private void Jeu1() {
        MonRectangle r;
        int hauteurLu;
        int largeurLu;

        hauteurLu = Util.lireEntierEntreBornes("Donner la hauteur : ", 0, 400);
        largeurLu = Util.lireEntierEntreBornes("Donner la largeur : ", 0, 400);

        r = new MonRectangle(hauteurLu, largeurLu);

        System.out.println(r);
    }

    public static void main(String[] args) {
        new AppJouerAuRectangle();
    }
}
