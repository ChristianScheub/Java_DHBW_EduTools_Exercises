public class HourglassPrinter {

    public static void main(String[] args) {
    int size  = 9;

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row <= size / 2) {
                    if (column >= row && column < size - row) {
                        sb.append("#");
                    } else {
                        sb.append(" ");
                    }
                } else {
                    if (column >= size - 1 - row && column <= row) {
                        sb.append("#");
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());



}


}
