public class Food {
    public double quantity;
    String name;

    @Override
    public String toString() {
        return "Food: " + name +
                " quantity=" + quantity;
    }

    Food(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
