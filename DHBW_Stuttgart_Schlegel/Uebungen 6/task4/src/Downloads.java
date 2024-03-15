public class Downloads
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        // Eingabeaufforderung
        System.out.print("Geben Sie die Anzahl der Downloads an: ");

        // Lese Anzahl ein
        int downloads = scan.nextInt();

        if( downloads <= 5 )
        {
            System.out.println("Die ersten 5 Downloads sind kostenlos.");
        }
        else
        {
            // 5 kostenlose downloads abziehen
            downloads = downloads - 5;

            int kosten = 0;
            if( downloads <= 30 )
            {
                // berechnen der Downloads fuer 20 Cent
                kosten = downloads * 20;
            }
            else
            {
                downloads = downloads - 30;
                // berechnen der Downloads fuer 20 Cent
                kosten = (30 * 20);

                // berechnen der Downloads fuer 15 Cent und addieren zu Gesamtkosten
                kosten = kosten + ( downloads * 15 );
            }

            // Ausgabe der Gesamtkosten
            System.out.println("Sie müssen " + (kosten / 100d) + " Euro bezahlen." );
        }
    }
}
