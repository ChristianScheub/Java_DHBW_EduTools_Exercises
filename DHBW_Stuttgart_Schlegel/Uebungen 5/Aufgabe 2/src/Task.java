public class Task {

    static void printDual(long zahl) {
        long rest = 0;

        if (zahl > 0)
        {
            rest = zahl % 2;
            printDual(zahl / 2);
            System.out.print(rest);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Eingabe positive Zahl>0: ");
        java.util.Scanner scan = new java.util.Scanner(System.in );

        long zahl = scan.nextLong();
        if( zahl > 0 )
        {
            printDual(zahl);
        }
        else
        {
            System.out.println("Nur positive Zahlen!");
        }
    }
}
