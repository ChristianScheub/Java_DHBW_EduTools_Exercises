import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();

        randomArray.createArray();
    }

    public int[] createArray() {
        int[] array = new int[50];
        Random number = new Random();
        int sum = 0;
        double arith = 0;
        int menge = 0;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = number.nextInt(9);
            array[i] = randomNumber;
        }

        sum = doSum(array);
        System.out.println("Die Summe des Arrays beträgt: " + sum);
        arith = doArith(array);
        System.out.println("Das arithmetische Mittel des Array beträgt: " + arith);
        showQuantity(array);
        return array;
    }

    public Integer[] showQuantity(int[] array) {
        HashMap<Integer,Integer> frequencies = new HashMap<>();
        for (int x: array){
            frequencies.merge(x,1,(o, n)->o+n);
        }
        return frequencies.values().toArray(new Integer[0]);
        /*int[] frequency = new int[array.length];
        Arrays.fill(frequency, -1); // Initialisierung des Frequenz-Arrays

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = 0; // Markierung der bereits gezählten Elemente
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println("    " + array[i] + "    |    " + frequency[i]);

            }
        }
        System.out.println("----------------------------------------");
        //return frequency;*/
    }


    public double doArith(int[] array) {
        double arith = 0;
        int sum = 0;
        sum = doSum(array);
        arith = (double) sum / array.length;
        return arith;
    }

    private int doSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

}
