public class Task {
    public static int[] reverseArray(int[] arr) {

        int [] reverseArray;

        reverseArray = new int[arr.length];
        int n = arr.length;
        for (int i = 0 ; i < reverseArray.length ; i++){
            --n;
            reverseArray[i] = arr[n];
        }

        return reverseArray;
    }

    public static void main(String[] args) {

        int[] arr = {1,2};

        int[] revArr = reverseArray(arr);

        System.out.print("Das Array 1,2 wird umgekehrt zu: " + revArr[0] + ", " + revArr[1]);

    }
}
