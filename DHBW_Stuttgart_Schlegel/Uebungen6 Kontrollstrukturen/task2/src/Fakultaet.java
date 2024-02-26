public class Fakultaet
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner( System.in );
        System.out.print( "Bitte geben Sie ein Zahl >= 0 ein: " );
        long n = scan.nextLong();

        if( n < 0 )
        {
            System.out.println("Eingabe '" + n + "' ist < 0.");
        }
        else
        {
            long fak = 0L;
            for (long i = 0; i <= n; i++)
            {
                if( i == 0 )
                {
                    fak = 1;
                }
                else
                {
                    fak = fak * i;
                }
            }

            System.out.println("Das Ergebniss lautet "+n+"!="+fak );
        }
    }
}
