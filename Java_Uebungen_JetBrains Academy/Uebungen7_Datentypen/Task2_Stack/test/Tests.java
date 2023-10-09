import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testEmptyStack() {
    Stack<Integer> stack = new Stack<>();
    Assert.assertTrue(stack.empty());
  }

  @Test
  public void testPushAndPop() {
    Stack<String> stack = new Stack<>();
    stack.push("Item 1");
    Assert.assertFalse(stack.empty());
    Assert.assertEquals("Item 1", stack.pop());
    Assert.assertTrue(stack.empty());
  }

  @Test
  public void testPeek() {
    Stack<Double> stack = new Stack<>();
    stack.push(1.14);
    stack.push(2.14);
    stack.push(3.14);
    Assert.assertEquals(3.14, stack.peek(), 0.001);
    Assert.assertFalse(stack.empty());
  }

  @Test(expected = Exception.class)
  public void testPopFromEmptyStack() {
    Stack<Character> stack = new Stack<>();
    stack.pop();
  }

  @Test(expected = Exception.class)
  public void testPeekFromEmptyStack() {
    Stack<Boolean> stack = new Stack<>();
    stack.peek();
  }
}