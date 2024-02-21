public class Task {
    public static double recHarmonicNumber(int n) {

        if (n == 1){
            return 1.0;
        } else{
            return recHarmonicNumber(n- 1) + 1.0/n;
        }

    }
}
