import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl für die Multiplikationstabelle ein: ");
        int n;

        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Das eingegebene Argument ist keine gültige Zahl.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d x %d = %d%n", i, n, i * n);
        }
        scanner.close();
    }
}
