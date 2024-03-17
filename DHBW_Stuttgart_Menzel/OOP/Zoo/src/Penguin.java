public class Penguin extends Animal{
    @Override
    public boolean feed(Food food) {
        if(food.name.equalsIgnoreCase("Penguin Food")){
            if(food.quantity <= 0){
                System.out.println("Penguin couldn´t be fed with Penguin Food");
                return false;
            }
            food.quantity -= 1;
            return true;
        }else if(food.name.equalsIgnoreCase("magic Food")){
            if(food.quantity <= 0){
                System.out.print("out of Magic Food!");
                return false;
            }
            food.quantity -= 0.2;
            food.quantity = Math.round(food.quantity * 100.0) / 100.0;
            return true;
        }
        return false;
    }
}
