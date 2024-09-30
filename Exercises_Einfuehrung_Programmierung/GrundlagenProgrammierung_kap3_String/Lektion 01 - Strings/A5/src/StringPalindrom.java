public class StringPalindrom {

    public boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }
}
