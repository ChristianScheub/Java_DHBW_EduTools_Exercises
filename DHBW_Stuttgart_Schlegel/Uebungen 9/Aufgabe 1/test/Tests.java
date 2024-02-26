import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testSolution() {
        // put your test here
        try {
            new InputFile("sdkjbhhff");
        } catch (ExceptionCaught e) {
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("exception wurde nicht gecatched");
        }
    }

    @Test
    public void testGetLineThrowsExceptionCaught() {
        try {
            InputFile inputFile = new InputFile("invalidFileName.txt");
            try {
                inputFile.getLine();
                Assert.fail("Expected ExceptionCaught to be thrown");
            } catch (ExceptionCaught exception) {
                Assert.assertNotNull(exception);
            }
        } catch (Exception e) {
            if(!(e instanceof ExceptionCaught)) {
                Assert.fail();
            }
        }
    }
}