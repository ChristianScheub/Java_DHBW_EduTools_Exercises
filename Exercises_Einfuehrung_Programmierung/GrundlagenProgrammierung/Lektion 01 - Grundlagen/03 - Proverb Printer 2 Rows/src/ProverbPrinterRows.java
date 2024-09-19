public class ProverbPrinterRows {

    public static void main(String[] args) {

        System.out.println("Arbeit ist");
        System.out.println("Anbetung");


    }

    private static void printLine(int length, char borderChar) {
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }
}
