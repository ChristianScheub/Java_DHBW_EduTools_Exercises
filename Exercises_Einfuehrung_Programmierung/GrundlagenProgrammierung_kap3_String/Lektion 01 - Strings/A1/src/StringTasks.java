public class StringTasks {

    public char getCharacterAt(String input, int index) {
        if (index < 0 || index >= input.length()) {
            throw new IllegalArgumentException("Index is out of bounds");
        }
        return input.charAt(index);
    }
}
