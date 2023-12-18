import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {


  @Test
  public void testFirstComparator() {
      Person[] person = new Person[6];

      person[0] = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
      person[1] = new Person("Schmitz", "Jupp", 50996, "Domgasse", 4711);
      person[2] = new Person("Moser", "Franz", 80336, "Viktualienmarkt", 99);
      person[3] = new Person("Pfeffersack", "Olaf", 22587, "Wasebergstrasse", 42);
      person[4] = new Person("Schmitz", "Jupp", 50765, "Kalifengasse", 19);
      person[5] = new Person("Moser", "Anton", 80336, "Viktualienmarkt", 99);


      Person p1 = new Person();
      p1.sortByName(person);

      Person[] personSort = new Person[6];
      personSort[0] = new Person("Moser", "Anton", 80336, "Viktualienmarkt", 99);
      personSort[1] = new Person("Moser", "Franz", 80336, "Viktualienmarkt", 99);
      personSort[2] = new Person("Pfeffersack", "Olaf", 22587, "Wasebergstrasse", 42);
      personSort[3] = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
      personSort[4] = new Person("Schmitz", "Jupp", 50765, "Kalifengasse", 19);
      personSort[5] = new Person("Schmitz", "Jupp", 50996, "Domgasse", 4711);



      Assert.assertTrue(personSort[0].toString().equals(person[0].toString()));
      Assert.assertTrue(personSort[1].toString().equals(person[1].toString()));
      Assert.assertTrue(personSort[2].toString().equals(person[2].toString()));
      Assert.assertTrue(personSort[3].toString().equals(person[3].toString()));
      Assert.assertTrue(personSort[4].toString().equals(person[4].toString()));
      Assert.assertTrue(personSort[5].toString().equals(person[5].toString()));

  }

  @Test
  public void testSecComparator() {
      Person[] person = new Person[6];

      person[0] = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
      person[1] = new Person("Schmitz", "Jupp", 50996, "Domgasse", 4711);
      person[2] = new Person("Moser", "Franz", 80336, "Viktualienmarkt", 99);
      person[3] = new Person("Pfeffersack", "Olaf", 22587, "Wasebergstrasse", 42);
      person[4] = new Person("Schmitz", "Jupp", 50765, "Kalifengasse", 19);
      person[5] = new Person("Moser", "Anton", 80336, "Viktualienmarkt", 99);


      Person p2 = new Person();
      p2.sortByPLZ(person);

      Person[] personSort = new Person[6];
      personSort[0] = new Person("Pfeffersack", "Olaf", 22587, "Wasebergstrasse", 42);
      personSort[1] = new Person("Schmitz", "Jupp", 50765, "Kalifengasse", 19);
      personSort[2] = new Person("Schmitz", "Jupp", 50996, "Domgasse", 4711);
      personSort[3] = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
      personSort[4] = new Person("Moser", "Anton", 80336, "Viktualienmarkt", 99);
      personSort[5] = new Person("Moser", "Franz", 80336, "Viktualienmarkt", 99);


      Assert.assertTrue(personSort[0].toString().equals(person[0].toString()));
      Assert.assertTrue(personSort[1].toString().equals(person[1].toString()));
      Assert.assertTrue(personSort[2].toString().equals(person[2].toString()));
      Assert.assertTrue(personSort[3].toString().equals(person[3].toString()));
      Assert.assertTrue(personSort[4].toString().equals(person[4].toString()));
      Assert.assertTrue(personSort[5].toString().equals(person[5].toString()));

  }
}