public class Cours08DemoSi {
    public Cours08DemoSi() {
        // demontrerLeTypeBoolean();
//        afficherSiUnNombreEstPositif(4);
//        afficherSiUnNombreEstPositif(-1);
//        afficherSiUnNombreEstPositif(0);

//        afficherSiUnNombreEstPositifV1(0);
//        afficherSiUnNombreEstPositifV1(-1);
//        afficherSiUnNombreEstPositifV1(4);

        afficherSiUnNombreEstPositifV2(4);
        afficherSiUnNombreEstPositifV2(-1);
        afficherSiUnNombreEstPositifV2(0);

    }

    private void afficherSiUnNombreEstPositifV2(int nombre) {
        String str = nombre + " est un nombre ";
        if (nombre == 0) {
            str += "est à la fois positif et négatif.";
        } else if (nombre > 0) {
            str += "positif.";
        } else {
            str += "négatif.";
        }
        System.out.println(str);
    }

    private void afficherSiUnNombreEstPositifV1(int nombre) {
        String str = nombre + " est un nombre ";
        if (nombre == 0) {
            str += "est à la fois positif et négatif.";
        } else {
            if (nombre > 0) {
                str += "positif.";
            } else {
                str += "négatif.";
            }
        }
        System.out.println(str);
    }

    private void afficherSiUnNombreEstPositifV0(int nombre) {
        String str = nombre + " est un nombre ";
        if (nombre > 0) {
            str += "positif.";
        } else {
            str += "négatif.";
        }
        System.out.println(str);
    }

    private void afficherSiUnNombreEstPositif(int nombre) {
        String str = nombre + " est un nombre ";
        if (nombre > 0) {
            str += "positif.";
        }
        System.out.println(str);
    }


    private void demontrerLeTypeBoolean() {
        boolean estTjVrai = true;
        boolean estTjFaux = false;

        estTjFaux = !estTjVrai; // ! c'est un not

        System.out.println("La valeur de estTjVrai est " + estTjVrai);
        System.out.println("La valeur de estTjFaux est " + estTjFaux);

        //le et -> && en java
        System.out.println("estTjVrai && estTjFaux -> " + (estTjVrai && estTjFaux)); //false
        System.out.println("estTjVrai && estTjVrai -> " + (estTjVrai && estTjVrai)); //true
        System.out.println("estTjVrai && estTjVrai && estTjFaux-> " + (estTjVrai && estTjVrai && estTjFaux)); //false

        //le ou -> || en java
        System.out.println("estTjVrai || estTjFaux -> " + (estTjVrai || estTjFaux)); //true
        System.out.println("estTjFaux || estTjFaux -> " + (estTjFaux || estTjFaux)); //false
        System.out.println("estTjFaux || estTjVrai -> " + (estTjFaux || estTjVrai)); //true

        // < > <= >= == !=
        System.out.println("1 < 2 -> " + (1 < 2)); //true
        System.out.println("1 > 2 -> " + (1 > 2)); //false
        System.out.println("2 > 2 -> " + (2 > 2)); //false
        System.out.println("2 >= 2 -> " + (2 >= 2)); //true
        int un = 1;
        int deux = 2;
        System.out.println("un >= deux -> " + (un >= deux)); //fase
        System.out.println("2 < 2 -> " + (2 < 2)); //false
        System.out.println("2 != 2 -> " + (2 != 2)); //false
        System.out.println("un != 2 -> " + (un != 2)); //true

        System.out.println("1 < 2 || 2 > 1 || 2 == 2 -> " + (1 < 2 || 2 > 1 || 2 == 2)); //true
        System.out.println("1 < 2 || 2 > 1 || !(2 == 2) -> " + (1 < 2 || 2 > 1 || !(2 == 2))); //true
        System.out.println("1 < 2 && 2 > 1 && 2 != 2 -> " + (1 < 2 && 2 > 1 && 2 != 2)); //false

        boolean estVrai;

        estVrai = (1 < 2 || 2 > 1 || 2 != 2);
        System.out.println("estVrai -> " + estVrai);  //true
    }

    public static void main(String[] args) {
        new Cours08DemoSi();
    }
}
