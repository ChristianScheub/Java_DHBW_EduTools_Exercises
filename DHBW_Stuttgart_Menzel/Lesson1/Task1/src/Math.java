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
}
