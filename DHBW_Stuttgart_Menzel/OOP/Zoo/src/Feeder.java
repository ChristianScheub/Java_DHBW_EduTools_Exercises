import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Feeder {
    private final Scanner input = new Scanner(System.in);
    public int lions;
    public int penguins;
    private Food food;
    private Food foodLion;
    private Food foodPeng;
    private List<Animal> animals;
    private int day = 0;
    public Feeder(Food food, Food foodLion, Food foodPenguin) {
        this.food = food;
        this.foodLion = foodLion;
        this.foodPeng = foodPenguin;
        this.animals = new LinkedList<>();
        initAnimals();
    }
    public int simulateDay(){
        boolean animaldied;
        do {
            System.out.println("it´s day " + (++day));
            System.out.print("you have: ");
            printAnimals();
            printFood();
            System.out.println("Sell an Animal ? [Y/N]");
            if(input.nextLine().contains("Y")){
                sellAnimal();
            }
            System.out.println("feeding Animals...");
            animaldied = feedAnimals();
        }while (!animaldied);
        return day;
    }
    private void printFood(){
        System.out.println(food);
        System.out.println(foodLion);
        System.out.println(foodPeng);
    }
    private boolean feedAnimals(){
        for(Animal animal: animals){
            if(animal instanceof Lion){
                boolean tmp = animal.feed(foodLion);
                if(!tmp){
                    tmp =animal.feed(food);
                    if(!tmp) {
                        System.out.println("a Lion died");
                        return true;
                    }
                }
            }
            if(animal instanceof Penguin){
                boolean tmp = animal.feed(foodPeng);
                if(!tmp){
                    tmp =animal.feed(food);
                    if(!tmp) {
                        System.out.println("a Penguin died");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private void sellAnimal(){
        printAnimals();
        System.out.println("Sell a Lion or Penguin? [L/P]");
        String line = input.nextLine();
        if(line.contains("L")){
            if(lions<=0){
                System.out.println("not enough lions! aborting...");
                return;
            }
            lions--;
            for (Animal animal: animals){
                if(animal instanceof Lion){
                    animals.remove(animal);
                    System.out.println("Removed 1 Lion");
                    System.out.println("Compensation: 10 Magic Food");
                    food.quantity += 10;
                    return;
                }
            }
            throw new RuntimeException();
        } else if (line.contains("P")) {
            if(penguins<=0){
                System.out.println("not enough penguins! aborting...");
                return;
            }
            penguins--;
            for (Animal animal: animals){
                if(animal instanceof Penguin){
                    animals.remove(animal);
                    System.out.println("Removed 1 Penguin");
                    System.out.println("Compensation: 5 Magic Food");
                    food.quantity += 5;
                    return;
                }
            }
        } else {
            System.out.print("Invalid input retry ? [Y/N]");
            if(input.nextLine().contains("Y")){
                sellAnimal();
            }
            System.out.println("Retry aborted...");
        }
    }
    private void printAnimals(){
        System.out.println("You have the following Animals: ");
        System.out.println(lions+ " Lions and "+penguins+" Penguins");
    }
    public void initAnimals(){
        for (int i = 0; i < 4 ; i++) {
            animals.add(new Lion());
            lions++;
        }
        for (int i = 0; i < 10; i++) {
            animals.add(new Penguin());
            penguins++;
        }
    }

}
