import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Länge einlesen
        System.out.print("Geben Sie die Länge ein: ");
        int length = scanner.nextInt();

        // Breite einlesen
        System.out.print("Geben Sie die Breite ein: ");
        int breadth = scanner.nextInt();

        // Umfang berechnen
        int perimeter = 2 * (length + breadth);

        // Fläche berechnen
        int area = length * breadth;

        // Ergebnisse ausgeben
        System.out.println("Umfang: " + perimeter);
        System.out.println("Fläche: " + area);

        scanner.close();
    }
}