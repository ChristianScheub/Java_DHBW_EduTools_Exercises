public class StringFormatter {

    public String removeMultipleSpaces(String input) {
        StringBuilder newString = new StringBuilder();
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                spaceCount++;
                if (spaceCount < 2) {
                    newString.append(c);
                }
            } else {
                spaceCount = 0;
                newString.append(c);
            }
        }
        return newString.toString();
    }
}
