import java.util.Scanner;

public class DistanceToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Entfernung in Kilometern, Metern und Zentimetern
        System.out.print("Geben Sie die Entfernung in Kilometern ein: ");
        int kilometers = scanner.nextInt();

        System.out.print("Geben Sie die Entfernung in Metern ein: ");
        int meters = scanner.nextInt();

        System.out.print("Geben Sie die Entfernung in Zentimetern ein: ");
        int centimeters = scanner.nextInt();

        // Berechnung der Gesamtdistanz in Zentimetern
        int totalCentimeters = kilometers * 100000 + meters * 100 + centimeters;

        // Ausgabe der Gesamtdistanz in Zentimetern
        System.out.println("Die Gesamtdistanz in Zentimetern beträgt: " + totalCentimeters);
    }
}
