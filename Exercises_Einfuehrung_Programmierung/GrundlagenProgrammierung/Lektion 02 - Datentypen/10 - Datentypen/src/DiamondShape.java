public class DiamondShape {
    public static void main(String[] args) {
        // Höhe der Raute
        int n = 5;
        generateDiamond(5);
    }
    public static String generateDiamond(int n) {
        StringBuilder diamond = new StringBuilder();

        // Oberer Teil der Raute
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                diamond.append(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        // Unterer Teil der Raute
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                diamond.append(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                diamond.append("*");
            }
            diamond.append("\n");
        }

        return diamond.toString();
    }
}
