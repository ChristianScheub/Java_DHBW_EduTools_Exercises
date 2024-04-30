import java.util.Random;
import java.util.Scanner;

public class ArrayShifter {
    public static void main(String[] args) {
        int[] array = generateRandomArray(20, 1, 9); // Generiere ein Array mit 20 Zufallszahlen zwischen 1 und 9
        System.out.println("Ursprüngliches Array:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nUm wie viele Felder soll das Array nach links oder rechts verschoben werden? (Negative Zahl für Links, Positive Zahl für Rechts): ");
        int shiftAmount = scanner.nextInt();

        ArrayShifter arrayShifter = new ArrayShifter();
        int[] shiftedArray = arrayShifter.shiftArray(array, shiftAmount);
        System.out.println("\nVerschobenes Array:");
        printArray(shiftedArray);

        scanner.close();
    }

    // Methode zur Generierung eines Arrays mit Zufallszahlen
    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Methode zur Ausgabe eines Arrays
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] shiftArray(int[] array, int shiftAmount) {
        int[] shiftedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + shiftAmount + array.length) % array.length;
            shiftedArray[newIndex] = array[i];
        }
        return shiftedArray;
    }
}
