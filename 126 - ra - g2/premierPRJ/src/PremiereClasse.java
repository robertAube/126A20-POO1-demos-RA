// Auteur: Robert Aubé
// Première classe
public class PremiereClasse {

    //constructeur
    PremiereClasse () {
        System.out.println("Constructeur!");
        System.out.println("Je suis vraiment dans mon Constructeur!");
        afficherMonNom();
    }
//méthode
    private void afficherMonNom() {
        System.out.println("Robert Aubé");
    }

    //point de départ de mon programme
    public static void main(String[] args) {
        System.out.println("Bonjour lE monde!!!");
        System.out.println("Bonjour Amérique!");
        new PremiereClasse(); //instanciation
    }
}
