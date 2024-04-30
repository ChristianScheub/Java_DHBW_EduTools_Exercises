import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

public class Tests {
  @Test
  public void testSolution() {
    Class<?> arrShift = null;
    try {
      arrShift = Class.forName("ArrayShifter");
    } catch (ClassNotFoundException e) {
      Assert.fail("Klasse wurde umbenannt/gelöscht");
      return;
    }
    Constructor<?> constructor = null;
    try {
      constructor = arrShift.getConstructor();
    } catch (NoSuchMethodException e) {
      Assert.fail("Klasse weist strukturelle Fehler auf");
      return;
    }
    Method generateArray = null;
    try {
      generateArray = arrShift.getDeclaredMethod("generateRandomArray", int.class, int.class, int.class);
    } catch (NoSuchMethodException e) {
      Assert.fail("Methode generate Array nicht Implementiert");
      return;
    }
    Object o = null;
    try {
      o = constructor.newInstance();
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
      Assert.fail("Klasse hat einen strukturellen Fehler oder konnte nicht erfolgreich ausführen");
      e.getCause().printStackTrace();
    }
    try {
      int[] result = (int[]) generateArray.invoke(o,2,1,2);
      Assert.assertEquals(2,result.length);
      List<int[]> testArrs = new ArrayList<>();
      testArrs.add(new int[]{1,1});
      testArrs.add(new int[]{1,2});
      testArrs.add(new int[]{2,1});
      testArrs.add(new int[]{2,2});
      boolean found = false;
      for (int[] x:testArrs) {
        if(Arrays.equals(x,result)){
          found = true;
        }
      }
      if(!found){

      }
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}