public class HarmonicSeries {

    public static double calcHarmonicNum(int n){

        double harmonicNum = 0;

        for (int i = 1; i<= n ; i++){
            harmonicNum = harmonicNum + ((double) 1 /i);
        }

        return harmonicNum;
    }



    public static void main(String[] args) {

        // TODO: Führen Sie die main Methode aus, um ihre Methode zu testen

        double harmonicNum = calcHarmonicNum(5);

        System.out.print("Das harmonische Zahl von 5 ist: " + harmonicNum);

    }

}
