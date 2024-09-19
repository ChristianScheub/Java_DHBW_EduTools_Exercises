import java.util.Scanner;
import java.util.Random;

public class AccountGenerator {

    public static void main(String[] args) {
        // Scanner zum Einlesen der Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Vor- und Nachnamen vom Benutzer einlesen
        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihren Nachnamen ein (mindestens 5 Buchstaben): ");
        String nachname = scanner.nextLine();

        // Erzeuge einen zufälligen Zahlengenerator
        Random random = new Random();
        //Zufallszahl zwischen 0-89: random.nextInt(90);
        int zufallszahl = 10 + random.nextInt(90);  // Zufallszahl im Bereich 10 bis 99

        // Benutzername generieren
        String benutzername = vorname.charAt(0) + nachname.substring(0, 5) + zufallszahl;

        // Benutzername ausgeben
        System.out.println("Generierter Benutzername: " + benutzername);

        // Scanner schließen
        scanner.close();
    }
}
