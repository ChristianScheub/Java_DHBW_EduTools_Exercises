public class BruttoNetto {
    public static void main(String[] args) {
        double gross;           // Bruttopreis des Produkts
        double taxrate = 19.0;  // Steuersatz in %
        double tax;             // Steuer
        double net;             // Nettopreis des Produkts

        // read gross (Bruttopreis)
        System.out.print("Geben Sie den Bruttopreis des Produkts in EUR ein: ");
        gross = new java.util.Scanner(System.in).nextDouble();

        // perform calculation as outlined within the task description
        tax = gross * taxrate / (100 + taxrate);
        net = gross - tax;

        // output result
        System.out.println("Bei einem Bruttopreis von " + gross + "EUR betraegt der Nettopreis bei " + taxrate + "% MwSt genau " + net + "EUR");
    }
}