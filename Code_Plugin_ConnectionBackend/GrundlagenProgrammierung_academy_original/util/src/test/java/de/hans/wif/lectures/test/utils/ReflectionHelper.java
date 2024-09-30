package de.hans.wif.lectures.test.utils;

//import org.junit.Assert;


import java.lang.reflect.*;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class ReflectionHelper {

    public static <T> Optional<Constructor<T>> getConstructor(Class<T> clazz, Class<?>[] parameterTypes, boolean fail) {
        Optional<Constructor<T>> constructor = Optional.empty();
        try {
            constructor = Optional.of(clazz.getDeclaredConstructor(parameterTypes));
        } catch (NoSuchMethodException e) {
            if (fail) {
                org.junit.jupiter.api.Assertions.fail("Konstruktor der Klasse " + clazz.getSimpleName() + " mit der Signatur " +
                        clazz.getSimpleName() + getParameterTypesString(parameterTypes) + " nicht gefunden!");
                //Assert.fail("Konstruktor der Klasse " + clazz.getSimpleName() + " mit der Signatur " +
                //        clazz.getSimpleName() + getParameterTypesString(parameterTypes) + " nicht gefunden!");
            }
        }

        return constructor;
    }

    public static <T> boolean hasConstructor(Class<T> clazz, Class<?>[] parameterTypes) {
        return getConstructor(clazz, parameterTypes, false).isPresent();
    }

    public static <T> boolean hasConstructor(Class<T> clazz) {
        return hasConstructor(clazz, new Class<?>[0]);
    }

    public static <T> Optional<T> newInstance(Class<T> clazz, Class<?>[] parameterTypes, Object[] parameterValues) {
        return newInstance(clazz, parameterTypes, parameterValues, true);
    }

    public static <T> Optional<T> newInstance(Class<T> clazz) {
        return newInstance(clazz, new Class<?>[0], new Object[0], true);
    }

    public static <T> Optional<T> newInstance(Class<T> clazz, Class<?>[] parameterTypes, Object[] parameterValues, boolean fail) {
        AtomicReference<Optional<T>> result = new AtomicReference<>(Optional.empty());

        getConstructor(clazz, parameterTypes, fail).ifPresent(
                c -> {
                    c.setAccessible(true);
                    try {
                        result.set(Optional.of(c.newInstance(parameterValues)));
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        if (fail) {
                            org.junit.jupiter.api.Assertions.fail("Unbekannter Fehler beim Erzeugen eines Objekts des Typs " +
                                    clazz.getSimpleName() + ", Konstruktor: " +
                                    clazz.getSimpleName() + getParameterTypesString(parameterTypes));
                            //Assert.fail("Unbekannter Fehler beim Erzeugen eines Objekts des Typs " +
                            //            clazz.getSimpleName() + ", Konstruktor: " +
                            //            clazz.getSimpleName() + getParameterTypesString(parameterTypes));
                        }
                    }
                }
        );

        return result.get();
    }

    public static <T> Optional<Method> getMethod(Class<T> clazz, String methodName) {
        return getMethod(clazz, methodName, true);
    }

    public static <T> Optional<Method> getMethod(Class<T> clazz, String methodName, boolean fail) {
        return getMethod(clazz, methodName, new Class<?>[0], fail);
    }

    public static <T> Optional<Method> getMethod(Class<T> clazz, String methodName, Class<?>[] parameterTypes) {
        return getMethod(clazz, methodName, parameterTypes, true);
    }

    public static <T> Optional<Method> getMethod(Class<T> clazz, String methodName, Class<?>[] parameterTypes, boolean fail) {
        Optional<Method> declaredMethod = Optional.empty();

        try {
            declaredMethod = Optional.of(clazz.getDeclaredMethod(methodName, parameterTypes));
        } catch (NoSuchMethodException e) {
            if (fail) {
                //Assert.fail("Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes) + " wurde nicht gefunden!");
                org.junit.jupiter.api.Assertions.fail("Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes) + " wurde nicht gefunden!");
            }
        }

        return declaredMethod;
    }

    public static <T> boolean hasMethod(Class<T> clazz, String methodName) {
        return getMethod(clazz, methodName, new Class<?>[0], false).isPresent();
    }

    public static <T> boolean hasMethod(Class<T> clazz, String methodName, Class<?>[] parameterTypes) {
        return getMethod(clazz, methodName, parameterTypes, false).isPresent();
    }

    public static <T, R> Optional<R> invokeMethod(Class<T> clazz, String methodName, Class<?>[] parameterTypes, T instance, Object[] parameterValues) {
        return invokeMethod(clazz, methodName, parameterTypes, instance, parameterValues, true);
    }

    public static <T, R> Optional<R> invokeMethod(Class<T> clazz, String methodName, T instance) {
        return invokeMethod(clazz, methodName, instance, true);
    }

    public static <T, R> Optional<R> invokeMethod(Class<T> clazz, String methodName, T instance, boolean fail) {
        return invokeMethod(clazz, methodName, new Class[0], instance, new Object[0], fail);
    }

    /**
     * Invokes a method and returns its value (if there is any).
     * @param clazz Type which defines the method to call
     * @param methodName Name of the method
     * @param parameterTypes Parameter types or an empty array, if the method has no parameters
     * @param instance Object on which the method will be invoked
     * @param parameterValues Array of {@code Object}s representing the parameter values
     * @param fail {@code boolean} value, indicating, if a test shoud be failed with an appropriate message (= true) or not
     * @return {@link Optional} holding a possible return value (will be empty, if the method declares {@code void} as return type
     */
    @SuppressWarnings("rawtypes")
    public static Optional invokeMethodRaw(Class<?> clazz, String methodName, Class<?>[] parameterTypes, Object instance, Object[] parameterValues, boolean fail) {
        AtomicReference<Optional<?>> result = new AtomicReference<>(Optional.empty());

        getMethod(clazz, methodName, parameterTypes, fail).ifPresent(
                m -> {
                    m.setAccessible(true);
                    try {
                        Object r = m.invoke(instance, parameterValues);
                        if (!m.getReturnType().equals(void.class)) {
                            result.set(Optional.of(r));
                        }
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        if (fail) {
                            //Assert.fail("Unbekannter Fehler beim Aufruf der Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes));


                            org.junit.jupiter.api.Assertions.fail("Unbekannter Fehler beim Aufruf der Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes));
                        }
                    }
                }
        );

        return result.get();
    }

    public static Optional invokeMethodRawEx(Class<?> clazz, String methodName, Class<?>[] parameterTypes, Object instance, Object[] parameterValues, boolean fail) throws Throwable {
        AtomicReference<Optional<?>> result = new AtomicReference<>(Optional.empty());
        AtomicReference<Throwable> exception = new AtomicReference<>(null);

        getMethod(clazz, methodName, parameterTypes, fail).ifPresent(
                m -> {
                    m.setAccessible(true);
                    try {
                        Object r = m.invoke(instance, parameterValues);
                        if (!m.getReturnType().equals(void.class)) {
                            result.set(Optional.of(r));
                        }
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        exception.set(e.getCause() != null ? e.getCause() : e);

                        if (fail) {
                            //Assert.fail("Unbekannter Fehler beim Aufruf der Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes));

                            org.junit.jupiter.api.Assertions.fail("Unbekannter Fehler beim Aufruf der Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes));

                        }
                    }
                }
        );

        if (exception.get() != null) {
            throw exception.get();
        }

        return result.get();
    }

    /**
     * Invokes a method and returns its value (if there is any).
     * @param clazz Type which defines the method to call
     * @param methodName Name of the method
     * @param parameterTypes Parameter types or an empty array, if the method has no parameters
     * @param instance Object on which the method will be invoked
     * @param parameterValues Array of {@code Object}s representing the parameter values
     * @param fail {@code boolean} value, indicating, if a test shoud be failed with an appropriate message (= true) or not
     * @param <T> class which defines the method
     * @param <R> type of the return value of the method
     * @return {@link Optional} holding a possible return value (will be empty, if the method declares {@code void} as return type
     */
    @SuppressWarnings("unchecked")
    public static <T,R> Optional<R> invokeMethod(Class<T> clazz, String methodName, Class<?>[] parameterTypes, T instance, Object[] parameterValues, boolean fail) {
        return (Optional<R>) (invokeMethodRaw(clazz, methodName, parameterTypes, instance, parameterValues, fail));
    }

    public static <T> Optional<Field> getFieldDeclaration(Class<T> clazz, String fieldName, boolean fail) {
        return getFieldDeclarationRaw(clazz, fieldName, fail);
    }

    @SuppressWarnings("rawtypes")
    public static Optional<Field> getFieldDeclarationRaw(Class clazz, String fieldName, boolean fail) {
        try {
            return Optional.of(clazz.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e) {
            if (fail) {
                //Assert.fail("Die Klasse " + clazz.getSimpleName() + " definiert kein Feld mit dem Namen '" + fieldName + "'");
                org.junit.jupiter.api.Assertions.fail("Die Klasse " + clazz.getSimpleName() + " definiert kein Feld mit dem Namen '" + fieldName + "'");

            }
        }

        return Optional.empty();
    }

    public static <T> Optional<Field> getFieldDeclaration(Class<T> clazz, String fieldName) {
        return getFieldDeclaration(clazz, fieldName, true);
    }

    @SuppressWarnings("unchecked")
    public static <T, R> Optional<R> getFieldValue(Class<T> clazz, String fieldName, T instance, boolean fail) {
        return (Optional<R>) getFieldValueRaw(clazz, fieldName, instance, fail);
    }

    @SuppressWarnings("rawtypes")
    public static Optional getFieldValueRaw(Class clazz, String fieldName, Object instance, boolean fail) {
        AtomicReference<Optional> result = new AtomicReference<>(Optional.empty());

        getFieldDeclarationRaw(clazz, fieldName, fail).ifPresent(
                f -> {
                    try {
                        f.setAccessible(true);
                        result.set(Optional.of(f.get(instance)));
                    } catch (IllegalAccessException e) {
                        if (fail) {
                            //Assert.fail("Unbekannter Fehler beim Ermitteln des Werts des Felds " + clazz.getSimpleName() + "::" + fieldName);
                            org.junit.jupiter.api.Assertions.fail("Unbekannter Fehler beim Ermitteln des Werts des Felds " + clazz.getSimpleName() + "::" + fieldName);
                        }
                    }
                }
        );

        return result.get();
    }

    public static <T, R> void setFieldValue(Class<T> clazz, String fieldName, T instance, R newValue, boolean fail) {
        getFieldDeclaration(clazz, fieldName, fail).ifPresent(
                f -> {
                    try {
                        f.set(instance, newValue);
                    } catch (IllegalAccessException e) {
                        if (fail) {
                            //Assert.fail("Unbekannter Fehler beim Setzen des Werts des Felds " + clazz.getSimpleName() + "::" + fieldName);
                            org.junit.jupiter.api.Assertions.fail("Unbekannter Fehler beim Setzen des Werts des Felds " + clazz.getSimpleName() + "::" + fieldName);
                        }
                    }
                }
        );
    }

    public static <T, R> Optional<R> getFieldValue(Class<T> clazz, String fieldName, T instance) {
        return getFieldValue(clazz, fieldName, instance, true);
    }

    public static <T, R> Optional<R> getProperty(Class<T> clazz, String propertyName, T instance) {
        return getProperty(clazz, propertyName, instance, true);
    }

    public static <T, R> Optional<R> getProperty(Class<T> clazz, String propertyName, T instance, boolean fail) {
        return invokeMethod(clazz, getGetterName(propertyName), instance, fail);
    }

    public static <T, R> void setProperty(Class<T> clazz, String propertyName, T instance, R newValue, boolean fail) {
        invokeMethod(clazz, getSetterName(propertyName), new Class<?>[] {instance.getClass()}, instance, new Object[] {newValue}, fail);

        getFieldValue(clazz, propertyName, instance, fail).ifPresent(
                //v -> Assert.assertEquals("Setzen des Werts mit Hilfe des Setters " + clazz.getSimpleName() + "::" + getSetterName(propertyName) + " scheint nicht zu funktionieren!",newValue, v)
                v -> org.junit.jupiter.api.Assertions.assertEquals( newValue, v,"Setzen des Werts mit Hilfe des Setters " + clazz.getSimpleName() + "::" + getSetterName(propertyName) + " scheint nicht zu funktionieren!")
        );
    }

    public static <T, R> void checkFieldDeclaration(Class<T> clazz, String fieldName, Class<R> fieldType, int[] modifiers) {
        checkFieldDeclaration(clazz, fieldName, fieldType, modifiers, true);
    }

    public static <T, R> void checkFieldDeclaration(Class<T> clazz, String fieldName, Class<R> fieldType, int[] modifiers, boolean fail) {
        getFieldDeclaration(clazz, fieldName, fail).ifPresent(
                f -> {
                    //Assert.assertEquals("Der Typ des Felds " + clazz.getSimpleName() + "::" + fieldName + " ist nicht korrekt!", fieldType, f.getType());
                    org.junit.jupiter.api.Assertions.assertEquals( fieldType, f.getType(),"Der Typ des Felds " + clazz.getSimpleName() + "::" + fieldName + " ist nicht korrekt!");

                    for (int modifier: modifiers) {

                        //Assert.assertEquals("Das Feld " + clazz.getSimpleName() + "::" + fieldName + " sollte mit dem Modifier '" + Modifier.toString(modifier) + "' versehen sein!", Modifier.toString(modifier), Modifier.toString(f.getModifiers() & modifier));
                        org.junit.jupiter.api.Assertions.assertEquals(  Modifier.toString(modifier), Modifier.toString(f.getModifiers() & modifier),"Das Feld " + clazz.getSimpleName() + "::" + fieldName + " sollte mit dem Modifier '" + Modifier.toString(modifier) + "' versehen sein!");
                    }
                }
        );
    }

    public static <T, R> void checkBeanSpecification(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers) {
        checkBeanSpecification(clazz, propertyName, type, modifiers, true);
    }

    public static <T, R> void checkBeanSpecification(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers, boolean fail) {
        checkGetter(clazz, propertyName, type, modifiers, fail);
        checkSetter(clazz, propertyName, type, modifiers, fail);
    }

    public static <T, R, S> void checkBeanSpecificationRelaxed(Class<T> clazz, String propertyName, Class<R> type, Class<S> returnTypeSetter, int[] modifiersGetter, int[] modifiersSetter) {
        checkBeanSpecificationRelaxed(clazz, propertyName, type, returnTypeSetter, modifiersGetter, modifiersSetter, true);
    }

    public static <T, R, S> void checkBeanSpecificationRelaxed(Class<T> clazz, String propertyName, Class<R> type, Class<S> returnTypeSetter, int[] modifiersGetter, int[] modifiersSetter, boolean fail) {
        checkGetter(clazz, propertyName, type, modifiersGetter, fail);
        checkSetterRelaxed(clazz, propertyName, type, returnTypeSetter, modifiersSetter, fail);
    }

    public static <T, R> void checkGetter(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers, boolean fail) {
        checkMethod(clazz, getGetterName(propertyName), type, new Class<?>[0], modifiers, fail);
    }

    public static <T, R> void checkGetter(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers) {
        checkGetter(clazz, propertyName, type, modifiers, true);
    }

    @SuppressWarnings("unchecked")
    public static <T, R> void checkSetter(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers, boolean fail) {
        checkMethod(clazz, getSetterName(propertyName), void.class, ArrayHelper.of(type), modifiers, fail);
    }

    @SuppressWarnings("unchecked")
    public static <T, R, S> void checkSetterRelaxed(Class<T> clazz, String propertyName, Class<R> type, Class<S> returnType, int[] modifiers, boolean fail) {
        checkMethod(clazz, getSetterName(propertyName), returnType, ArrayHelper.of(type), modifiers, fail);
    }

    public static <T, R, S> void checkSetterRelaxed(Class<T> clazz, String propertyName, Class<R> type, Class<S> returnType, int[] modifiers) {
        checkSetterRelaxed(clazz, propertyName, type, returnType, modifiers, true);
    }

    public static <T, R> void checkSetter(Class<T> clazz, String propertyName, Class<R> type, int[] modifiers) {
        checkSetter(clazz, propertyName, type, modifiers, true);
    }

    public static <T, R> void checkMethod(Class<T> clazz, String methodName, Class<R> returnType, Class<?>[] parameterTypes, int[] modifiers) {
        checkMethod(clazz, methodName, returnType, parameterTypes, modifiers, true);
    }

    public static <T, R> void checkMethod(Class<T> clazz, String methodName, Class<R> returnType, Class<?>[] parameterTypes, int[] modifiers, boolean fail) {
        getMethod(clazz, methodName, parameterTypes, fail).ifPresent(
                g -> {
                    if (returnType != null) {
                        //Assert.assertEquals("Der Typ des Rückgabewerts der Methode " + clazz.getSimpleName() + "::" + methodName + " ist nicht korrekt!", returnType, g.getReturnType());
                        org.junit.jupiter.api.Assertions.assertEquals( returnType, g.getReturnType(),"Der Typ des Rückgabewerts der Methode " + clazz.getSimpleName() + "::" + methodName + " ist nicht korrekt!");
                    }

                    for (int modifier: modifiers) {
                        if (0 == (g.getModifiers() & modifier)) {
                            //Assert.fail("Die Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes) + " sollte mit dem Modifier '" + Modifier.toString(modifier) + "' versehen sein! Die aktuell vorhandenen Modifizierer sind: " + Modifier.toString(g.getModifiers()));
                            org.junit.jupiter.api.Assertions.fail("Die Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes) + " sollte mit dem Modifier '" + Modifier.toString(modifier) + "' versehen sein! Die aktuell vorhandenen Modifizierer sind: " + Modifier.toString(g.getModifiers()));
                        }
                        //Assert.assertEquals("Die Methode " + clazz.getSimpleName() + "::" + methodName + getParameterTypesString(parameterTypes) + " sollte mit dem Modifier '" + Modifier.toString(modifier) + "' versehen sein!",
                        //        Modifier.toString(modifier), Modifier.toString(g.getModifiers() & modifier));
                    }
                }
        );
    }

    public static <T, R> void setProperty(Class<T> clazz, String propertyName, T instance, R newValue) {
        setProperty(clazz, propertyName, instance, newValue, true);
    }

    public static <T> boolean hasGetter(Class<T> clazz, String propertyName) {
        return hasMethod(clazz, getGetterName(propertyName));
    }

    @SuppressWarnings("unchecked")
    public static <T> boolean hasSetter(Class<T> clazz, String propertyName) {
        Field field = getFieldDeclaration(clazz, propertyName).orElseGet(() -> null);

        if (field != null) {
            return hasMethod(clazz, getSetterName(propertyName), ArrayHelper.of(field.getType()));
        }

        return false;
    }

    protected static String preparePropertyName(String propertyName) {
        return propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
    }

    protected static String getGetterName(String propertyName) {
        return "get" + preparePropertyName(propertyName);
    }

    protected static String getSetterName(String propertyName) {
        return "set" + preparePropertyName(propertyName);
    }

    /**
     * Creates a {@code String} object containing the type names passed as argument.
     *
     * @param parameterTypes type names to be formatted
     * @return type names within `()` and separated by `,` if required
     */
    protected static String getParameterTypesString(final Class<?>[] parameterTypes) {
        StringBuilder sbParams = new StringBuilder("(");

        boolean first = true;

        for (Class<?> t : parameterTypes) {
            sbParams.append(first ? "" : ", ")
                    .append(t.getSimpleName());
            first = false;
        }

        return sbParams.append(")").toString();
    }

    public static Class<?> findClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            //Assert.fail("Die Klasse '" + className + "' konnte nicht gefunden werden!");
            org.junit.jupiter.api.Assertions.fail("Die Klasse '" + className + "' konnte nicht gefunden werden!");
        }

        return null;
    }

    /**
     * Shortcut for invoking a main(String[] args) method of a given class.
     * The class itself is given by its name.
     *
     * @param className name of the class which should have a main(String[] args) method
     */
    public static void invokeMain(final String className) {
        invokeMain(className, true);
    }

    public static void invokeMain(final String className, boolean fail) {
        invokeMain(className, fail, false);
    }

    @SuppressWarnings("unchecked")
    public static void invokeMain(final String className, boolean fail, boolean mayThrow) throws RuntimeException {
        try {
            checkMethod(
                    findClass(className),
                    "main",
                    void.class,
                    new Class<?>[] {String[].class},
                    new int[] {Modifier.PUBLIC, Modifier.STATIC},
                    fail);

            invokeMethodRawEx(
                    findClass(className),
                    "main",
                    ArrayHelper.of(String[].class),
                    null,
                    ArrayHelper.of(),
                    fail
            );
        } catch (Throwable t) {
            if (mayThrow) {
                throw new RuntimeException(t);
            }
        }
    }
}
