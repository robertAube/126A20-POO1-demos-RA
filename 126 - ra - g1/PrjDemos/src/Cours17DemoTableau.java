public class Cours17DemoTableau {
    public Cours17DemoTableau() {
        char ticTacToe[][] = {{' ', 'x', ' '}, {' ', 'x', ' '}, {' ', 'x', ' '}};

        afficherTableau2D(ticTacToe);
    }

    private void afficherTableau2D(char[][] tableau2D) {
        for (int i = 0; i < tableau2D.length; i++) {
            afficherTableau(tableau2D[i]);
        }
        System.out.println();
    }

    private void afficherTableau(char[] tab) {
        String seperateur;
        String s = "[";

        for (int i = 0; i < tab.length; i++) {
            seperateur = ((i == tab.length - 1) ? "" : ", "); //Cond ? valeurSiVrai : valeurSiFaux
            s += (tab[i] + seperateur);
        }
        System.out.println(s + "]");
    }

    public static void main(String[] args) {
        new Cours17DemoTableau();
    }
}
