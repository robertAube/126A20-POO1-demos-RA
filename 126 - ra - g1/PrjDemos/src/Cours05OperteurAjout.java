public class Cours05OperteurAjout {
    public Cours05OperteurAjout() {
        operateurAjout();
    }

    private void operateurAjout() {
        int i;

        i = 0;
        System.out.println("i = " + i);
        i += 4;
        System.out.println("i = " + i);
        i -= 2;
        System.out.println("i = " + i);
        i += 2 + 4;
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        new Cours05OperteurAjout();
    }
}
