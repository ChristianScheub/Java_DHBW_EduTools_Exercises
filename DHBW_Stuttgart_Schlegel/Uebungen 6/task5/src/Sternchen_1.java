public class Sternchen_1
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
            for (int i = 0; i < input; i++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.println("Zahl ist nicht positiv!");
        }
    }
}

