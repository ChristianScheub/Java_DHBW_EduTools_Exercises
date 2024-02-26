import java.util.Scanner;

public class Passt
{
  public static void main(String[] args)
  {
    java.util.Scanner scan = new java.util.Scanner( System.in );

    System.out.print("klein: ");
    char klein = scan.nextLine().charAt(0);

    System.out.print("gross: ");
    char gross = scan.nextLine().charAt(0);
    if (klein - 'a' == gross - 'A') {
      System.out.println("passen");
    } else {
      System.out.println("passen nicht");
    }
  }
}
