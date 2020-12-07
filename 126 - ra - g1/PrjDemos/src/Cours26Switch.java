public class Cours26Switch {

    public Cours26Switch() {
        testerJourTravaille();
    }

    private void testerJourTravaille() {
        String str;
        for (int noJour = 1; noJour <= 8; noJour++) {
            str = "Le jour " + noJour + " est un " + quelJour(noJour);
            str += " et est jour " + jouerTravaille(noJour) + ".";
            System.out.println(str);
        }
    }

    private String jouerTravaille(int noJour) {
        String strJour = "";
        switch (noJour) {
            case 7: //samedi
            case 1:
                strJour= "vacances";
                break;
            case 2: //lundi
            case 3: //mardi
            case 4: //mercredi
            case 5: //jeudi
            case 6: //vendredi
                strJour= "travaillé";
                break;
            default:
                throw new IllegalArgumentException("Exception : Jour invalide = " + noJour);

        }
        return strJour;
    }

    public String quelJour(int noJour) {
        String jourSemaine;

        switch (noJour) {
            case 1:
                jourSemaine = "Dimanche";
                break;
            case 2:
                jourSemaine = "Lundi";
                break;
            case 3:
                jourSemaine = "Mardi";
                break;
            case 4:
                jourSemaine = "Mercredi";
                break;
            case 5:
                jourSemaine = "Jeudi";
                break;
            case 6:
                jourSemaine = "Vendredi";
                break;
            case 7:
                jourSemaine = "Samedi";
                break;
            default:
                throw new IllegalArgumentException("Exception : Jour invalide = " + noJour);
        }
        return jourSemaine;
    }



    public static void main(String[] args) {
        new Cours26Switch();
    }
}
