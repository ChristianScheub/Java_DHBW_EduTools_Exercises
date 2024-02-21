public class Task {
    public static boolean[] sieveOfEratosthenes() {

        boolean[] primes = new boolean[50];

        for ( int i = 2; i < primes.length; i++ ) {
            primes[i] = true;
        }

        for ( int i = 2; i < primes.length; i++ ){
            if ( primes[i]  ){                                     // i ist Primzahl
                for (int j = 2*i; j < primes.length; j=j+i) {     //Markiere Vielfache von i als nicht Primzahl
                    primes[j] = false;
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        boolean[] primes = sieveOfEratosthenes();

        for (int i = 0; i < primes.length; i++){

            System.out.println("Index: " + i + " Primzahl: " + primes[i]);

        }

    }
}
