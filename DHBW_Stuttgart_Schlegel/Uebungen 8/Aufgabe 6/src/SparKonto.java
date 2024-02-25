public class SparKonto extends Konto {
    protected SparKonto(String inhaber, int kontoNR, double habenZins) {
        super(inhaber, kontoNR);
        this.hZins = habenZins;
    }

    private double hZins;

    public void jahresZins() {
        double zinsbetrag = kontostand * hZins;
        kontostand += zinsbetrag;
    }

    @Override
    public void einAusZahlung(double betrag) {
        if(((kontostand + betrag)<0) && (betrag < 0)){
            betrag = kontostand;
            System.err.println("Sparkonto darf nicht überzogen werden. Neuer Betrag: "+betrag);
        }
        super.einAusZahlung(betrag);
    }

    @Override
    public String toString() {
        return "SparKonto{" +
                "hZins=" + hZins +
                ", Inhaber='" + Inhaber + '\'' +
                ", KontoNR=" + KontoNR +
                ", kontostand=" + kontostand +
                '}';
    }
}
