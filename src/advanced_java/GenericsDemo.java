package advanced_java;

import java.util.ArrayList;
import java.util.List;

/*
PROBLEM:
Demonstrate how Generics provide type safety in Java
and allow reusable classes and collections.

CONCEPT:
Generics allow a class, interface, or method to operate
on different data types while providing compile-time type safety.

RULES:
1. Generic type parameters are defined using <T>.
2. Generics eliminate the need for type casting.
3. Type safety is enforced at compile time.
4. Generics work with classes, interfaces, and methods.
5. Primitive types cannot be used directly (use wrapper classes).

TIME COMPLEXITY:
Operations used (add, get) in ArrayList → O(1) average.

SPACE COMPLEXITY:
O(n) where n is the number of elements stored.
*/


// Generic class
class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        // Generic class with String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");

        System.out.println("String Box Value: " + stringBox.getValue());

        // Generic class with Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        System.out.println("Integer Box Value: " + intBox.getValue());

        // Generic Collection Example
        List<String> names = new ArrayList<>();

        names.add("Jay");
        names.add("Kunal");
        names.add("Rishi");

        System.out.println("\nNames List:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}