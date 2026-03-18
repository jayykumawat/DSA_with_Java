package advanced_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
PROBLEM:
Demonstrate how to process collections efficiently using Streams API
by filtering, transforming, and collecting data.

CONCEPT:
Streams API (introduced in Java 8) allows functional-style operations
on collections such as filtering, mapping, and reducing.

It does NOT store data — it processes data.

RULES:
1. Stream does not modify the original collection.
2. It uses functional interfaces (Lambda expressions).
3. Operations are divided into:
   - Intermediate (filter, map)
   - Terminal (forEach, collect)
4. Streams are lazy (execute only when terminal operation is called).

TIME COMPLEXITY:
filter + map traversal → O(n)

SPACE COMPLEXITY:
O(n) (new list creation after collect)
*/

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        System.out.println("Original List: " + numbers);

        // Stream operations
        List<Integer> result = numbers.stream()
                .filter(n -> n > 30)     // filter values
                .map(n -> n * 2)         // transform values
                .collect(Collectors.toList()); // collect result

        System.out.println("Processed List: " + result);

        // forEach using stream
        System.out.println("\nPrinting using Stream:");
        numbers.stream()
                .forEach(n -> System.out.println(n));
    }
}