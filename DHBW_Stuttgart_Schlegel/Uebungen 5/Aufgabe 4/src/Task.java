public class Task {
    public static int quersummeIterativ(int zahl) {
        int ergebnis = 0;
        while (zahl != 0)
        {
            ergebnis = ergebnis + zahl % 10;
            zahl /= 10;
        }
        return ergebnis;
    }

    public static int quersummeRekursiv(int zahl) {
        int ergebnis = 0;
        if( zahl != 0 )
        {
            ergebnis = quersummeRekursiv( zahl / 10 ) + (zahl % 10);
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.print("Zahl (>=0): ");
        int eingabe = new java.util.Scanner(System.in).nextInt();
        System.out.println("Iterativ: "+quersummeIterativ(eingabe));
        System.out.println("Rekursiv: "+quersummeRekursiv(eingabe));

    }


}