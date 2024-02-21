public class Task {
    public static int multiplyByTen(int number) {

        int newNumber;

        newNumber = number * 10;

        return newNumber;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Ursprüngliche Zahl: " + number);
        System.out.println("Nach Multiplikation: " + multiplyByTen(number));
    }
}
