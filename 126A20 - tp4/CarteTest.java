public class CarteTest {
    private boolean testReussi;
    private String descriptionTest;

    public CarteTest() {
        testerValiderCouleur();
        testerValiderValeur();
        testerConstructeurs();
        testerMutateursEtAccesseur_couleur();
        testerMutateursEtAccesseur_valeur();
        tester_toString();
    }

    private void afficherResultatDuTest() {
        String str;
        str = testReussi ? "Ok: " : "XXXX - Le test ne passe pas: ";
        str += descriptionTest;
        System.out.println(str);
    }

    private void testerValiderCouleur() {
        String[] couleursValides = {"pique", "trèfle", "carreau", "coeur"};
        String[] couleursInValides = {"", "trefle", "careau", "chat"};

        System.out.println("testerValiderCouleur()");

        descriptionTest = "Toutes les couleurs valides passent en minuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi ; i++) {
            testReussi = Carte.couleurEstValide(couleursValides[i]);
        }
        afficherResultatDuTest();

        descriptionTest = "Toutes les couleurs valides passent en majuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi ; i++) {
            testReussi = Carte.couleurEstValide(couleursValides[i].toUpperCase());
        }
        afficherResultatDuTest();

        descriptionTest = "Toutes les couleurs invalides ne passent pas.";
        testReussi = true;
        for (int i = 0; i < couleursInValides.length && testReussi ; i++) {
            testReussi = !Carte.couleurEstValide(couleursInValides[i].toUpperCase());
        }
        afficherResultatDuTest();
    }


    private void testerValiderValeur() {
        System.out.println("testerValiderValeur()");
        descriptionTest = "Les valeurs entre 1 et 13 sont valides.";
        testReussi = true;
        for (int valeur = 1; valeur <= 13 && testReussi; valeur++) {
            testReussi = Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();

        descriptionTest = "Une valeur inférieur à 1 sont invalides.";
        for (int valeur = -20; valeur <= 0 && testReussi; valeur++) {
            testReussi = !Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();

        descriptionTest = "Une valeur supérieur à 13 sont invalides.";
        for (int valeur = 14; valeur <= 60 && testReussi; valeur++) {
            testReussi = !Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();
    }


    private void testerMutateursEtAccesseur_couleur() {
        String[] couleursValides = {"pique", "trèfle", "carreau", "coeur"};
        Carte carte;

        System.out.println("testerMutateursEtAccesseur_couleur()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Mutateur de couleur";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi ; i++) {
            carte.setCouleur(couleursValides[i]);
            testReussi = carte.getCouleur().equals(couleursValides[i]);
        }
        afficherResultatDuTest();

        descriptionTest = "Mutateur de couleur accepte aussi les majuscules, mais retourne toujours en minuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi ; i++) {
            carte.setCouleur(couleursValides[i].toUpperCase());
            testReussi = carte.getCouleur().equals(couleursValides[i]);
        }
        afficherResultatDuTest();
    }

    private void testerMutateursEtAccesseur_valeur() {
        Carte carte;

        System.out.println("testerMutateursEtAccesseur_valeur()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Mutateur de couleur";
        testReussi = true;
        for (int valeur = 1; valeur <= 13 && testReussi; valeur++) {
            carte.setValeur(valeur);
            testReussi = carte.getValeur() == valeur;
        }
        afficherResultatDuTest();

        descriptionTest = "Une valeur inférieur à 1 lance une exception.";
        for (int valeur = -20; valeur <= 0 && testReussi; valeur++) {
            testReussi = false;
            try {
                carte.setValeur(valeur);
            } catch (IllegalArgumentException e) {
                testReussi = true;
            }
        }
        afficherResultatDuTest();

        descriptionTest = "Une valeur supérieur à 13 lance une exception.";
        for (int valeur = 14; valeur <= 60 && testReussi; valeur++) {
            testReussi = false;
            try {
                carte.setValeur(valeur);
            } catch (IllegalArgumentException e) {
                testReussi = true;
            }
        }
        afficherResultatDuTest();

    }


    private void testerConstructeurs() {
        Carte carte;

        System.out.println("testerConstructeurs()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Le constucteur place la bonne valeur de carte.";
        testReussi = (carte.getValeur() == 1);
        afficherResultatDuTest();

        descriptionTest = "Le constucteur place la bonne couleur de carte.";
        testReussi = carte.getCouleur().equals("coeur");
        afficherResultatDuTest();

        descriptionTest = "Une valeur invalide lance une exception";
        testReussi = false;
        try {
            carte = new Carte(-1, "coeur");
        } catch (IllegalArgumentException e) {
            testReussi = true;
        }
        afficherResultatDuTest();

        descriptionTest = "Une couleur invalide lance une exception.";
        testReussi = false;
        try {
            carte = new Carte(1, "ccoeur");
        } catch (IllegalArgumentException e) {
            testReussi = true;
        }
        afficherResultatDuTest();
    }

    private void tester_toString() {
        Carte[] tabCarte = {new Carte(1, "pique"), new Carte(10, "trèfle"), new Carte(13, "carreau"), new Carte (2, "coeur")};
        String[] strAttendu = {"1 de pique", "10 de trèfle", "13 de carreau", "2 de coeur"};
        Carte carte;
        String retourToString;

        System.out.println("tester_toString()");

        carte = new Carte(1, "coeur");

        descriptionTest = "La carte retourne la bonne chaine.";
        testReussi = true;
        for (int i = 0; i < tabCarte.length && testReussi ; i++) {
            retourToString = tabCarte[i].toString();
            testReussi = retourToString.equals(strAttendu[i]);
        }
        afficherResultatDuTest();
    }

    public static void main(String[] args) {
        new CarteTest();
    }
}
