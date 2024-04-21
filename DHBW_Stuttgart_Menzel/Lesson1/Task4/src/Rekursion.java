import java.util.Scanner;

public class Rekursion {

    public static long fib(long n) {
        if (n<=1) {
            return n;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }

    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Wie viele Fibonacci Zahlen möchtest du ausgeben? (Gültig: Ganzzahlen > -1)");
            n = input.nextInt();
        } while (n<0);
        input.close();

        for (int i=0; i<n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}