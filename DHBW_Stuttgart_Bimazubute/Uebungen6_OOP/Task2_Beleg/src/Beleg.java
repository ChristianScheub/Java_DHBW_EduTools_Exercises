public class Beleg {
    private static int next = 10000;
    private int belegNummer;
    public Beleg() {
        this.belegNummer = next++;
    }
    public int getBelegNummer() {
        return belegNummer;
    }
    public static void resetBelegNummer() {
        next = 10000;
    }
}