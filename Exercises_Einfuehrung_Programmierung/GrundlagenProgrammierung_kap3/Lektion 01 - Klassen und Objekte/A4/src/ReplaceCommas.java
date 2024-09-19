public class ReplaceCommas {
    public static void main(String[] args) {

        String sentence = "Hallo, wie geht es dir, heute?";

        String corrected = sentence.replace(',', ':');

        // Ausgabe des ursprünglichen und des geänderten Strings
        System.out.println("Ursprünglicher String: " + sentence);
        System.out.println("Geänderter String: " + corrected);
    }
}
