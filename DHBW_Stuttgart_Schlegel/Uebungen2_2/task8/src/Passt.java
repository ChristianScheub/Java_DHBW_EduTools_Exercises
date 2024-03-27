import java.util.Scanner;

public class Passt {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("klein: ");
    char klein = scan.nextLine().charAt(0);

    System.out.print("gross: ");
    char gross = scan.nextLine().charAt(0);

    System.out.println(vergleichen(klein, gross));
  }

  public static String vergleichen(char klein, char gross) {
    if (klein - 'a' == gross - 'A') {
      return "passen";
    } else {
      return "passen nicht";
    }
  }
}
