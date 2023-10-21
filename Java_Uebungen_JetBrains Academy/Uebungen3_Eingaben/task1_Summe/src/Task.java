import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        // Erstelle ein Scanner-Objekt, um die Konsole zu lesen
        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            int sum = addition(n);
            System.out.print(sum);
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl als Argument ein.");
        }
    }

    public static int addition(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
