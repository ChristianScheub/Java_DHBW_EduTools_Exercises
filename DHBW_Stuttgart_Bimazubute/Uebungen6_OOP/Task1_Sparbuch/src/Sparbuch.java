public class Sparbuch {
    private String kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(String kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double betrag){
        if (betrag <= 0){
            throw new IllegalArgumentException("Es kann kein negativer Betrag eingezahlt werden.");
        }else{
            kapital += betrag;
        }
    }

    public void hebeAb(double betrag){
        if (betrag <= 0 || betrag > kapital){
            throw new IllegalArgumentException("Der Betrag darf nicht negativ sein oder das Kapital übersteigen.");
        }else{
            kapital -= betrag;
        }
    }

    public void verzinse() {
        kapital = kapital*(1 + zinssatz);
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }

}
