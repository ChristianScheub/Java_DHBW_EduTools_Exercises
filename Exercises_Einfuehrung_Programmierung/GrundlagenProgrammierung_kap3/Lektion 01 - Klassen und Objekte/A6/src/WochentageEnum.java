// Deklaration eines Aufzählungstyps (Enum) für die Wochentage
public class WochentageEnum {

    // Enum für die Wochentage
    public enum Wochentag {
        MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
    }

    public static void main(String[] args) {
        // Ein Wochentag auswählen
        Wochentag heute = Wochentag.MONTAG;

        // Ausgabe des aktuellen Wochentags
        System.out.println("Heute ist: " + heute);
    }
}
