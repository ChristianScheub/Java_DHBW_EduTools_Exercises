import java.util.Objects;

public class Circle {
    protected int radius, posX, posY;
    protected boolean filled;
    Circle(int rad, int x, int y, boolean filled){
        this.radius = rad;
        this.posX = x;
        this.posY = y;
        this.filled = filled;
    }

    /**
     *
     * @param o Vergleichsobjekt
     * @return wahr, wenn die Kreise gleich sind. Falsch, wenn sie ungleich sind.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && posX == circle.posX && posY == circle.posY && filled == circle.filled;
    }

    /**
     *
     * @return ein exact gleiches Circle Objekt
     */
    @Override
    protected Circle clone() {
        return new Circle(this.radius,this.posX,this.posY,this.filled);
    }

}