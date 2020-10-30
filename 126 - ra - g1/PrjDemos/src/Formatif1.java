public class Formatif1 {
    //constructeur
    Formatif1() {
        appelerTous();
    }

    // 9
    private void afficherLigne() {
        System.out.println("********************************");
    }

    // 10
    private void afficherMesinfos() {
        System.out.println("Nom : Robert Aubé");
        System.out.println("Lieu de naissance : Québec");
    }

    // 11
    private void afficherSomme3A6() {
        int reponse;

        reponse = 3 + 4 + 5 + 6;
        System.out.print("La somme des chiffres de 3 à 6 est : ");
        System.out.println(reponse);
    }

    // 12
    private void calculerEtAfficher0CelsiusEnFarenheit() {
        int tCelsius;
        double tFahrenheit;

        tCelsius = 0;
        tFahrenheit = tCelsius * 9 / 5 + 32;
        System.out.print(tCelsius + " Celsius en Farenheit est : ");
        System.out.println(tFahrenheit);
    }

    // 13
    private void calculerEtAfficher0FarenheitEnCelsius() {
        System.out.print("0 Farenheit en Celsius est : ");
        System.out.println((0 - 32) * 5 / 9);
    }

    //14
    private void afficherConvertirKmVersMetre(int kilometre) {
        System.out.print(kilometre);
        System.out.print(" kilomètres équivalent à ");
        System.out.print(kilometre * 1000);
        System.out.println(" mètres.");
    }

    //15
    private void afficherNoQuestion(int noQuestion) {
        afficherLigne();
        System.out.print("Question : ");
        System.out.println(noQuestion);
    }

    //16
    private void appelerTous() {
        afficherNoQuestion(10);
        afficherMesinfos();
        afficherNoQuestion(11);
        afficherSomme3A6();
        afficherNoQuestion(12);
        calculerEtAfficher0CelsiusEnFarenheit();
        afficherNoQuestion(13);
        calculerEtAfficher0FarenheitEnCelsius();
        afficherNoQuestion(14);
        afficherConvertirKmVersMetre(14);
    }

    public static void main(String[] args) {
        new Formatif1();
    }
}
