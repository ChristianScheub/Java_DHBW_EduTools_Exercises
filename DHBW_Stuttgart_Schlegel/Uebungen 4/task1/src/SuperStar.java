import java.util.Scanner;

public class SuperStar {

    public static int anzahlAnrufe(int p_Kandidat) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Anzahl Anrufe für Kandidat " + p_Kandidat + ": ");
            int l_Anrufe = scan.nextInt();

            if (l_Anrufe >= 0) {
                return l_Anrufe;
            }
        }
    }

    public static void printStars(int[] p_KandidatenAnrufe) {
        long l_AnrufeGesamt = 0L;

        //Berechne Summe aller Anrufe
        for (int i = 0; i < p_KandidatenAnrufe.length; i++) {
            l_AnrufeGesamt += p_KandidatenAnrufe[i];
        }

        //Zeichne Sterne
        for (int i = 0; i < p_KandidatenAnrufe.length; i++) {
            double l_AnrufeProzentual = 100d * p_KandidatenAnrufe[i] / l_AnrufeGesamt;

            for (int l_Stern = 0; l_Stern < l_AnrufeProzentual; l_Stern++) {
                System.out.print("*");
            }

            System.out.println(" " + p_KandidatenAnrufe[i] + "(" + l_AnrufeProzentual + "%)");
        }
    }

    public static void main(String[] args) {
        int l_Kandidaten = (int) (Math.random() * 10) + 1;
        System.out.println(l_Kandidaten + " Kandidaten sind noch dabei.");

        int[] l_KandidatenAnrufe = new int[l_Kandidaten];
        for (int i = 0; i < l_Kandidaten; i++) {
            l_KandidatenAnrufe[i] = anzahlAnrufe(i + 1);
        }

        printStars(l_KandidatenAnrufe);
    }
}
