import de.hans.wif.lectures.test.utils.AbstractBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DummyTests extends AbstractBaseTest {

    @Test
    public void test() {
        Dummy.main(new String[]{});
    }

}