public class PremierPgm {
    //construsteur 
    PremierPgm(){

        System.out.println("Je suis heureux de faire mon premier programme");
        System.out.println("Je sujis vrameint heureux");
        identifierMoi();
        identifierMoi();
        identifierMoi();
    }

    public void identifierMoi() {
        System.out.println("Mon nom est Robert Aubé");
    }
    // Robert Aubé
    // Robert Aubé
    public static void main(String[] args) {
        System.out.println("Bonjour le monde");
        System.out.println("Particuliairement aux étudiants du cégep Limoilou");
        System.out.println("Il fait beau aujourd'hui");

        new PremierPgm();
    }
}
