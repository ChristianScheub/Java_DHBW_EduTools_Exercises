public class Histogramm
{
    static void printHistogramm(int[] p_Array)
    {
        //suche maximum im Feld
        int l_Max = 0;
        for (int j : p_Array) {
            if (j > l_Max) {
                l_Max = j;
            }
        }

        //Sterne Zeichnen
        for( int row=l_Max; row>0; row--)
        {
            for (int j : p_Array) {
                if (j >= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[] l_TestArray = {3, 1, 2, 2, 4, 1, 0, 3, 4};

        printHistogramm( l_TestArray );

    }
}
