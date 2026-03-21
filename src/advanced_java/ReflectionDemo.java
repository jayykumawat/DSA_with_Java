package advanced_java;

import java.lang.reflect.*;

/*
PROBLEM:
Demonstrate how to inspect and manipulate class
structure at runtime using Reflection API.

CONCEPT:
Reflection allows Java to examine and modify classes,
methods, fields, and constructors at runtime.

Used heavily in frameworks like Spring, Hibernate.

RULES:
1. Reflection works at runtime (not compile-time).
2. Can access private fields and methods.
3. Slower than normal method calls.
4. Use carefully due to security concerns.

TIME COMPLEXITY:
Reflection operations → slower than direct calls (O(n) scanning members)

SPACE COMPLEXITY:
O(1)
*/

// Sample class
class Person {

    private String name;

    public Person() {
        this.name = "Default";
    }

    public Person(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Name: " + name);
    }

    private void secretMethod() {
        System.out.println("Private method accessed!");
    }
}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        // 1. Get Class object
        Class<?> clazz = Class.forName("advanced_java.Person");

        System.out.println("Class Name: " + clazz.getName());

        // 2. Get Constructors
        Constructor<?>[] constructors = clazz.getConstructors();

        System.out.println("\nConstructors:");
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        // 3. Create Object using constructor
        Constructor<?> constructor = clazz.getConstructor(String.class);
        Object obj = constructor.newInstance("Jay");

        // 4. Get Methods
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("\nMethods:");
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        // 5. Invoke method
        Method showMethod = clazz.getMethod("showName");
        showMethod.invoke(obj);

        // 6. Access private method
        Method secret = clazz.getDeclaredMethod("secretMethod");
        secret.setAccessible(true);
        secret.invoke(obj);

        // 7. Access private field
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj, "Updated Name");

        System.out.println("\nAfter modifying field:");
        showMethod.invoke(obj);
    }
}
