public class Task {
    public static int findMaxElement(int[] arr) {

        int max;

        max = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,5,22,0};

        int maxElement = findMaxElement(arr);

        System.out.print("Das maxElement aus dem Array {1,2,5,22,0} ist: " + maxElement);

    }
}
