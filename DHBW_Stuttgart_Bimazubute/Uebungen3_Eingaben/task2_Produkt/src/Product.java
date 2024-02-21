
public class Product {

    public static int multiInt(int n){

        int product = 1;

        for(int i = 1; i<=n; i++){
            product = product * i;
        }

        return product;
    }



    public static void main(String[] args) {

        // TODO: Führen Sie die main Methode aus, um ihre Methode zu testen

        int product = multiInt(5);

        System.out.print("Das Produkt von 5 ist: " + product);

    }

}
