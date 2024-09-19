import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        int kilograms = scanner.nextInt();

        // Input weight in grams
        System.out.print("Enter weight in grams: ");
        int grams = scanner.nextInt();

        // Input weight in milligrams
        System.out.print("Enter weight in milligrams: ");
        int milligrams = scanner.nextInt();

        // Calculate total weight in milligrams
        long totalMilligrams = (kilograms * 1000000L) + (grams * 1000L) + milligrams;

        // Output the result
        System.out.printf("The equivalent weight in milligrams is: %,d mg", totalMilligrams);

        scanner.close();
    }
}