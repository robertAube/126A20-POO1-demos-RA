import java.util.Scanner;

public class Cours06DemoRetourMethode {
    public Cours06DemoRetourMethode() {



       // calculerAgeDuPereDeQuelquUnV4(15);
//        afficherAgeDuPereDeQuelquUn(15, "Pierre");

        saisirPourCouvertirCversF();

        saisirEtAfficherVille();
//
//        afficherConversioCversF(0);
//        afficherConversioCversF(32);
//

    }

    private void saisirPourCouvertirCversF() {
        String strTempCelsius;
        double tempCelsius;
        double tempFaren;
        Scanner sc;

        //Saisir la température en Celsius
        sc = new Scanner(System.in);
        System.out.print("Donnez une température en Celsus : ");
        strTempCelsius = sc.nextLine();

        System.out.print("La température " + strTempCelsius + " Celsius ");

        //Convertir le texte dans strTempCelsius et le place dans le réel tempCelsius
        tempCelsius = Double.parseDouble(strTempCelsius);
        tempFaren = calculerCversF(tempCelsius);

        System.out.println("équivaut à " + tempFaren + " Farenheit.");
    }

    private void saisirEtAfficherVille() {
        Scanner sc;
        String ville;

        sc = new Scanner(System.in); //Instanciation du Scanner;

        System.out.print("Donnez le nom d'une ville : ");
        ville = sc.nextLine(); // Lecture au clavier de la ville

        System.out.println(ville);
    }

    private void afficherConversioCversF(double tCelsius) {
        double tFahrenheit;
        String strAffichage;

        tFahrenheit = calculerCversF(tCelsius);
        strAffichage = tCelsius + " celsius en Farenheit est : " + tFahrenheit;
        System.out.println(strAffichage);
    }

    private double calculerCversF(double tCelsius) {
        double tFahr;

        tFahr = tCelsius * 9 / 5 + 32;
        return tFahr;
    }

    private void afficherAgeDuPereDeQuelquUn(int age, String prenomFils){
        int agePere;
        System.out.print(prenomFils + " a " + age + " ans. ");
        System.out.print("Le père de " + prenomFils + " a ");
        agePere = calculerAgeDuPereDeQuelquUnV4(age);
        System.out.print(agePere);
        System.out.println(" ans.");
    }

    private int calculerAgeDuPereDeQuelquUnV4(int age) {
        int agePere;

        agePere = 3 * age;

        return agePere;
    }


    public static void main(String[] args) {
        new Cours06DemoRetourMethode();
    }
}
