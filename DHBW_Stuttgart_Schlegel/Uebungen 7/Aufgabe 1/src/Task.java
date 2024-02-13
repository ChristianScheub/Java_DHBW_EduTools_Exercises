public class Task {
    public static boolean testObjectCreation(){
        Bruch bruch = BruchRechnung.init(1,1);
        return true;
    }
    public static void main(String[] args) {
        Bruch bruch1 = BruchRechnung.init(1,4);
        Bruch bruch2 = BruchRechnung.init(1,2);

        System.out.println(bruch1+ " " +bruch2);
        System.out.println(BruchRechnung.addTo(bruch1,bruch2));
    }
}