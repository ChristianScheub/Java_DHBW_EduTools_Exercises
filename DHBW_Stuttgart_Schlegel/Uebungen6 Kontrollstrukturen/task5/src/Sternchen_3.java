public class Sternchen_3
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
            do
            {
                if (input > 0) System.out.print("*");
                i++;
            }
            while (i < input);
        }
        else
        {
            System.out.println("Zahl ist nicht positiv!");
        }
    }
}
