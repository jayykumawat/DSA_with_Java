package DSA_with_Java.tests;

/*
Problem:
Generate a new unique ID by:
1. Taking a numeric ID in String format.
2. Converting it to primitive int using Integer wrapper class.
3. Performing a calculation (multiply by 2).
4. Converting the result back to String.

Concept Used:
- Wrapper Class (Integer)
- Autoboxing / Unboxing
- String ↔ int conversion

Approach:
1. Store numeric value as String.
2. Use Integer.parseInt() to convert String → int.
3. Perform required operation.
4. Convert int → String using String.valueOf().
5. Print results.

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class UniqueIDGenerator {

    public static void main(String[] args) {

        // Step 1: Input as String
        String input = "1024";

        // Step 2: Convert String → int
        int id = Integer.parseInt(input);

        // Step 3: Perform operation
        int newId = id * 2;

        // Step 4: Convert int → String
        String output = String.valueOf(newId);

        // Step 5: Display results
        System.out.println("Original String Input: " + input);
        System.out.println("Converted int ID: " + id);
        System.out.println("After Multiply by 2: " + newId);
        System.out.println("Final Output String: " + output);
    }
}
