
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.opentest4j.AssertionFailedError;

import testing.UniGraderTestResultExtension;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(UniGraderTestResultExtension.class)
class ExamUnitTest
{
	private static final int DEFAULT_TIMEOUT = 30;

	//private static final String CLASS_TEMPLATE ="de.dhbw.assignments.exam.impl.%s";
	//private static final String CLASS_TEMPLATE = "de.dhbw.assignments.exam.solution.%s";
	private static final String CLASS_TEMPLATE ="%s";

	@Test
    @DisplayName("Task1.Add")
    @Order(101)
    void testTask1_Add() {
        assertEquals(3,invoke_ExamTask1(1,2));
        assertEquals(-1,invoke_ExamTask1(4,-5));
        assertEquals(0,invoke_ExamTask1(0,0));
        assertEquals(-3,invoke_ExamTask1(-1,-2));
        assertEquals(1000000,invoke_ExamTask1(999999,1));
    }

    @Test
    @DisplayName("Task2.DestroyAliens")
    @Order(201)
    void testTask2_DestroyAliens() {
        assertEquals("",invoke_ExamTask2_DestroyAliens(""));
        assertEquals("",invoke_ExamTask2_DestroyAliens(null));
        assertEquals("Apfel",invoke_ExamTask2_DestroyAliens("Apfel"));
        assertEquals("",invoke_ExamTask2_DestroyAliens("Alien"));
        assertEquals("Da ist ein !",invoke_ExamTask2_DestroyAliens("Da ist ein Alien!"));
        assertEquals("",invoke_ExamTask2_DestroyAliens("AlIeN"));
        assertEquals("Autobahn",invoke_ExamTask2_DestroyAliens("Autobahn"));
        assertEquals("Autobahn",invoke_ExamTask2_DestroyAliens("AlienAutobahn"));
    }

    @Test
    @DisplayName("Task3.GetSmallestDivisor")
    @Order(301)
    void testTask3_GetSmallestDivisor() {
        assertEquals(5,invoke_ExamTask3_GetSmallestDivisor(25));
        assertEquals(1,invoke_ExamTask3_GetSmallestDivisor(7));
        assertEquals(0,invoke_ExamTask3_GetSmallestDivisor(-17));
        assertEquals(2,invoke_ExamTask3_GetSmallestDivisor(100));
        assertEquals(3,invoke_ExamTask3_GetSmallestDivisor(9));
        assertEquals(1,invoke_ExamTask3_GetSmallestDivisor(1));
        assertEquals(1,invoke_ExamTask3_GetSmallestDivisor(2));
        assertEquals(1,invoke_ExamTask3_GetSmallestDivisor(3));
        assertEquals(29,invoke_ExamTask3_GetSmallestDivisor(841));
        assertEquals(0,invoke_ExamTask3_GetSmallestDivisor(0));
    }

    @Test
    @DisplayName("Task4.PostponeMeeting")
    @Order(401)
    void testTask4_PostponeMeeting() {
        assertEquals(931,invoke_ExamTask4_PostponeMeetin(930,60));
        assertEquals(1034,invoke_ExamTask4_PostponeMeetin(1030,240));
        assertEquals(4,invoke_ExamTask4_PostponeMeetin(0,240));
        assertEquals(-1,invoke_ExamTask4_PostponeMeetin(-15,32397));
        assertEquals(1234,invoke_ExamTask4_PostponeMeetin(1234,0));
        assertEquals(100,invoke_ExamTask4_PostponeMeetin(0,3600));
        assertEquals(101,invoke_ExamTask4_PostponeMeetin(0,3660));
        assertEquals(0,invoke_ExamTask4_PostponeMeetin(2359,60));
        assertEquals(0,invoke_ExamTask4_PostponeMeetin(0,0));
        assertEquals(-1,invoke_ExamTask4_PostponeMeetin(1200,-60));
    }

    @Test
    @DisplayName("Task5.isGatekeeper")
    @Order(501)
    void testTask5_isGatekeeper() {
        assertFalse(invoke_ExamTask5_isGatekeeper(1));
        assertFalse(invoke_ExamTask5_isGatekeeper(-192));
        assertFalse(invoke_ExamTask5_isGatekeeper(36));
        assertFalse(invoke_ExamTask5_isGatekeeper(100));
        assertTrue(invoke_ExamTask5_isGatekeeper(192));
        assertTrue(invoke_ExamTask5_isGatekeeper(123456789));
        assertFalse(invoke_ExamTask5_isGatekeeper(120));
        assertFalse(invoke_ExamTask5_isGatekeeper(0));
        assertFalse(invoke_ExamTask5_isGatekeeper(Integer.MAX_VALUE));
        assertTrue(invoke_ExamTask5_isGatekeeper(111));
        assertTrue(invoke_ExamTask5_isGatekeeper(252));
        assertTrue(invoke_ExamTask5_isGatekeeper(484));
    }

/*
	@Test
	@DisplayName("Task6.getCity: Angenommen die Methode wird mit einen beliebigen Buchstaben, außer a, b, c oder d, aufgerufen. (Das erwartete Ergebnis ist: null)")
	@Order(605)
	@Timeout(value = DEFAULT_TIMEOUT, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
	void testTask6_getCity_randomAll()
	{
		for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++)
		{
			if (c != 'a' && c != 'b' && c != 'c' && c != 'd')
			{
				assertEquals(null, invoke_ExamTask6_getCity(c));
				Thread.yield();
			}
		}
	}*/

	private static int invoke_ExamTask1(final int number, final int number2)
	{
		Class<?> l_examClass = findClass(String.format(CLASS_TEMPLATE, "ExamTask1"));
		Method l_method = findMethod(l_examClass, true, "Add", int.class,int.class);
		return invokeStaticMethod(l_method, int.class, number, number2);
	}

	private static String invoke_ExamTask2_DestroyAliens(final String str)
	{
		Class<?> l_examClass = findClass(String.format(CLASS_TEMPLATE, "ExamTask2"));
		Method l_method = findMethod(l_examClass, true, "DestroyAliens", String.class);
		return invokeStaticMethod(l_method, String.class, str);
	}

	private static int invoke_ExamTask3_GetSmallestDivisor(final int p_number)
	{
		Class<?> l_examClass = findClass(String.format(CLASS_TEMPLATE, "ExamTask3"));
		Method l_method = findMethod(l_examClass, true, "GetSmallestDivisor", int.class);
		return invokeStaticMethod(l_method, int.class, p_number);
	}

	private static int invoke_ExamTask4_PostponeMeetin(final int time, int difference)
	{
		Class<?> l_examClass = findClass(String.format(CLASS_TEMPLATE, "ExamTask4"));
		Method l_method = findMethod(l_examClass, true, "PostponeMeeting", int.class, int.class);
		return invokeStaticMethod(l_method, int.class, time, difference);
	}

	private static boolean invoke_ExamTask5_isGatekeeper(final int p_number)
	{
		Class<?> l_examClass = findClass(String.format(CLASS_TEMPLATE, "ExamTask5"));
		Method l_method = findMethod(l_examClass, true, "isGatekeeper", int.class);
		return invokeStaticMethod(l_method, boolean.class, p_number);
	}

	private static void handleThrowable(final Throwable p_th)
	{
		Throwable th = p_th;

		if (th instanceof Error)
		{
			throw (Error) th;
		}

		while (th.getCause() != null)
		{
			th = th.getCause();
		}

		if (th instanceof Error)
		{
			throw (Error) th;
		}

		fail(p_th.getMessage(), p_th);
	}

	private static final Class<?> findClass(final String p_className)
	{
		try
		{
			return Class.forName(p_className);
		}
		catch (ClassNotFoundException ex)
		{
			// handleThrowable( ex );
			throw new Error(ex);
		}
		catch (Throwable th)
		{
			handleThrowable(th);
		}

		return null;
	}

	private static final <T> Method findMethod(final Class<T> p_class, final boolean p_isStatic,
	        final String p_methodeName, final Class<?>... p_parameterList)
	{
		try
		{
			Method l_method = p_class.getMethod(p_methodeName, p_parameterList);

			if (p_isStatic && !Modifier.isStatic(l_method.getModifiers()))
			{
				throw new NoSuchMethodException(l_method + " should be static!");
			}

			return l_method;
		}
		catch (NoSuchMethodException ex)
		{
			throw new Error(ex);
		}
		catch (Throwable th)
		{
			handleThrowable(th);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private static <T> T invokeStaticMethod(final Method p_method, final Class<T> p_returnType, final Object... args)
	{
		try
		{
			return (T) p_method.invoke(null, args);
		}
		catch (ClassCastException ex)
		{
			throw new Error(ex);
		}
		catch (Throwable th)
		{
			th.printStackTrace();
			handleThrowable(th);

		}

		return null;
	}

	@SuppressWarnings("unchecked")
	private static <T> T invokeNonStaticMethod(final Object p_instance, final Method p_method,
	        final Class<T> p_returnType, final Object... args)
	{
		try
		{
			return (T) p_method.invoke(p_instance, args);
		}
		catch (ClassCastException ex)
		{
			throw new Error(ex);
		}
		catch (Throwable th)
		{
			th.printStackTrace();
			handleThrowable(th);
		}

		return null;
	}

}
