public class Main {

    public static void main(String[] args) {

        Math newMath = new Math();

        double a = 9;
        double b = 10;
        double result = 0;
        char operation = '+';

        result = newMath.doCalculation(a, b, operation);
        System.out.println(result);

    }
}