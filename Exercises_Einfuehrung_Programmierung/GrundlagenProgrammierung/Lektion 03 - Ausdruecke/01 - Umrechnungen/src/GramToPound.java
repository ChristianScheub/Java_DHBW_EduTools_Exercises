import java.util.Scanner;

public class GramToPound {

        public static void main(String[] args) {

            // Constant for conversion
            final double GRAMS_PER_POUND = 453.592;

            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter the weight in grams: ");
            double grams = scanner.nextDouble();

            // Convert grams to pounds
            double pounds = grams / GRAMS_PER_POUND;

            // Print the result
            System.out.printf("%.2f grams is equal to %.4f pounds%n", grams, pounds);

            // Close the scanner
            scanner.close();

        }

}

