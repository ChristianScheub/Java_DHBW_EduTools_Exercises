import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class Tests {
  Optional<Class<?>> penguin = Optional.empty();
  Optional<Class<?>>  lion = Optional.empty();
  Optional<Class<?>> feeder = Optional.empty();
  Optional<Class<?>> food = Optional.empty();
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayInputStream inContentYes = new ByteArrayInputStream("Y\nL\n".getBytes());
  private final ByteArrayInputStream inContentNo = new ByteArrayInputStream("N\n".getBytes());
  private final ByteArrayInputStream inContentInvalid = new ByteArrayInputStream("Invalid\nN\n".getBytes());


  @Before
  public void setUpStreams(){
    System.setOut(new PrintStream(outContent));
    System.setIn(inContentNo);
  }
  @After
  public void restoreStreams() {
    System.setOut(new PrintStream(outContent));

  }
  @Before
  public void setOptionals(){
    try {
      Class<?> pengu = Class.forName("Penguin");
      penguin = Optional.of(pengu);
    } catch (ClassNotFoundException e) {
      penguin = Optional.empty();
    }
    try {
      Class<?> bigCat = Class.forName("Lion");
      lion = Optional.of(bigCat);
    }catch (ClassNotFoundException e){
      lion = Optional.empty();
    }
    try {
      Class<?> feederHandler = Class.forName("Feeder");
      feeder = Optional.of(feederHandler);
    }catch (ClassNotFoundException e){
      feeder = Optional.empty();
    }
    try {
      Class<?> petFood = Class.forName("Food");
      food = Optional.of(petFood);
    }catch (ClassNotFoundException e){
      food = Optional.empty();
    }
  }

  @Test
  public void testAllClassesPresent(){
    Assert.assertTrue("Penguin not found", penguin.isPresent());
    Assert.assertTrue("Lion not found", lion.isPresent());
    Assert.assertTrue("Feeder class not found", feeder.isPresent());
    Assert.assertTrue("Food class not found", food.isPresent());
  }
  @Test
  public void testFeedPenguin(){
    setOptionals();
    if(!penguin.isPresent()){
      Assert.fail("Penguin not present skipped Test 2");
      return;
    }
    if(!food.isPresent()){
      Assert.fail("Food not present skipped Test 2");
      return;
    }
    try {
      Object pengu = penguin.get().getDeclaredConstructor().newInstance();
      Method feed = penguin.get().getDeclaredMethod("feed",food.get());
      Constructor<?> foodConstructor = food.get().getDeclaredConstructor(String.class,double.class);
      Object food1 = foodConstructor.newInstance("magic Food",10);
      boolean returnVal = (boolean) feed.invoke(pengu,food1);
      Assert.assertTrue("Feeding the penguin with magic food failed",returnVal);
      food1 = foodConstructor.newInstance("penguin food",1);
      returnVal = (boolean) feed.invoke(pengu,food1);
      Assert.assertTrue("Feeding the penguin with penguin food failed",returnVal);
      Field quantity = food1.getClass().getDeclaredField("quantity");
      try {
        quantity.setAccessible(true);
        quantity.set(food1,0.0);
        returnVal = (boolean) feed.invoke(pengu,food1);
        Assert.assertFalse("feeding the penguin without food somehow still fed him.",returnVal);
      }catch (IllegalArgumentException | IllegalAccessException e){
        Assert.fail("didn't declare quantity in the correct way");
      }
      /*
       * You could theoretically make this test also work dynamically with integers and what not by testing the return type through instanceof
       * and thereby allowing different solutions of varying complexity to be tested.
       * Currently, this code assumes that a boolean will be returned.
       */
    } catch (NoSuchMethodException e) {
      Assert.fail("Couldnt find feed Method in Penguin");
    } catch (InvocationTargetException e) {
      Assert.fail("Constructor threw an Exception !!");
      e.printStackTrace();
    } catch (InstantiationException e) {
      Assert.fail("Food class cant be instantiated");
    } catch (IllegalAccessException e) {
      Assert.fail("Constructor Access Error please change visibility");
    } catch (NoSuchFieldException e) {
      Assert.fail("food does not have a 'quantity' property");
    }
  }
  @Test
  public void testSimulateDay_AllAnimalsDie() {
    try {
      Constructor<?> foodConstructor = food.get().getDeclaredConstructor(String.class,double.class);
      Object testFood = foodConstructor.newInstance("magic Food",10);
      Object testFoodLion = foodConstructor.newInstance("lion food",0);
      Object testFoodPenguin = foodConstructor.newInstance("penguin food", 5);
      Constructor<?>[] feederConstructor = feeder.get().getDeclaredConstructors();
      Object feeder1 = feederConstructor[0].newInstance(testFood,testFoodLion,testFoodPenguin);
      Method initAnimals = feeder1.getClass().getDeclaredMethod("initAnimals");
      initAnimals.invoke(feeder1);
      Method simulateDay = feeder1.getClass().getDeclaredMethod("simulateDay");
      int day = (int) simulateDay.invoke(feeder1);
      Assert.assertEquals(1, day);
      Assert.assertTrue(outContent.toString().contains("a Lion died"));
    } catch (NoSuchMethodException e) {
      Assert.fail("Failed to find required constructor");
    } catch (InstantiationException e) {
      Assert.fail("Failed to instantiate class");
    } catch (IllegalAccessException e) {
      Assert.fail("Illegal access to method or constructor");
    } catch (InvocationTargetException e) {
      Assert.fail("Failure when invoking method");
      e.printStackTrace();
    }
  }

}