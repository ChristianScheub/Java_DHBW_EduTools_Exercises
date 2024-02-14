public class Auftrag {
    private Artikel artikel;
    private int menge;

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getAuftragswert() {
        return menge * artikel.getPreis();
    }

    public static double getGesamtwert(Auftrag... auftraege) {
        double gesamt = 0;

        for (Auftrag a : auftraege) {
            gesamt += a.getAuftragswert();
        }

        return gesamt;
    }
}