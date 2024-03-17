public class Lion extends Animal{
    @Override
    public boolean feed(Food food) {
        if(food.name.equalsIgnoreCase("Lion Food")){
            if(food.quantity <= 0){
                System.out.print("Lion couldn´t be fed with Lion Food");
                return false;
            }
            food.quantity -= 1;
            return true;
        }else if(food.name.equalsIgnoreCase("magic Food")){
            if(food.quantity <= 0){
                System.out.print("out of Magic Food!");
                return false;
            }
            food.quantity -= 2;
            return true;
        }
        return false;
    }
}
