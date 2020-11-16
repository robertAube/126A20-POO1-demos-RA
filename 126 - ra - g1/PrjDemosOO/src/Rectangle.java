public class Rectangle {
    //attributs d'un rectangles (variables d'instance), Ces variables existent seulement si j'ai un objet ou instance
    private int hauteur; //on met une visiblité private pour encapsuler ces données (Non accessivble à l'extérieur de la classe)
    private int largeur;

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur)) {
            this.hauteur = hauteur;  //this fait référence à l'objet courant
        }
        else
            throw new IllegalArgumentException("Hauteur invalide : " + hauteur);
    }

    private boolean hauteurEstValide(int hauteur) {
        boolean estValide;
        estValide = hauteur >= 0;
        return estValide;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        if (largeurEstValide(largeur)) {
            this.largeur = largeur;
        }
        else
            throw new IllegalArgumentException("Largeur invalide : " + largeur);
    }

    private boolean largeurEstValide(int largeur) {
        boolean estValide;
        estValide = largeur >= 0;
        return estValide;
    }
}
