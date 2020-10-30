public class Cours10DemoSiSuite {
    public Cours10DemoSiSuite() {
        testerCalculerRabais();
    }

    private void testerCalculerRabais() {
        double rabais;
        rabais = calculerRabaisV3(-1); //0
        System.out.println(rabais == 0);
        rabais = calculerRabaisV3(50); //0
        System.out.println(rabais == 0);

        rabais = calculerRabaisV3(100); // 0.05
        System.out.println(rabais == 0.05);
        rabais = calculerRabaisV3(101); // 0.05
        System.out.println(rabais == 0.05);

        rabais = calculerRabaisV3(500); // 0.08
        System.out.println(rabais == 0.08);
        rabais = calculerRabaisV3(999); // 0.08
        System.out.println(rabais == 0.08);

        rabais = calculerRabaisV3(1000); // 0.09
        System.out.println(rabais == 0.09);
    }

    //la meilleur solution
    private double calculerRabaisV3(int montant) {
        double rabais;

        if (montant < 100)
            rabais = 0;
        else if (montant < 500 )
            rabais = 0.05;
        else if (montant < 1000)
            rabais = 0.08;
        else
            rabais = 0.09;

        return rabais;
    }


    private double calculerRabaisV2(int montant) {
        double rabais = 0;

        // vrai si montant n'est pas entre 0 et 50000
        if (montant < 0 && 500000 < montant) // vrai si infini, 0[ ou  ]500 000, infini
            rabais = -1;

        if (100 <= montant && montant < 500) // vrai si montant est entre [100, 500[
            rabais = 0.05;

        if (500 <= montant && montant < 1000)
            rabais = 0.08;

        if (montant >= 1000)
            rabais = 0.09;

        return rabais;
    }


    private double calculerRabaisV1(int montant) {
        double rabais = 0;

        if (montant >= 100)  //vrai si montant es entre [100, infini
            rabais = 0.05;

        if (montant >= 500)
            rabais = 0.08;

        if (montant >= 1000)
            rabais = 0.09;

        return rabais;
    }

    public static void main(String[] args) {
        new Cours10DemoSiSuite();
    }
}
