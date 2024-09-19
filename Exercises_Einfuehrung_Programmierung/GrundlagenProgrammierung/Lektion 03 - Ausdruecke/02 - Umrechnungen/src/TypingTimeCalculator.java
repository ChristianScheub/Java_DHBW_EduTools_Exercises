import java.util.Scanner;

public class TypingTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input typing speed
        System.out.print("Geben Sie die Tippgeschwindigkeit (Zeichen pro Minute) ein: ");
        int typingSpeed = scanner.nextInt();

        // Input number of characters
        System.out.print("Geben Sie die Anzahl der Zeichen im Dokument ein: ");
        int characterCount = scanner.nextInt();

        // Calculate required time
        float requiredTime = (float) characterCount / typingSpeed;

        // Output the result
        System.out.printf("The time required for typing is %.2f minutes.", requiredTime);

        scanner.close();
    }
}
