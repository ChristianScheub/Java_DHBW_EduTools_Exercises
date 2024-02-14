import java.util.Scanner;

public class Windchill {

    public static double calcWindchill(double t, double v){

        double windchill = 0;

        windchill = 13.12 + 0.6215*t - 11.37*Math.pow(v,0.16) + 0.3965*t*Math.pow(v,0.16);
        windchill = Math.round(windchill * 100.0) / 100.0;


        return windchill;
    }

    public static void main(String[] args) {

        // TODO: Führen Sie die main Methode aus, um ihre Methode zu testen

        double windchill = calcWindchill(8,20);

        System.out.print("Der Windchill von t=8 und v=20 ist: " + windchill);

    }

}
