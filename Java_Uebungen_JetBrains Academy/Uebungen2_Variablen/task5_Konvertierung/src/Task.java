public class Task {
    public static double convertIntToDouble(int number) {
        // TODO: Konvertieren Sie den int-Wert zu double und geben Sie das Ergebnis zurück.

        return 0.0;
    }

    public static int convertDoubleToInt(double number) {
        // TODO: Konvertieren Sie den double-Wert zu int und geben Sie das Ergebnis zurück.

        return 0;
    }


    public static void main(String[] args) {

        int i = 5;
        double convertedI = convertIntToDouble(i);


        System.out.println("Neuer Datentyp vom int-Wert 5 ist: " + ((Object) convertedI).getClass().getSimpleName());


        double n = 3.0;
        int convertedN = convertDoubleToInt(n);

        System.out.println("Neuer Datentyp vom double-Wert 3.0 ist: " + ((Object) convertedN).getClass().getSimpleName());


    }
}