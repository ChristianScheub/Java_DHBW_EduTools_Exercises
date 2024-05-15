public class Math {
    double doCalculation(double a, double b, char operation) {
        double result=0;
        if(operation == '+'){
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '/') {
            result = a / b;
        }
        else if(operation == '*') {
            result = a * b;
        }

        return result;

    };

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
