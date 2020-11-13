public class Rectangle {

    //public = accessibilité possible à l'extérieur de la classe
    //static = n'a pas pas besoin d'être instancié pour l'utiliser. (Pas besoin de faire un new) 1 et 1 seul par classe.
    //final = constante ne peut pas être modifié.
    public static final int DEFAULT_HAUTEUR = 0;
    public static final int DEFAULT_LARGEUR = 0;

    //attribut d'un rectangle (variable d'instance) Ces variables existe seulement si j'ai un objet ou instance
    private int hauteur;   //on les met de visibilité private pour qu'elle soit encapsulé (Non accessible à l'Extérieur de la classe)
    private int largeur;

    //contructeur par défaut
    public Rectangle() {
        this(DEFAULT_HAUTEUR, DEFAULT_HAUTEUR); //ici this est utilisé pour appeler un autre constructeur. Doit être la première instruction.
        System.out.println("Rectangle() - constructeur par défaut - " + toString());
    }

    public Rectangle(int hauteur, int largeur) {
        setLargeur(largeur);
        setHauteur(hauteur);
    }

    public int getAir() {
        int air;
        air = largeur * hauteur;
        return air;
    }

    //accesseur (getteur)
    public int getHauteur() {
        return hauteur;
    }

    //mutateur (Setter)
    public void setHauteur(int hauteur) {
        if (!estHauteurValide(hauteur))
            throw new IllegalArgumentException("Hauteur invalide : " + hauteur);
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if (!estLargeurValide(largeur))
            throw new IllegalArgumentException("Largeur invalide : " + largeur);
        this.largeur = largeur; //this fait référence à l'attribut l'instance courante.
    }

    public static boolean estLargeurValide(int largeur) {
        boolean estValide;
        estValide = largeur >= 0;
        return estValide;
    }

    public static boolean estHauteurValide(int hauteur) {
        boolean estValide;
        estValide = hauteur >= 0;
        return estValide;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Rectangle : ";
        s += "hauteur=" + hauteur + ", largeur=" + largeur;
        s += " air=" + getAir();

        return s;
    }

}
