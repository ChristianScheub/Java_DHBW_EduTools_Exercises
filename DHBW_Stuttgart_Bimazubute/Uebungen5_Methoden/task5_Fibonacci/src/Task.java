public class Task {
    public static long[] fibonacciNumbers(int n) {

        long[] result = new long[n];
        fibonacciHelper(result, 0, n);
        return result;

    }

    private static void fibonacciHelper(long[] result, int current, int n) {
        if (current < n) {
            if (current == 0) {
                result[current] = 0;
            } else if (current == 1) {
                result[current] = 1;
            } else {
                result[current] = result[current - 1] + result[current - 2];
            }

            fibonacciHelper(result, current + 1, n);
        }
    }

}
