public class Fahrzeug {
    private final String typ;
    private final String eigentuemer;
    Fahrzeug(String typ,String eigentuemer){
        this.eigentuemer = eigentuemer;
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public String getEigentuemer() {
        return eigentuemer;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "typ='" + typ + '\'' +
                ", eigentuemer='" + eigentuemer + '\'' +
                '}';
    }
}
