public class Task {
    public static int sumArray(int[] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {

        int[] arr = {1,5,7};

        int sum = sumArray(arr);

        System.out.print("Die Summe von dem Array {1,5,7} ist: " + sum);

    }

}
