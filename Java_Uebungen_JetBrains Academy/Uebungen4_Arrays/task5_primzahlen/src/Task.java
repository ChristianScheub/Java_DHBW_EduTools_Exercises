public class Task {
    public static boolean[] sieveOfEratosthenes() {
        // TODO: Implementieren Sie das Sieb des Erathostenes, um alle Primzahlen kleiner als 50 zu ermitteln.
        // Das Rückgabe-Array primes sollte 'true' an einer Position haben, wenn die Zahl (Index) eine Primzahl ist.

        boolean[] primes = new boolean[50];



        return primes;
    }

    public static void main(String[] args) {

        boolean[] primes = sieveOfEratosthenes();

        for (int i = 0; i < primes.length; i++){

            System.out.println("Index: " + i + " Primzahl: " + primes[i]);

        }

    }
}
