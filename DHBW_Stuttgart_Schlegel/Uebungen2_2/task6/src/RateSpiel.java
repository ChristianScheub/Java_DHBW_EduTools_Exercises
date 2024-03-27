import java.util.Scanner;

public class RateSpiel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        spielen(scan);
    }

    public static void spielen(Scanner scan) {
        int zufallszahl = (int)(Math.random() * 100);

        int tip;
        int tipCounter = 0;

        System.out.print("Ihr Tipp: ");
        tip = scan.nextInt();
        tipCounter++;

        while( tip != zufallszahl )
        {
            if( tip < zufallszahl ) {
                System.out.println("Ihr Tipp war zu niedrig!");
            }
            if( tip > zufallszahl ) {
                System.out.println("Ihr Tipp war zu hoch!");
            }
            System.out.print("Ihr nächster Tipp: ");
            tip = scan.nextInt();
            tipCounter++;
        }

        System.out.print("Nach " + tipCounter + " Tipp(s) haben Sie einen Treffer gelandet!");
    }
}