package advanced_java;

import java.util.Optional;

/*
PROBLEM:
Handle null values safely without causing NullPointerException
using Optional class.

CONCEPT:
Optional is a container object introduced in Java 8
that may or may not contain a value.

It helps avoid null checks and NullPointerException.

RULES:
1. Optional can be empty or contain a value.
2. Use ofNullable() when value may be null.
3. Avoid using get() without checking.
4. Prefer orElse(), orElseGet(), orElseThrow().
5. Optional improves code readability and safety.

TIME COMPLEXITY:
All operations → O(1)

SPACE COMPLEXITY:
O(1)
*/

public class OptionalDemo {

    public static void main(String[] args) {

        String name = null;

        // 1. Creating Optional
        Optional<String> optionalName = Optional.ofNullable(name);

        // 2. Check value exists
        if (optionalName.isPresent()) {
            System.out.println("Value: " + optionalName.get());
        } else {
            System.out.println("Value is null");
        }

        // 3. Default value
        String result = optionalName.orElse("Default Name");
        System.out.println("Using orElse: " + result);

        // 4. Lazy default value
        String result2 = optionalName.orElseGet(() -> "Generated Default");
        System.out.println("Using orElseGet: " + result2);

        // 5. Throw exception
        try {
            String result3 = optionalName.orElseThrow(
                    () -> new RuntimeException("Value not found")
            );
            System.out.println(result3);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}