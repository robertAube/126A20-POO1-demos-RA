/*
420-126 – tp4 - Jeu de carte
Nom : Aubé
Prénom : Robert
*/

/**
 * Classe de test de votre paquet
 * Pour Fonctionner :
 * 1 - CarteTestTp4b doit préalablement passer tous les tests sur votre classe Carte.
 * 2 - Vous devez respecter les noms de méthodes données dans ce travail.
 */
public class PaquetTestsTp4bV1 {
    Paquet p;
    private boolean testReussi;
    private String descriptionTest;

    public PaquetTestsTp4bV1() {
        explications();
        unPaquetA52Cartes();
        unPaquetOrdonneEstOrdonne();
        onPeutPigerSeulement52CartesPeutImporteLeTypeDePaquet();
        testeRepeteDeOnNAPas2CartePareilDansUnPaquetMelange(10);
        unPaquetMelangeEstMelange(10);
    }

    public void explications() {
        String s;
        s = "Pour Fonctionner :";
        s += "1 - CarteTestTp4b doit préalablement passer tous les tests sur votre classe Carte.";
        s += "2 - Vous devez respecter les noms de méthodes données dans ce travail.";

        System.out.println(s);
    }

    private void afficherResultatDuTest() {
        String str;
        str = testReussi ? "Ok: " : "XXXX - Le test ne passe pas: ";
        str += descriptionTest;
        System.out.println(str);
    }

    private void unPaquetA52Cartes() {
        Paquet pMelange = new Paquet(true);
        Paquet pOrdononne = new Paquet(false);

        System.out.println("unPaquetA52Cartes()");
        descriptionTest = "Un paquet mélangé ou un paquet non mélangé ont 52 cartes au départ.";
        testReussi = pMelange.getNombreDeCartes() == 52 && pOrdononne.getNombreDeCartes() == 52;
        afficherResultatDuTest();
    }

    private void onPeutPigerSeulement52CartesPeutImporteLeTypeDePaquet() {
        System.out.println("onPeutPigerSeulement52CartesPeutImporteLeTypeDePaquet()");
        Paquet pMelange = new Paquet(true);
        Paquet pOrdononne = new Paquet(false);
        onPeutPigerSeulement52Cartes("mélangé", pMelange);
        onPeutPigerSeulement52Cartes("ordonné", pOrdononne);
    }

    private void onPeutPigerSeulement52Cartes(String typePaquet, Paquet paquet) {
        Carte c;

        descriptionTest = "Il est possible de piger 52 cartes dans le paquet " + typePaquet + ".";
        testReussi = true;
        for (int cpt = 1; cpt <= 52 && testReussi; cpt++) {
            c = paquet.piger();
            if (c == null)
                testReussi = false;
        }
        afficherResultatDuTest();

        if (testReussi) {
            descriptionTest = "Il est impossible de piger plus de 52 cartes dans le paquet " + typePaquet + ". Si on pige au delà de 52 cartes, piger doit retourner null.";
            testReussi = true;
            c = paquet.piger();
            if (c != null)
                testReussi = false;
            afficherResultatDuTest();
        }
    }

    private void unPaquetOrdonneEstOrdonne() {
        String paquetOrdonneValeurCouleur = "1 de pique1 de trèfle1 de carreau1 de coeur2 de pique2 de trèfle2 de carreau2 de coeur3 de pique3 de trèfle3 de carreau3 de coeur4 de pique4 de trèfle4 de carreau4 de coeur5 de pique5 de trèfle5 de carreau5 de coeur6 de pique6 de trèfle6 de carreau6 de coeur7 de pique7 de trèfle7 de carreau7 de coeur8 de pique8 de trèfle8 de carreau8 de coeur9 de pique9 de trèfle9 de carreau9 de coeur10 de pique10 de trèfle10 de carreau10 de coeur11 de pique11 de trèfle11 de carreau11 de coeur12 de pique12 de trèfle12 de carreau12 de coeur13 de pique13 de trèfle13 de carreau13 de coeur";
        String paquetOrdonneCouleurValeur = "1 de pique2 de pique3 de pique4 de pique5 de pique6 de pique7 de pique8 de pique9 de pique10 de pique11 de pique12 de pique13 de pique1 de trèfle2 de trèfle3 de trèfle4 de trèfle5 de trèfle6 de trèfle7 de trèfle8 de trèfle9 de trèfle10 de trèfle11 de trèfle12 de trèfle13 de trèfle1 de carreau2 de carreau3 de carreau4 de carreau5 de carreau6 de carreau7 de carreau8 de carreau9 de carreau10 de carreau11 de carreau12 de carreau13 de carreau1 de coeur2 de coeur3 de coeur4 de coeur5 de coeur6 de coeur7 de coeur8 de coeur9 de coeur10 de coeur11 de coeur12 de coeur13 de coeur";
        String strPaquetOrdonne;
        Paquet pOrdononne = new Paquet(false);


        descriptionTest = "Votre paquet contient l'ensemble des cartes d'un paquet ordonnée";
        strPaquetOrdonne = paquetToString(pOrdononne);
        testReussi = strPaquetOrdonne.equalsIgnoreCase(paquetOrdonneCouleurValeur) || strPaquetOrdonne.equalsIgnoreCase(paquetOrdonneValeurCouleur);
        afficherResultatDuTest();
    }

    private void unPaquetMelangeEstMelange(int nbPaquet) {
        String tabStrPaquet[] = new String[nbPaquet];
        Paquet p;

        if (nbPaquet < 2) {
            descriptionTest = "Pour être significatif le test paquets unPaquetMelangeEstMelange() doit avoir plus d'un paquet à comparer.";
            testReussi = false;
        } else {
            descriptionTest = nbPaquet + " paquets mélangés sont différents.";
            testReussi = true;
            for (int i = 0; i < tabStrPaquet.length && testReussi; i++) {
                p = new Paquet(true);
                tabStrPaquet[i] = paquetToString(p);
                for (int j = 0; j < i && testReussi; j++) {
                    testReussi = !tabStrPaquet[j].equalsIgnoreCase(tabStrPaquet[i]);
                }
            }
        }
        afficherResultatDuTest();
    }

    private String paquetToString(Paquet paquet) {
        String strPaquet;
        Carte c;

        strPaquet = "";
        for (int cpt = 1; cpt <= 52; cpt++) {
            c = paquet.piger();
            strPaquet += c.toString();
        }

        return strPaquet;
    }

    private void testeRepeteDeOnNAPas2CartePareilDansUnPaquetMelange(int nbTeste) {
        System.out.println("testeRepeteDeOnNAPas2CartePareilDansUnPaquetMelange(int nbTeste)");
        testReussi = true;
        descriptionTest = "Un paquet mélangé n'a jamais 2 cartes pareilles.";
        for (int i = 0; i < nbTeste && testReussi; i++) {
            testReussi = onNAPas2CartePareilDansUnPaquetMelange();
        }
        afficherResultatDuTest();
    }

    private boolean onNAPas2CartePareilDansUnPaquetMelange() {
        Paquet pMelange = new Paquet(true);
        Carte[] paquetTest = getCartesFromPaquet(pMelange);

        testReussi = true;
        for (int i = 0; i < pMelange.getNombreDeCartes() && testReussi; i++) {
            for (int j = 0; j < pMelange.getNombreDeCartes() && testReussi; j++) {
                if (i != j) {
                    if (paquetTest[i].toString().equals(paquetTest[j])) {
                        testReussi = false;
                    }
                }
            }
        }
        return testReussi;
    }

    private Carte[] getCartesFromPaquet(Paquet paquet) {
        Carte c;
        Carte[] tabPaquet = new Carte[52];

        for (int i = 0; !paquet.estVide(); i++) {
            c = paquet.piger();
            tabPaquet[i] = c;
        }
        return tabPaquet;
    }

    public static void main(String[] args) {
        new PaquetTestsTp4bV1();
    }
}
