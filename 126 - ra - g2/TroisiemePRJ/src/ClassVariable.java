public class ClassVariable {
    //constructeur : méthode même nom de classe
    public ClassVariable() {
        System.out.println("Démo sur les variables");
        //additionner1plus1();
        calculerAgeDuPereDeLucV3();
    }


    //Luc a 15 ans
    //Père de Quelqu'un est 3 X plus vieux
    //Quel âge à le père de quelqu'un
    //avec variabale
    private void calculerAgeDuPereDeLucV3() {
        String prenom;
        int ageEnfant;
        int agePere;
        String reponse;

        //affectation
        prenom = "Pierre-Louis";
        ageEnfant = 15;

        //le + sert à la concaténation de la chaîne
        System.out.println(prenom + " a " + ageEnfant + " ans.");

        agePere = ageEnfant * 3;

        reponse = "Age du père: \n" + prenom + " est " + agePere + " ans.";

        System.out.println(reponse);
    }


    //Luc a 15 ans
    //Père de Luc est 3 X plus vieux que Luc
    //Quel âge à le père de Luc
    //avec variabale
    private void calculerAgeDuPereDeLucV2() {
        //double = réel
        double ageLuc;
        double agePere;

        //affectation
        ageLuc = 15;

        System.out.println("Luc a " + ageLuc + " ans.");

        agePere = ageLuc * 3;

        System.out.println("Age du père à Luc est " + agePere + " ans.");
    }

    //Luc a 15 ans
    //Père de Luc est 3 X plus vieux que Luc
    //Quel âge à le père de Luc
    private void calculerAgeDuPereDeLucV1() {
        System.out.print("Le père de Luc a ");
        System.out.print(3 * 15);
        System.out.println(" ans.");
    }

    private void additionner1plus1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    //ça commence ici.
    public static void main(String[] args) {
        //instanciation : même nom
        new ClassVariable();
    }
}
