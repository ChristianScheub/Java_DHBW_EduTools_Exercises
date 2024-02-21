
public class Summe {

    public static int sumInt(int n){

        int sum = 0;

        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }

        return sum;
    }



    public static void main(String[] args) {

        // TODO: Führen Sie die main Methode aus, um ihre Methode zu testen

        int sum = sumInt(5);

        System.out.print("Die Summe von 5 ist: " + sum);

    }
}
