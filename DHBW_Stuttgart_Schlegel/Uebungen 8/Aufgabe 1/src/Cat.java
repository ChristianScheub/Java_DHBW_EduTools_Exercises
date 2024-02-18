import java.util.Arrays;

public class Cat extends Animal{
    @Override
    protected void eat() {
        this.hasEaten = true;
    }
    public void scratch(){
        System.out.println("Cat has scratched you");
    }

}
