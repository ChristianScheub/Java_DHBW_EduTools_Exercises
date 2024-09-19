public class EighthCharacter {
    public static void main(String[] args) {
        // Definiere das String-Objekt
        String introduction = "Dies ist ein Beispieltext.";

        // Überprüfe, ob die Länge des Strings mindestens 8 Zeichen beträgt
        if (introduction.length() >= 8) {
            // Gib das 8. Zeichen des Strings aus
            char eighthChar = introduction.charAt(7);  // Indizes beginnen bei 0
            System.out.println("Das 8. Zeichen des Strings ist: " + eighthChar);
        } else {
            System.out.println("Der String hat weniger als 8 Zeichen.");
        }
    }
}
