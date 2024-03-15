import java.util.Scanner;
public class Umrechnung
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner( System.in );

        System.out.print("Eingabe Grad Celsius: ");
        float celsius = scan.nextFloat();

        float fahrenheit = (celsius * 9) / 5 + 32;

        System.out.println( celsius + " °C entsprechen " + fahrenheit + " °F");
    }
}
