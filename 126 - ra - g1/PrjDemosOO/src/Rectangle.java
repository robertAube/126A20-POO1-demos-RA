public class Rectangle {
    //public = accessibilité possible à l'extérieur de la classe
    //static = existe même sans instance (ou objet) 1 et 1 seul classe;
    //final = constante ne peut pas être modifiée.
    public static final int DEFAULT_HAUTEUR = 0;
    public static final int DEFAULT_LARGEUR = 0;
    //attributs d'un rectangle (variables d'instance). Ces variables existent seulement si j'ai un objet ou instance
    private int hauteur; //on met une visiblité private pour encapsuler ces données (Non accessible à l'extérieur de la classe)
    private int largeur;


    public Rectangle() {
        this(DEFAULT_HAUTEUR, DEFAULT_LARGEUR); //ici this est utilisé pour appeler un autre contructeur. Doit être la première instruction du constructeur
        System.out.println("Rectangle - coustructeur par défaut");

    }

    public Rectangle(int hauteur, int largeur) {
        setHauteur(hauteur);
        setLargeur(largeur);
    }

    public int getAir() {
        int air;
        air = largeur * hauteur;
        return air;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur)) {
            this.hauteur = hauteur;  //this fait référence à l'objet courant
        } else
            throw new IllegalArgumentException("Hauteur invalide : " + hauteur);
    }

    //Cette méthode est static : Donc, je n'ai pas besoin d'instance pour l'utiliser.
    //Cette méthode n'a pas accès aux attributs. C'est normal: je n'ai pas besoin d'instance pour l'utiliser.
    public static boolean hauteurEstValide(int hauteur) {
        boolean estValide;
        estValide = (hauteur >= 0);
        return estValide;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if (largeurEstValide(largeur)) {
            this.largeur = largeur;
        } else
            throw new IllegalArgumentException("Largeur invalide : " + largeur);
    }

    public static boolean largeurEstValide(int largeur) {
        boolean estValide;
        estValide = largeur >= 0;
        return estValide;
    }

    @Override
    public boolean equals(Object o) {
        boolean egal;
        if (this == o) return true; //Si c'Est la même instance.
        if (o == null || getClass() != o.getClass()) return false; // si o est null ou les type d'instance ne sont pas les même, on retourne faux.

        Rectangle rectangle = (Rectangle) o;

        if (this.hauteur != rectangle.hauteur) return false;
        return largeur == ((Rectangle)o).largeur;
    }


    public String toString() {
        String s;
        s = "C'est un rectangle: ";
        s += "\nhauteur=" + hauteur + ", largeur=" + largeur;
        s += "\nAir = " + getAir();
        return s;
    }

    //pas de main() ici. C'est normal, le main n'a aucun rapport avec un Rectangle.
}
