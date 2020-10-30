 public class TraceDemoCrs6 {
    public TraceDemoCrs6() {
        int a = 4;

        System.out.println("1 - a=" + a);
        a = afficherPourTracer1(6);
        System.out.println("2 - a=" + a);
        a = afficherPourTracer1(a);
        System.out.println("3 - a=" + a);
    }

    public int afficherPourTracer1(int b) {
        int a = 2;
        System.out.println("4 - a=" + a + "  b=" + b);
        a += 1;
        b += a;
        System.out.println("5 - a=" + a + "  b=" + b);
        return a + b;
    }
	
    public static void main(String[] args) {
        System.out.println("6");
        new TraceDemoCrs6();
        System.out.println("7");
    }
}
/*
6
1 - a=4
4 - a=2  b=6
5 - a=3  b=9
2 - a=12
4 - a=2  b=12
5 - a=3  b=15
3 - a=18
7
*/