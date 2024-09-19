import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingaben vom Benutzer
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();

        System.out.print("Geben Sie Ihr Alter ein: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Geben Sie den Namen Ihrer Hochschule ein: ");
        String uni = scanner.nextLine();

        System.out.print("Geben Sie den Namen Ihres Haustiers ein: ");
        String petName = scanner.nextLine();

        // Ausgabe
        System.out.println("Hallo, mein Name ist " + name + " und ich bin " + age + " Jahre alt.");
        System.out.println("Ich genieße meine Zeit an der " + uni + ", obwohl ich mein Haustier " + petName + " sehr vermisse!");
    }
}
