public class UppercaseString {
    public static void main(String[] args) {
        // Definiere das String-Objekt "name"
        String name = "Hallo Welt";

        // Deklariere die Variable "str" und weise ihr den Großbuchstaben-String zu
        String upperCaseVariable = name.toUpperCase();

        // Ausgabe des ursprünglichen und des umgewandelten Strings
        System.out.println("Originaler String: " + name);
        System.out.println("String in Großbuchstaben: " + upperCaseVariable);
    }
}
