public class Sternchen_2
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        // Eingabeaufforderung
        System.out.print("Geben Sie eine positive Zahl ein: ");

        // Lese Zahl ein
        int input = scan.nextInt();

        if (input >= 0)
        {
            int i = 0;
            while( i< input )
            {
                System.out.print( "*" );
                i++;
            }
        }
        else
        {
            System.out.println("Zahl ist nicht positiv!");
        }
    }
}
