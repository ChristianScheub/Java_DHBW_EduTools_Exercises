public class Task {
    public static void main(String[] args) {
        // Erstellen eines Scanner-Objekts, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);

        // Aufforderung zur Eingabe der Temperatur in Celsius
        System.out.print("Geben Sie die Temperatur in Celsius ein: ");
        double celsius = scanner.nextDouble();

        // Umrechnung von Celsius in Fahrenheit
        double fahrenheit = (celsius * 9) / 5 + 32;

        // Ausgabe des berechneten Fahrenheit-Werts
        System.out.println(celsius + " Grad Celsius entspricht " + fahrenheit + " Grad Fahrenheit.");
    }
}