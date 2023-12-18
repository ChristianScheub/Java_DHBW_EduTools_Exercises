import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testPersonComparison() {
    Person person1 = new Person("Doe", "John", 12345, "Main St", 123);
    Person person2 = new Person("Smith", "Alice", 12345, "Main St", 124);
    Person person3 = new Person("Doe", "Jane", 12345, "Main St", 123);

    Assert.assertTrue(person1.compareTo(person2) < 0);
    Assert.assertEquals(0, person1.compareTo(person1));
    Assert.assertTrue(person2.compareTo(person3) > 0);
  }
}