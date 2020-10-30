import java.util.Scanner;

public class Formatif3RA {
    public Formatif3RA() {
        System.out.println(lireString("Quel est votre prénom ? "));

        String  reponse = lireString("Où allez-vous ? ");
        System.out.println(reponse);

        lireString("À quel cégep tu vas ? ");
        System.out.println("Intéressant...");

        //System.out.println(lireEntier("Quel âge avez-vous ? "));
    }

    private String lireString(String question) {
        Scanner sc = new Scanner(System.in);
        String strReponse;

        System.out.println(question);
        strReponse = sc.nextLine();
        return strReponse;
    }

    public static void main(String[] args) {
        new Formatif3RA();
    }
}
