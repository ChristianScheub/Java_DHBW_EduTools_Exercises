import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tests {
    @Test
    public void testBank() {
        Bank bank = new Bank();
        Method addAccount;
        try {
            addAccount = bank.getClass().getDeclaredMethod("addAccount", String.class, Kontotyp.class);
            addAccount.invoke(bank, "Steffen", Kontotyp.Girokonto);
            addAccount.invoke(bank, "Peter", Kontotyp.Sparkonto);
            Method getKonten = bank.getClass().getDeclaredMethod("getKonten");
            List<Konto> kontoList = (List<Konto>) getKonten.invoke(bank);
            String Inhaber = (String) kontoList.get(0).getClass().getSuperclass().getDeclaredField("Inhaber").get(kontoList.get(0));
            Assert.assertSame("Steffen", Inhaber);
            Inhaber = String.valueOf(kontoList.get(1).getClass().getSuperclass().getDeclaredField("Inhaber").get(kontoList.get(1)));
            Assert.assertSame("Peter", Inhaber);
            Method alleKonten = bank.getClass().getDeclaredMethod("alleKontos");
            Pattern p = Pattern.compile("GiroKonto.+SparKonto.+");
            String konten = (String) alleKonten.invoke(bank);
            Matcher m = p.matcher(konten);
            Assert.assertTrue(m.find());
        } catch (NoSuchMethodException e) {
            Assert.fail("addAccount nicht richtig Implementiert");
        } catch (IllegalAccessException | InvocationTargetException e) {
            Assert.fail("Fehler beim Aufruf der addAccount Methode");
        } catch (NoSuchFieldException e) {
            Assert.fail("Datenfeld Inhaber fehlt");
        }
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue("Die Vererbung ist falsch",SparKonto.class.getSuperclass()==Konto.class);
        Assert.assertTrue(GiroKonto.class.getSuperclass()==Konto.class);
    }
    @Test
    public void testEinAusZahlung(){
        Method method;
        try {
            method = SparKonto.class.getDeclaredMethod("einAusZahlung", double.class);
            SparKonto k = new SparKonto("test", (Integer) new Bank().getClass().getDeclaredMethod("genAccNr").invoke(new Bank()),13);
            method.invoke(k,-20);
            Assert.assertEquals("Ein/Auszahlung funktioniert nicht richtig",0.0, k.getClass().getSuperclass().getDeclaredField("kontostand").get(k)); //Alles tiptop
        } catch (NoSuchMethodException e) {
            Assert.fail("Es wurden nicht alle Methoden implementiert. Siehe Aufgabenstellung");
        } catch (InvocationTargetException | IllegalAccessException e) {
            Assert.fail("Unerwarteter Fehler aufgetreten bitte Programmcode nochmal überprüfen");
        } catch (NoSuchFieldException e) {
            Assert.fail("Nicht alle Datenfelder deklariert");
        }
    }
    @Test
    public void testAbrechnung(){
        try {
            Method method = GiroKonto.class.getDeclaredMethod("monatsAbrechnung");
            GiroKonto k = new GiroKonto("test", (Integer) new Bank().getClass().getDeclaredMethod("genAccNr").invoke(new Bank()),12,50);
            k.getClass().getSuperclass().getDeclaredMethod("einAusZahlung", double.class).invoke(k,2000.0);
            method.invoke(k);
            Assert.assertEquals(1950.0, (Double) k.getClass().getSuperclass().getDeclaredField("kontostand").get(k), 0.0);
        } catch (InvocationTargetException | IllegalAccessException e) {
            Assert.fail("Unerwarteter Fehler aufgetreten bitte Programmcode nochmal überprüfen");
        } catch (NoSuchMethodException e) {
            Assert.fail("Es wurden nicht alle Methoden implementiert. Siehe Aufgabenstellung");
        } catch (NoSuchFieldException e) {
            Assert.fail("Nicht alle Datenfelder deklariert");
        }
    }
}