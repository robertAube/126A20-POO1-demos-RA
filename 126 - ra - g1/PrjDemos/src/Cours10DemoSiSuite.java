public class Cours10DemoSiSuite {
    public Cours10DemoSiSuite() {

//        System.out.println(0 == 0); //true
//        System.out.println(0 == 1); //false

        demontrerTypeChar();

//        System.out.println(calculerRabais(0) == 0); //devrait afficher vrai si le rabais de 0 == 0;
//        System.out.println(calculerRabais(50) == 0); //devrait afficher vrai si le rabais de 50 == 0;
//        System.out.println(calculerRabais(99.99999) == 0); //devrait afficher vrai si le rabais de 100 == 0.02;
//
//        System.out.println(calculerRabais(150) == 0.02); //devrait afficher vrai si le rabais de 150 == 0.02;
//        System.out.println(calculerRabais(125) == 0.02); //devrait afficher vrai si le rabais de 125 == 0.02;
//        System.out.println(calculerRabais(100) == 0.02); //devrait afficher vrai si le rabais de 100 == 0.02;
//
//        System.out.println(calculerRabais(500) == 0.03);
//        System.out.println(calculerRabais(510) == 0.03);
//
//        System.out.println(calculerRabais(1000) == 0.05);
    }

    private void demontrerTypeChar (){
        char c = 'e'; //type simple comme int, double, boolean
        String strC = "a"; //type complexe

        if (c < 'd')
            System.out.println("le caractère dans la variable c est plus petit que d");
        else
            System.out.println("le caractère dans la variable c est plus grand ou égale que d");
    }


    /*
    Faire une méthode qui calcule un rabais en fonction d'un montant reçu en argument.
    infini, 100[ -> 0
    [100, 500[ -> 2% = 0.02
    [500, 1000[ -> 3%
    [1000, infini -> 5%
 */
    //xxx Version à utiliser
    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100)
            rabais = 0;
        else if (montant < 500)
            rabais = 0.02;
        else if (montant < 1000)
            rabais = 0.03;
        else
            rabais = 0.05;

        return rabais;
    }


    /*
    Faire une méthode qui calcule un rabais en fonction d'un montant reçu en argument.
    infini, 100[ -> 0
    [100, 500[ -> 2% = 0.02
    [500, 1000[ -> 3%
    [1000, infini -> 5%
 */
    private double calculerRabaisVOld2(double montant) {
        double rabais = 0;

//        if (montant < 0 && montant > 5000000)
        if (montant < 0 && 50000 < montant) //en dehors des limites de 0 à 50 000
            rabais = -1;
        //erreur
 //100 <= montant <= 500 // ne foncttonne

        if (100 <= montant && montant < 500) //vrai si montant est [100, 500[
            rabais = 0.02;

        if (500 <= montant && montant < 1000)
            rabais = 0.03;

        if (1000 <= montant)
            rabais = 0.05;

        return rabais;
    }


    /*
        Faire une méthode qui calcule un rabais en fonction d'un montant reçu en argument.
        infini, 100[ -> 0
        [100, 500[ -> 2% = 0.02
        [500, 1000[ -> 3%
        [1000, infini -> 5%
     */
    private double calculerRabaisVold1(double montant) {
        double rabais = 0;

        if (montant >= 100)
            rabais = 0.02;

        if (montant >= 500)
            rabais = 0.03;

        if (montant >= 1000)
            rabais = 0.05;

        return rabais;
    }

    public static void main(String[] args) {
        new Cours10DemoSiSuite();
    }
}
