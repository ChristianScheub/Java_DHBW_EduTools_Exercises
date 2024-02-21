public class StringAnalyzer {
    public int findOccurence(String input, char charToSearch) {
        int count = 0;
        for (int i=0; i < input.length(); i++){
            if (input.charAt(i) == charToSearch) {
                count++;
            }
        }
        return count;
    }
}