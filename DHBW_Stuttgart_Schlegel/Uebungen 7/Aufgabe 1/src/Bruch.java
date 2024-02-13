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
        StringBuilder out = new StringBuilder();
        out.append(this.getZaehler());
        out.append('/');
        out.append(this.getNenner());
        out.append(" = ");
        double tmp = (double)this.getZaehler()/(double) this.getNenner();
        out.append(tmp);
        return out.toString();
    }
}
