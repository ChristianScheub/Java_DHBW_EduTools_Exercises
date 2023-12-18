public class ErroneousJava {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int h = 4;

        double v = x * y / 3.0 * h;

        System.out.printf("v = %3.2f", v);
    }

}