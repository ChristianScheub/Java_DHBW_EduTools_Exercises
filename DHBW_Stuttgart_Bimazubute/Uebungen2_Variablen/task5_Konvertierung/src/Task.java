public class Task {
    public static double convertIntToDouble(int intNumber) {

        double doubleNumber;

        doubleNumber = intNumber;

        return doubleNumber;
    }

    public static int convertDoubleToInt(double doubleNumber) {

        int intNumber;

        intNumber = (int) doubleNumber;

        return intNumber;
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