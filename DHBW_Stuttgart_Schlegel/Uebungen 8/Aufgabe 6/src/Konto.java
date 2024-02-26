public abstract class Konto {
    protected final String Inhaber;
    protected final int KontoNR;
    protected double kontostand;

    public String getInhaber() {
        return Inhaber;
    }

    public int getKontoNR() {
        return KontoNR;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    protected Konto(String inhaber, int kontoNR) {
        Inhaber = inhaber;
        KontoNR = kontoNR;
        kontostand = 0.0;
    }

    public void einAusZahlung(double Betrag){
        kontostand += Betrag;
    }
}
