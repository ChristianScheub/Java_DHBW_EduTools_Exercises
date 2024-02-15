import java.util.Objects;

public class Bruch implements BruchInterface{
    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new UnsupportedOperationException("Man darf nicht durch null teilen");
        }
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    private final int nenner, zaehler;
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
}
