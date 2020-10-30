public class Cours05DemoParametre {
    public Cours05DemoParametre() {
        int agePierre = 17;
        String pren = "Pierre";

        calculerAgeDuPereDeLucV2(15);

        calculerAgeDuPereDeLucV2(16);
        calculerAgeDuPereDeLucV1();
        calculerAgeDuPereDeLucV2(agePierre);
        agePierre = agePierre + 1;
        agePierre += 1;
        calculerAgeDuPereDeLucV2(agePierre);

        afficherCANenUSV1(100);
        afficherCANenUSV1(1.50);
        afficherCANenUSV2(100, 0.75);

        calculerAgeDuPereDeQuelquUnV3(12, "Jean");
        calculerAgeDuPereDeQuelquUnV3(agePierre + 3, "Pierre");
        calculerAgeDuPereDeQuelquUnV3(agePierre, pren);
    }

    //Luc a 15 ans
    //Père de Luc est 3 X plus vieux que Luc
    //Quel âge à le père de Luc
    //int age : age de Luc (argument ou paramètre)
    private void calculerAgeDuPereDeQuelquUnV3(int age, String prenom) {
        System.out.print(prenom + " a " + age + " ans. ");
        System.out.print("Le père de " + prenom + " a ");
        System.out.print(3 * age);
        System.out.println(" ans.");
    }
    private void afficherCANenUSV2(double montantCAN, double tauxChangeCANUS) {
        double montantUS;

        montantUS = montantCAN * tauxChangeCANUS;
        System.out.println(montantCAN + " en US vaut " + montantUS);
    }

    private void afficherCANenUSV1(double montantCAN) {
        System.out.println(montantCAN + " en US vaut " + montantCAN * 0.70);
    }

    //Luc a 15 ans
    //Père de Luc est 3 X plus vieux que Luc
    //Quel âge à le père de Luc
    private void calculerAgeDuPereDeLucV1() {
        int age;
        System.out.print("Le père de Luc a ");
        System.out.print(3 * 15);
        System.out.println(" ans.");
    }

    //Luc a 15 ans
    //Père de Luc est 3 X plus vieux que Luc
    //Quel âge à le père de Luc
    //int age : age de Luc (argument ou paramètre)
    private void calculerAgeDuPereDeLucV2(int age) {

        System.out.print("Luc a " + age + " ans. ");
        System.out.print("Le père de Luc a ");
        System.out.print(3 * age);
        System.out.println(" ans.");
    }


    //Faire une méthode qui reçoit en ARGUMENT un montant d'argent en CA et qui AFFICHE en US
    //si le taux est égale 0.75


    public static void main(String[] args) {
        new Cours05DemoParametre();
    }
}
