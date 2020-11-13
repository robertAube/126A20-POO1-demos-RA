public class Rectangle {
    //public = accessibilité possible à l'extérieur de la classe
    //static = n'a pas pas besoin d'être instancié pour l'utiliser. (Pas besoin de faire un new) 1 et 1 seul par classe.
    //final = constante ne peut pas être modifiée et obligation de définir sur le champ.
    public static final int DEFAULT_HAUTEUR = 0;
    public static final int DEFAULT_LARGEUR = 0;

    //attributs d'un rectangle (variables d'instance) Ces variables existent seulement si j'ai un objet ou instance
    private int hauteur;   //on les met de visibilité private pour qu'elle soit encapsulée (Non accessible à l'extérieur de la classe)
    private int largeur;

    //contructeur par défaut
    public Rectangle() {
        this(DEFAULT_HAUTEUR, DEFAULT_HAUTEUR); //ici this est utilisé pour appeler un autre constructeur. Doit être la première instruction du constructeur.
        System.out.println("Rectangle() - constructeur par défaut - " + toString());
    }

    public Rectangle(int hauteur, int largeur) {
        setLargeur(largeur); //pour être cohérant, on doit passer par les setters pour valider...
        setHauteur(hauteur);
    }

    public int getAir() {
        int air;
        air = largeur * hauteur;
        return air;
    }

    //accesseur (getter)
    public int getHauteur() {
        return hauteur;
    }

    //mutateur (Setter)
    public void setHauteur(int hauteur) {
        if (!estHauteurValide(hauteur))
            throw new IllegalArgumentException("Hauteur invalide : " + hauteur);
        this.hauteur = hauteur; //this fait référence à l'attribut l'instance courante.
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if (!estLargeurValide(largeur))
            throw new IllegalArgumentException("Largeur invalide : " + largeur);
        this.largeur = largeur; //this fait référence à l'attribut l'instance courante.
    }

    //Cette méthode est static: Donc je n'ai pas besoin d'instanciation pour y accéder.
    //Cependant, une méthode static n'as pas accès aux attributs. C'est normal: je n'ai pas besoin d'instance pour les utiliser.
    public static boolean estLargeurValide(int largeur) {
        boolean estValide;
        estValide = largeur >= 0;
        return estValide;
    }

    //Cette méthode est static: Donc je n'ai pas besoin d'instanciation pour y accéder.
    //Cependant, une méthode static n'as pas accès aux attributs. C'est normal: je n'ai pas besoin d'instance pour les utiliser.
    public static boolean estHauteurValide(int hauteur) {
        boolean estValide;
        estValide = hauteur >= 0;
        return estValide;
    }

    //La méthode toString() est normalisé et est spécicialement conçu pour retourner une String qui présent l'objet instancié.
    @Override
    public String toString() {
        String s = "";
        s += "Rectangle : ";
        s += "hauteur=" + hauteur + ", largeur=" + largeur;
        s += " air=" + getAir();

        return s;
    }

    //pas de main() ici. c'est normal, le main n'a aucun rapport avec un Rectangle.
}
