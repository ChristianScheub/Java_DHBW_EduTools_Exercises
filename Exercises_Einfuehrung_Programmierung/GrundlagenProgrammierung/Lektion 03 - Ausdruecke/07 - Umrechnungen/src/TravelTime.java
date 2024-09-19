import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Geschwindigkeit
        System.out.print("Geben Sie die Geschwindigkeit (km/h) ein: ");
        int speed = scanner.nextInt();

        // Eingabe der zurückgelegten Strecke
        System.out.print("Geben Sie die zurückgelegte Strecke (km) ein: ");
        int distance = scanner.nextInt();

        // Berechnung der benötigten Zeit
        double time = (double) distance / speed;

        // Ausgabe der benötigten Zeit
        System.out.println("Die benötigte Zeit für die Reise beträgt: " + time + " Stunden.");
    }
}
