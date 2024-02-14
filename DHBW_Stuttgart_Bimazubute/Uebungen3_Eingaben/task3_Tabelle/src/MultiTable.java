import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i+ " x " +n+ " = "+ i*n);
        }



    }
}
