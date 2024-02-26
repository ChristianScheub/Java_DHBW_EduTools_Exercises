import java.util.Arrays;

public abstract class APolynom {
    public double[] getKoeffizienten() {
        return koeffizienten;
    }

    protected double[] koeffizienten;

    /**
     *
     * @return der Grad des Polynoms
     */
    public abstract int grad();

    /**
     *
     * @param polynom das Polynom, welches zu diesem addiert werden soll
     * @return neues addiertes Polynom
     */
    public abstract Polynom addPolynom(Polynom polynom);

    /**
     *
     * @return das abgeleitete Polynom
     */
    public abstract Polynom ableiten();

    /**
     *
     * @param x Stelle X an welcher der Wert berechnet werden soll
     * @return funktionswert von x
     */
    public abstract double wertAnStelle(double x);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polynom)) return false;
        Polynom other = (Polynom) o;
        return Arrays.equals(this.koeffizienten, other.koeffizienten);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(koeffizienten);
    }

    public int getKoeffizientLength(){
        return koeffizienten.length;
    }
}
