public class Task {

    static void scanInput( java.util.Scanner scan ) {
        String l_Next = scan.next();

        if( l_Next.equals( "#" ) ) {
            //Rekurion wird abgebrochen.
            return;
        }
        else {
            scanInput(scan);
        }

        System.out.print( l_Next );
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.print( "Eingabe: " );
        java.util.Scanner scan = new java.util.Scanner(System.in );

        scanInput( scan );

    }
}
