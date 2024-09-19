import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Fahrenheit-Temperatur
        System.out.print("Geben Sie die Temperatur in Fahrenheit ein: ");
        double fahrenheit = scanner.nextDouble();

        // Umrechnung in Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Ausgabe der Celsius-Temperatur
        System.out.println("Die Temperatur in Celsius beträgt: " + celsius);
    }
}
