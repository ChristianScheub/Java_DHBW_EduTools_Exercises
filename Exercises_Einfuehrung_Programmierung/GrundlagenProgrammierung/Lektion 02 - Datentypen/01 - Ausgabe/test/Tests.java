import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends ConsoleIOBaseTest {

  @Test
  public void testSolution() {
    flush();
    FavoriteBook.main(new String[0]);
    final String output = getConsoleOutput(false);

    String expected =
    "Titel: Der Herr der Ringe\n"
    +"Autor: J.R.R. Tolkien\n"
    +"Kategorie: Fantasy\n"
    +"Preis: 19.99\n"
    +"Seitenzahl: 1178";
    Assert.assertEquals("Achten Sie auf den genauen Wortlaut der Ausgabe auf der Konsole. Ihre Ausgabe '" + output + "' stimmt nicht mit der in der Aufgabenstellung geforderten überein!",
            expected,
            output);




  }
}