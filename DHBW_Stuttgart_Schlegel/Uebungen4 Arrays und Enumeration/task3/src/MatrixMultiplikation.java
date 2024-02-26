public class MatrixMultiplikation
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

    static int[][] multiply(int[][] p_MatrixA, int[][] p_MatrixB)
    {
        int l_ColDimA = p_MatrixA.length;
        int l_RowDimA = p_MatrixA[0].length;
        int l_RowDimB = p_MatrixB[0].length;

        int[][] l_Result = new int[l_ColDimA][l_RowDimB];

        for (int i = 0; i < l_ColDimA; i++)
        {
            for (int j = 0; j < l_RowDimB; j++)
            {
                for (int k = 0; k < l_RowDimA; k++)
                {

                    l_Result[i][j] += p_MatrixA[i][k] * p_MatrixB[k][j];
                }
            }
        }

        return l_Result;
    }

    public static void main(String[] args)
    {
        int l_MatrixA[][] = { { 1,2,3 }, { 4, 5, 6 } };
        int l_MatrixB[][] = { { 6, -1 }, { 3, 2 }, { 0, -3 } };

        System.out.println("Matrix 1 : ");
        printMatrix( l_MatrixA );

        System.out.println("Matrix 2 : ");
        printMatrix( l_MatrixB );

        int[][] l_ResultMatrix= multiply( l_MatrixA, l_MatrixB);

        System.out.println("Multiply of both matrix : ");
        printMatrix( l_ResultMatrix );
    }
}
