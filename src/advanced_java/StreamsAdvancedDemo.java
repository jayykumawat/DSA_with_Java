package advanced_java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
PROBLEM:
Demonstrate advanced Stream operations like sorting,
distinct filtering, limiting results, counting, and reduction.

CONCEPT:
Streams allow chaining multiple operations in a pipeline.
Advanced operations help in real-world data processing.

RULES:
1. Streams are immutable (original list unchanged).
2. Operations are lazy until terminal operation is called.
3. reduce() is used to combine elements into a single result.
4. Optional is used to avoid null results in min/max.

TIME COMPLEXITY:
Each traversal operation → O(n)

SPACE COMPLEXITY:
O(n) (new processed collections may be created)
*/

public class StreamsAdvancedDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 50, 60);

        System.out.println("Original List: " + numbers);

        // 1. distinct()
        System.out.println("\nDistinct Elements:");
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        // 2. sorted()
        System.out.println("\n\nSorted Elements:");
        numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        // 3. limit()
        System.out.println("\n\nFirst 3 Elements:");
        numbers.stream()
                .limit(3)
                .forEach(n -> System.out.print(n + " "));

        // 4. count()
        long count = numbers.stream()
                .filter(n -> n > 25)
                .count();

        System.out.println("\n\nCount of numbers > 25: " + count);

        // 5. reduce()
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum using reduce: " + sum);

        // 6. min / max
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
    }
}