public class Fahrzeug {
    private Point position;
    private int anzahlRaeder;
    private double leergewicht;
    private double aktuelleGeschwindigkeit;

    public Fahrzeug(int x, int y, int anzahlRaeder, double leergewicht, double startGeschwindigkeit) {
       this.position = new Point(x,y);
       this.anzahlRaeder = anzahlRaeder;
       this.leergewicht = leergewicht;
       this.aktuelleGeschwindigkeit = startGeschwindigkeit;
    }

    public void beschleunigen(double wert) {
        this.aktuelleGeschwindigkeit += wert;
    }

    public void fahren(int dx, int dy) {
        this.position.move(dx,dy);
    }

    public double getAktuelleGeschwindigkeit() {
        return this.aktuelleGeschwindigkeit;
    }

    public Point getPosition(){
        return this.position;
    }

}
