public class WordsSentence {

    public int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
