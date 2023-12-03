import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int zufallszahl = (int) (Math.random() * 101);

        Scanner scanner = new Scanner(System.in);
        int versuche = 0;
        int gerateneZahl;
        boolean istRichtigGeraten = false;
        int maxVersuche = 3; // Maximale Anzahl von Versuchen

        while (!istRichtigGeraten && versuche < maxVersuche) {
            System.out.print("Raten Sie die Zahl (zwischen 0 und 100): ");
            gerateneZahl = scanner.nextInt();
            versuche++;

            if (gerateneZahl == zufallszahl) {
                istRichtigGeraten = true;
                System.out.println("Korrekt! Sie haben die Zahl nach " + versuche + " Versuchen erraten.");
            } else if (gerateneZahl < zufallszahl) {
                System.out.println("Zu niedrig!");
            } else {
                System.out.println("Zu hoch!");
            }
        }

        if (!istRichtigGeraten) {
            System.out.println("Sie haben die maximale Anzahl von Versuchen überschritten.");
        }
    }
}
