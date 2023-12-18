public class CircleCalculator {
    public static void main(String[] args) {
        double r = 3;
        double pi = 3.14159265359;

        double u = 2 * pi * r;
        double f = pi * r * r;

        System.out.printf("Der Wert von u lautet: %3.2f, unformatiert: ", u);
        System.out.println(u);

        System.out.printf("Der Wert von f lautet: %4.5f, unformatiert: ", f);
        System.out.println(f);
    }
}
