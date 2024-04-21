public class ArrayShifter {
    // Methode zur Verschiebung des Arrays um eine bestimmte Anzahl von Feldern
    public int[] shiftArray(int[] array, int shiftAmount) {
        int[] shiftedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + shiftAmount + array.length) % array.length;
            shiftedArray[newIndex] = array[i];
        }
        return shiftedArray;
    }
}
