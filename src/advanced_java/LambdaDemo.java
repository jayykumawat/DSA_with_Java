package advanced_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
PROBLEM:
Demonstrate how Lambda Expressions simplify code
when implementing functional interfaces.

CONCEPT:
Lambda Expressions were introduced in Java 8 to provide
a concise way to represent anonymous functions.

They are mainly used with Functional Interfaces
and help reduce boilerplate code.

RULES:
1. Lambda works only with Functional Interfaces
   (interfaces with exactly one abstract method).
2. Syntax: (parameters) -> { body }
3. Used heavily with Collections, Streams API, and threading.
4. Helps replace anonymous classes.

TIME COMPLEXITY:
Sorting using Collections.sort() → O(n log n)

SPACE COMPLEXITY:
O(1) extra space (in-place sorting).
*/

public class LambdaDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jay");
        names.add("Rahul");
        names.add("Kunal");
        names.add("Karan");

        System.out.println("Original List:");
        System.out.println(names);

        // Sorting using Lambda Expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("\nSorted List:");
        System.out.println(names);

        // Printing using Lambda
        System.out.println("\nPrinting using Lambda:");

        names.forEach(name -> System.out.println(name));
    }
}