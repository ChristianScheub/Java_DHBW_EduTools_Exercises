public class Auto {
    private final String kennzeichen;
    private double kilometerstand;
    private final double tankvolumen;
    private final double kraftstoffverbrauch;
    private double kraftstoffmenge;

    // Konstruktor ohne Werte (default)
    public Auto() {
        this.kennzeichen = "Kein Kennzeichen";
        this.kilometerstand = 0.0;
        this.tankvolumen = 50.0; // Standard-Tankvolumen
        this.kraftstoffverbrauch = 8.0; // Standard-Verbrauch pro 100 Kilometer
        this.kraftstoffmenge = 0.0;
    }

    // Konstruktor mit Startwerten
    public Auto(String kennzeichen, double kilometerstand, double tankvolumen, double kraftstoffverbrauch, double kraftstoffmenge) {
        this.kennzeichen = kennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
        this.kraftstoffmenge = kraftstoffmenge;
    }

    // Tanken-Methode
    public void tanken(double menge) {
        if (menge <= 0) {
            System.out.println("Fehler: Ungültige Tankmenge.");
            return;
        }
        if (kraftstoffmenge + menge > tankvolumen) {
            System.out.println("Fehler: Tankvolumen überschritten.");
            return;
        }
        kraftstoffmenge += menge;
        System.out.println("Erfolgreich getankt. Neue Kraftstoffmenge: " + kraftstoffmenge);
    }

    // Fahren-Methode
    public void fahren(double strecke) {
        if (strecke <= 0) {
            System.out.println("Fehler: Ungültige Fahrstrecke.");
            return;
        }
        double verbrauch = (strecke / 100) * kraftstoffverbrauch;
        if (verbrauch > kraftstoffmenge) {
            System.out.println("Fehler: Nicht genug Kraftstoff für diese Strecke.");
            return;
        }
        kraftstoffmenge -= verbrauch;
        kilometerstand += strecke;
        System.out.println("Erfolgreich gefahren. Neuer Kilometerstand: " + kilometerstand + ", Neue Kraftstoffmenge: " + kraftstoffmenge);
    }

    // Getter für KFZ-Kennzeichen
    public String getKennzeichen() {
        return kennzeichen;
    }

    // Getter für Kilometerstand
    public double getKilometerstand() {
        return kilometerstand;
    }

    // Getter für Tankvolumen
    public double getTankvolumen() {
        return tankvolumen;
    }
}
