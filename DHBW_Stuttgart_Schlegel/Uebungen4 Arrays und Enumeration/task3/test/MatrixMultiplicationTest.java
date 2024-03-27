import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MatrixMultiplicationTest {

  @Test
  public void testPrintMatrix() {
    // Set up output stream redirection
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Define test matrix
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
    String expectedOutput = " 1 2 3\n 4 5 6\n";

    // Call method to be tested
    MatrixMultiplikation.printMatrix(matrix);

    // Reset standard output
    System.setOut(System.out);

    // Check if printed matrix matches expected output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  public void testMultiply() {
    // Define test matrices
    int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] matrixB = { { 6, -1 }, { 3, 2 }, { 0, -3 } };
    int[][] expected = { { 12, -6 }, { 39, -9 } };

    // Call method to be tested
    int[][] result = MatrixMultiplikation.multiply(matrixA, matrixB);

    // Check if result matches expected output
    assertArrayEquals(expected, result);
  }
}