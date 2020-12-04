public class Cours26Switch {
    public Cours26Switch() {
        testerQuelJour();
    }

    private void testerQuelJour() {
//        System.out.println(quelJour(1).equals("Dimanche"));
        System.out.println(quelJour(0));
        System.out.println(quelJour(1));
        System.out.println(quelJour(2));
    }

    private String quelJour(int noJour) {
        String strJour;
        switch (noJour) {
            case 0:   //prétexte à la démo
            case 1:
                strJour = "Dimanche";
                break;
            case 2:
                strJour = "Lundi";
                break;
            case 3:
                strJour = "Mardi";
                break;
            case 4:
                strJour = "Mercredi";
                break;
            case 5:
                strJour = "Jeudi";
                break;
            case 6:
                strJour = "Vendredi";
                break;
            case 7:
                strJour = "Samedi";
                break;

            default:
                strJour = "Valeur invalide.";
        }

        return strJour;
    }

    private String quelJourV2(int noJour) {
        String strJour;
        String [] jours = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};

        strJour = jours[noJour - 1];
        return strJour;
    }


    public static void main(String[] args) {
        new Cours26Switch();
    }
}
