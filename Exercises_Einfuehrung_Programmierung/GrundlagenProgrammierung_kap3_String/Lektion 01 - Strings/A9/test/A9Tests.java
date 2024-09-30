import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A9Tests {
  @Test
  public void testToString() {
    Person person = new Person("Alice", 30);
    assertEquals("Name: Alice, Age: 30", person.toString());

    Person person2 = new Person("Bob", 25);
    assertEquals("Name: Bob, Age: 25", person2.toString());
  }
}