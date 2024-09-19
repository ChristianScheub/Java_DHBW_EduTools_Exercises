import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Meilen
        System.out.print("Geben Sie die Meilen ein: ");
        double miles = scanner.nextDouble();

        // Umrechnung in Kilometer
        double kilometers = miles * 1.60935;

        // Ausgabe der Kilometer
        System.out.println("Die Entfernung in Kilometern beträgt: " + kilometers);
    }
}
