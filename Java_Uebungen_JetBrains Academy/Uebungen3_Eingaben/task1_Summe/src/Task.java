import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        // Erstelle ein Scanner-Objekt, um die Konsole zu lesen
        Scanner scanner = new Scanner(System.in);


        int n = 0;
        System.out.print(addition(n));

    }

    public static int addition(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
