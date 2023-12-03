import java.util.Scanner;

public class Task {
  //put your task here
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Geben Sie einen Kleinbuchstaben ein: ");
      char kleinbuchstabe = scanner.next().charAt(0);

      System.out.print("Geben Sie einen Großbuchstaben ein: ");
      char grossbuchstabe = scanner.next().charAt(0);

      if (kleinbuchstabe - 32 == grossbuchstabe) {
          System.out.println("Die Buchstaben passen zusammen.");
      } else {
          System.out.println("Die Buchstaben passen nicht zusammen.");
      }
  }
}