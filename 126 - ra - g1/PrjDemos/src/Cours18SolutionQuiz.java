public class Cours18SolutionQuiz {
    public Cours18SolutionQuiz() {
        testerGetMinimum();
    }

    public void testerGetMinimum() {
        double t1[] = {1.1, 1.2, 1.3, 1.5};
        double t2[] = {1.1, 1.1, 1.1};
        double t3[] = {1.0, 1.1, 1.2, 1.3, 0.5};
        double t4[] = {1.1, 1.2, -0.3, 1.5, 1.6};
        double t5[] = {1.1};
        double tVide[] = {};

        System.out.println(getMinimum(t1) == 1.1);
        System.out.println(getMinimum(t2) == 1.1);
        System.out.println(getMinimum(t3) == 0.5);
        System.out.println(getMinimum(t4) == -0.3);
        System.out.println(getMinimum(t5) == 1.1);
   // System.out.println(getMinimum(tVide) == 0); //génère un ArrayIndexOutOfBoundsException
    }

    private double getMinimum(double[] tableau) {
        double vMinimum;

        if (tableau.length == 0) // si le tableau est vide
        {
            throw new ArrayIndexOutOfBoundsException("Le tableau ne doit pas être vide.");
        }

        vMinimum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < vMinimum) {
                vMinimum = tableau[i];
            }
        }
        return vMinimum;
    }


    public static void main(String[] args) {
        new Cours18SolutionQuiz();
    }
}
