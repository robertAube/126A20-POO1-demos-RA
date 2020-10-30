import java.util.Scanner;

public class Cours06DemoRetourMethode {
    public Cours06DemoRetourMethode() {
    //    afficherAgePere(15, "Pierre");
    //    afficherCelsiusVersFarenh();
   //     lireAuClavierEtAfficherUneVille();
        lireEtConverirCelciusVersFarenheit();
    }

    private void lireEtConverirCelciusVersFarenheit() {
        Scanner sc; //Instance de l'utilitaire de lecture au clavier
        String strCelcius;
        double dbleCelcius;
        double dbleFara;

        //lire au clavier une température en Celcius
        sc = new Scanner(System.in);
        System.out.print("Entrer une température en celcius : ");
        strCelcius = sc.nextLine();

        System.out.print(strCelcius + "° celcius = ");

        dbleCelcius = Double.parseDouble(strCelcius);
        dbleFara = calculerCversF(dbleCelcius);

        System.out.println(dbleFara + "° farenheit");
    }

    private double calculerCversF(double temperatureCelcius) {
        double f;
        f = temperatureCelcius * 9 / 5 + 32;
        return f;
    }

    private void lireAuClavierEtAfficherUneVille() {
        Scanner sc; //Instance de l'utilitaire de lecture au clavier
        String strVille;

        sc = new Scanner(System.in);
        System.out.print("Entrer un nom de ville : "); //invite
        strVille = sc.nextLine(); //lecture au clavier d'une chaine de caractère  (String)

        System.out.println(strVille);

    }

    private void afficherCelsiusVersFarenh() {
        double farenheit;
        double celcius;

        celcius = 0;
        farenheit = calculerCversF(celcius);
        System.out.println(celcius + " Celsius = " + farenheit + " Farenheit.");

        celcius = -32;
        farenheit = calculerCversF(celcius);
        System.out.println(celcius + " Celsius = " + farenheit + " Farenheit.");
    }

    private void afficherAgePere(int ageFils, String prenomFils) {
        int agePere;
        System.out.print("Le père de " + prenomFils + " a ");
        agePere = calculerAgePere(ageFils); //15
        System.out.println(agePere + " ans.");
        ageFils += 1;
        agePere = calculerAgePere(ageFils); //16
        System.out.println(agePere + " ans.");
        agePere = calculerAgePere(ageFils + 1); //17
        System.out.println(agePere + " ans.");
        agePere = calculerAgePere(ageFils); //16
        System.out.println(agePere + " ans.");
    }


    private int calculerAgePere(int ageFils) {
        int agePere;
        agePere = ageFils * 3;
        return agePere;
    }

    //Calculer celsius vers Faren


    public static void main(String[] args) {
        new Cours06DemoRetourMethode();
    }
}
