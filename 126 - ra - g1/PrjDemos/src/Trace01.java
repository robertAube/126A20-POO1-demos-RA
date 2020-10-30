public class Trace01 {
    public Trace01() {
        System.out.println("1");
        methode1();
        System.out.println("2");
    }

    private void methode1() {
        System.out.println("3");
        methode2();
        System.out.println("4");
        methode2();
        System.out.println("5");
    }

    private void methode2() {
        System.out.println("6");
    }

    public static void main(String[] args) {
        System.out.println("7");
        new Trace01();
        System.out.println("8");
    }
}

/*
Affichage exact:
7
1
3
6
4
6
5
2
8
*/