public class SolQuiz4 {
    public SolQuiz4() {
    //    testerGetNbCarInStr();
        testerLireCharValide();
    }

    private void testerLireCharValide() {
        System.out.println(lireCharValide("o ou n", "on"));
    }

    private void testerGetNbCarInStr() {
        System.out.println(getNbCarInStr ('b', "Bonjour Annabelle!") == 2);
        System.out.println(getNbCarInStr ('B', "Bonjour Annabelle!") == 2);
        System.out.println(getNbCarInStr ('x', "Bonjour Annabelle!") == 0);
        System.out.println(getNbCarInStr (' ', "Bonjour Annabelle!") == 1);
        System.out.println(getNbCarInStr ('x', "") == 0);
    }


    private char lireCharValide(String question, String repValide) {
        String strLu;
        boolean reponseValide = false;
        do {
            strLu = Util.lireString(question);
            if (strLu.length() > 0)
                reponseValide = getNbCarInStr(strLu.charAt(0),repValide) == 1;

        } while (!reponseValide);

        return strLu.charAt(0);
    }

    private int getNbCarInStr(char car, String str) {
        int nbCarInStr = 0;

        str = str.toLowerCase();
        car = Character.toLowerCase(car);

        for (int i = 0; i < str.length(); i++) {
            if (car == str.charAt(i)) {
                nbCarInStr++;
            }
        }

        return nbCarInStr;
    }


    public static void main(String[] args) {
        new SolQuiz4();
    }
}
