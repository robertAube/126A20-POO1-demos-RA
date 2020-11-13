public class Rectangle {
    //attribut d'un rectangle (variable d'instance)
    private int hauteur;   //on les mets de visibilité private pour qu'elle soit encapsulé (Non accessible à l'Extérieur de la classe)
    private int largeur;

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur; //this fait référence à l'attribut l'instance courante.
    }
}
