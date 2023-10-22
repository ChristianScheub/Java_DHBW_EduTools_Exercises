public class Task {
    public static int binomialCoefficient(int n, int k) {
        // Basisfall 1: Wenn k gleich 0 oder k gleich n ist, ist der Binomialkoeffizient 1.
        if (k == 0 || k == n) {
            return 1;
        }

        // Basisfall 2: Wenn k größer als n ist, ist der Binomialkoeffizient 0.
        if (k > n) {
            return 0;
        }

        // Ansonsten berechnen wir den Binomialkoeffizienten rekursiv mit der Formel C(n, k) = C(n-1, k-1) + C(n-1, k).
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

}
