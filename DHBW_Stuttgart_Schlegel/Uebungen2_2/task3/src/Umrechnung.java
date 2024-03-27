import java.util.Scanner;

public class Umrechnung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Eingabe Grad Celsius: ");
        float celsius = scan.nextFloat();

        float fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " °C entsprechen " + fahrenheit + " °F");
    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9) / 5 + 32;
    }
}