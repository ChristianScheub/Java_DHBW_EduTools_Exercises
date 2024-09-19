public class ProverbPrinterBox {

    public static void main(String[] args) {


        //  In einem Rahmen, der aus den Zeichen $ und # besteht
        String proverb = "Arbeit ist Anbetung";
        int length = proverb.length() + 4; // +4 für die Ränder

        // Obere Rahmenlinie
        printLine(length, '$');

        // Mittelteil des Rahmens mit dem Sprichwort
        System.out.println("# " + proverb + " #");

        // Untere Rahmenlinie
        printLine(length, '$');
    }

    private static void printLine(int length, char borderChar) {
        for (int i = 0; i < length; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }
}
