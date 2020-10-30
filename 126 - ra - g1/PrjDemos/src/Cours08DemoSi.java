public class Cours08DemoSi {
    public Cours08DemoSi() {
        // demontrerLeTypeBoolean();

//        afficherSiUnNombreEstPositifV1(1);
//        afficherSiUnNombreEstPositifV1(-1);

//        afficherSiUnNombreEstPositifV2(1);
//        afficherSiUnNombreEstPositifV2(-1);

//        afficherSiUnNombreEstPositifV3(1);
//        afficherSiUnNombreEstPositifV3(-1);
//        afficherSiUnNombreEstPositifV3(0);

//        afficherSiUnNombreEstPositifV4(1);
//        afficherSiUnNombreEstPositifV4(-1);
//        afficherSiUnNombreEstPositifV4(0);

        afficherSiUnNombreEstPositifV5(1);
        afficherSiUnNombreEstPositifV5(-1);
        afficherSiUnNombreEstPositifV5(0);

    }


    private void afficherSiUnNombreEstPositifV5(int nombre) {
        String str;

        str = nombre + " est un nombre ";
        if (nombre == 0)
            str += "à la fois positif et négatif.";
        else if (nombre > 0) {
            str += "positif.";
        } else {
            str += "négatif.";
        }

        System.out.println(str);
    }

    private void afficherSiUnNombreEstPositifV4(int nombre) {
        String str;

        str = nombre + " est un nombre ";
        if (nombre == 0)
            str += "à la fois positif et négatif.";
        else {
            if (nombre > 0) {
                str += "positif.";
            } else {
                str += "négatif.";
            }
        }

        System.out.println(str);
    }

    private void afficherSiUnNombreEstPositifV3(int nombre) {
        String str;

        str = nombre + " est un nombre ";
        if (nombre > 0) {
            str += "positif.";
        } else {
            str += "négatif.";
        }


        System.out.println(str);

    }

    private void afficherSiUnNombreEstPositifV2(int nombre) {
        String str;

        str = nombre + " est un nombre ";
        if (nombre > 0)
            str += "positif.";
        if (nombre < 0)
            str += "négatif.";

        System.out.println(str);

    }

    private void afficherSiUnNombreEstPositifV1(int nombre) {
        String str;

        str = nombre + " est un nombre ";
        if (nombre > 0)
            str += "positif.";

        System.out.println(str);
    }


    private void demontrerLeTypeBoolean() {
        boolean estTjVrai = true;
        boolean estTjFaux;

        estTjFaux = !estTjVrai;

        System.out.println("La valeur de estTjVrai = " + estTjVrai);
        System.out.println("La valeur de estTjFaux = " + estTjFaux);

        //le et -> && en java
        System.out.println("estTjVrai && estTjFaux -> " + (estTjVrai && estTjFaux)); //false
        System.out.println("estTjVrai && estTjVrai -> " + (estTjVrai && estTjVrai)); //true
        System.out.println("estTjVrai && estTjVrai && estTjFaux -> " + (estTjVrai && estTjVrai && estTjFaux)); //false

        //le et -> || en java
        System.out.println("estTjVrai || estTjFaux -> " + (estTjVrai || estTjFaux)); //true
        System.out.println("estTjFaux || estTjFaux -> " + (estTjFaux || estTjFaux)); //false

        // < > <= >= == !=
        System.out.println("1 < 2 -> " + (1 < 2)); //true
        System.out.println("1 > 2 -> " + (1 > 2)); //false
        System.out.println("1 != 2 -> " + (1 != 2)); //true
        System.out.println("1 == 2 -> " + (1 == 2)); //false

        int un = 1;
        int deux = 2;

        System.out.println("un <= deux -> " + (un <= deux)); //true
        System.out.println("un <= deux -> " + (3 <= deux)); //false

        System.out.println("1 < 2 || 2 > 1 || 2 == 2 -> " + (1 < 2 || 2 > 1 || 2 == 2));
    }

    public static void main(String[] args) {
        new Cours08DemoSi();
    }
}
