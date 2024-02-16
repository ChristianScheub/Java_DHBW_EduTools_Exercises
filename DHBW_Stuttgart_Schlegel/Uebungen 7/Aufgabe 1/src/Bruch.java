

public class Bruch implements BruchInterface{
    private final int nenner, zaehler;
    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }


    @Override
    public int getNenner() {
        return nenner;
    }
    @Override
    public int getZaehler() {
        return zaehler;
    }

    public String toString() {
        Bruch tmpBruch = new BruchRechnung().kuerzen(this);
        StringBuilder out = new StringBuilder();
        out.append(tmpBruch.getZaehler());
        out.append('/');
        out.append(tmpBruch.getNenner());
        out.append(" = ");
        double tmp = (double)tmpBruch.getZaehler()/(double) tmpBruch.getNenner();
        out.append(tmp);
        return out.toString();
    }
// Do not delete or Tests will fail.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bruch bruch = (Bruch) o;
        return nenner == bruch.getNenner() && zaehler == bruch.getZaehler();
    }

}
