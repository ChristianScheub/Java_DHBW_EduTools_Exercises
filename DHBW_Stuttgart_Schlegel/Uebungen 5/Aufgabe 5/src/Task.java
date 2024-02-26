public class Task {
    public static boolean testRekursiv(int teiler, int zahl) {

        if (zahl % teiler == 0)
        {
            return false;
        }
        else if (teiler > zahl / teiler)
        {
            return true;
        }
        else
        {
            return testRekursiv(teiler + 2, zahl);
        }
    }

    public static boolean testIterativ(int zahl) {
        // 0 und 1 sind per Definition keine Primzahl
        if (zahl <= 1) return false;

        // 2 und 3 sind per Definition Primzahlen
        if (zahl <= 3) return true;

        // gerade Zahlen, die grösser als 2 sind, sind keine Primzahlen
        if ((zahl % 2) == 0) return false;

        // Teste alle ungeraden Teiler, zwischen 3 und zahl (zahl ausgenommen)
        for (int teiler = 3; teiler < zahl; teiler += 2)
        {
            if ((zahl % teiler) == 0) return false;
            if (teiler > zahl / teiler) return true;
        }

        return true;
    }


    public static void main(String[] args)
    {
        System.out.print("Zahl >3: ");
        int eingabe = new java.util.Scanner(System.in).nextInt();

        // Rekursives prüfen der Eingabe
        if ((eingabe % 2 != 0) && testRekursiv(3, eingabe)) {
            System.out.println(eingabe + " ist Primzahl");
        }
        else {
            System.out.println(eingabe + " ist keine Primzahl");
        }

        // Iteratives prüfen der Eingabe
        if (testIterativ(eingabe)) {
            System.out.println(eingabe + " ist Primzahl");
        }
        else {
            System.out.println(eingabe + " ist keine Primzahl");
        }

    }
}
