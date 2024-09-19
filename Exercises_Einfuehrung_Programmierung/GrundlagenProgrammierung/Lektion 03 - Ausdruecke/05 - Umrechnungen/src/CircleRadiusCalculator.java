import java.util.Scanner;

public class CircleRadiusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the circumference
        System.out.print("Geben Sie den Umfang des Kreises an: ");
        double circumference = scanner.nextDouble();

        // Calculate the radius using the formula: radius = circumference / (2 * π)
        double radius = circumference / (2 * Math.PI);

        // Print the calculated radius
        System.out.println("The radius of the circle is: " + radius);
    }
}
