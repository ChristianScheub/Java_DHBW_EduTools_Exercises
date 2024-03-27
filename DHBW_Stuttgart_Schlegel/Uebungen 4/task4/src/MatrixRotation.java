public class MatrixRotation
{

    static void printMatrix(int[][] p_Matrix)
    {
        for (int i = 0; i < p_Matrix.length; i++)
        {
            for (int j = 0; j < p_Matrix[i].length; j++)
            {
                System.out.print(" " + p_Matrix[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] readMatrix()
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("NxN Matrix mit n=");
        int l_Dim = scan.nextInt();
        int[][] l_Matrix = new int[l_Dim][l_Dim];

        for (int i = 0; i < l_Dim; i++)
        {
            System.out.println("Zeile " + (i + 1));
            for (int j = 0; j < l_Dim; j++)
            {
                System.out.print("   Spalte " + (j + 1) + ": ");
                l_Matrix[i][j] = scan.nextInt();
            }
        }

        return l_Matrix;
    }

    static int[][] rotateMatrix(int[][] p_Matrix)
    {
        int l_Dim = p_Matrix.length;
        int[][] l_Matrix = new int[l_Dim][l_Dim];

        for (int i = 0; i < l_Dim; i++)
        {
            for (int j = 0; j < l_Dim; j++)
            {
                l_Matrix[j][l_Dim - i - 1] = p_Matrix[i][j];
            }
        }
        return l_Matrix;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int[][] l_Matrix = readMatrix();

        System.out.println("\n\noriginale Matrix:");
        printMatrix(l_Matrix);

        System.out.println("\nrotierte Matrix:");

        l_Matrix = rotateMatrix(l_Matrix);
        printMatrix(l_Matrix);
    }
}
