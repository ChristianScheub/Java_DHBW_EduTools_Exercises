public class Task {
    public static int findMinElement(int[] arr) {

        int min ;

        min = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,5,22,0};

        int minElement = findMinElement(arr);

        System.out.print("Das maxElement aus dem Array {1,2,5,22,0} ist: " + minElement);

    }
}
