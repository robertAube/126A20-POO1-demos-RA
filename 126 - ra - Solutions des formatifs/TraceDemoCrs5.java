public class TraceDemoCrs5 {
    public TraceDemoCrs5() {
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
        new TraceDemoCrs5();
        System.out.println("8");
    }
}
