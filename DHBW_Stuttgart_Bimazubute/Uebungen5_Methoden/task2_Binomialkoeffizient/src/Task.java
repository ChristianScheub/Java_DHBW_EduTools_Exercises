public class Task {
    public static long binomialCoefficient(long n, long k) {

        if ( k == 0 || k == n ) {
            return 1;
        }
        else if(k > n){
            return 0;
        }
        else {
            return binomialCoefficient( n - 1, k - 1 ) + binomialCoefficient( n - 1, k );
        }

    }

}
