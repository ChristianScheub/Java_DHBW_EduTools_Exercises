public class GiroKonto extends Konto {
    protected GiroKonto(String inhaber, int kontoNR, double sollzins, double Gebuehr) {
        super(inhaber, kontoNR);
        this.sZins = sollzins;
        this.gbuehr = Gebuehr;
    }
    private double sZins;
    private double gbuehr;
    public void monatsAbrechnung() {
        if (kontostand < 0) {
            double schuldzins = kontostand * sZins;
            kontostand += schuldzins;
        }
        kontostand -= gbuehr;
    }

    @Override
    public String toString() {
        return "GiroKonto{" +
                "sZins=" + sZins +
                ", gbuehr=" + gbuehr +
                ", Inhaber='" + Inhaber + '\'' +
                ", KontoNR=" + KontoNR +
                ", kontostand=" + kontostand +
                '}';
    }
}
