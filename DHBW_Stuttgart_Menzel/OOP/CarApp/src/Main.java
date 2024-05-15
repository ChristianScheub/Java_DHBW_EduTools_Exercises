public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("ABC123", 10000, 50, 10, 30);
        Auto auto2 = new Auto();

        // Tanken des ersten Autos
        auto1.tanken(20);

        // Fahren des ersten Autos
        auto1.fahren(200);

        // Tanken des zweiten Autos
        auto2.tanken(40);

        // Fahren des zweiten Autos
        auto2.fahren(300);

        // Ausgabe der aktuellen Werte des ersten Autos
        System.out.println("Auto 1:");
        System.out.println("Kennzeichen: " + auto1.getKennzeichen());
        System.out.println("Kilometerstand: " + auto1.getKilometerstand());
        System.out.println("Tankvolumen: " + auto1.getTankvolumen());
        System.out.println();

        // Ausgabe der aktuellen Werte des zweiten Autos
        System.out.println("Auto 2:");
        System.out.println("Kennzeichen: " + auto2.getKennzeichen());
        System.out.println("Kilometerstand: " + auto2.getKilometerstand());
        System.out.println("Tankvolumen: " + auto2.getTankvolumen());
    }
}