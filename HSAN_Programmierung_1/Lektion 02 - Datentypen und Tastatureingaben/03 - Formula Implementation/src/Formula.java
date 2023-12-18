public class Formula {
    public static void main(String[] args) {
        System.out.print("Bitte geben Sie den Wert für x ein: ");
        double x = new java.util.Scanner(System.in).nextDouble();

        double result = 3 * x * x - 8 * x + 4;

        System.out.println("Bei x = " + x + " ergibt die Gleichung den Wert " + result);
    }
}
