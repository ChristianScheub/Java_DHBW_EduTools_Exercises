public class PrintInteger {

    public static void main(String[] args) {

        int start = 1000;
        int end   = 2000;
        int intPerLine = 5;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if ((i + 1) % intPerLine == 0) {
                System.out.println();
            }
        }

    }

}
