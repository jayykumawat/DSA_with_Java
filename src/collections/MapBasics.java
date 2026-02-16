package collections;

import java.util.HashMap;
import java.util.Map;

/*
Problem:
Demonstrate Map operations using HashMap.

Approach:
- Store key-value pairs
- Retrieve values
- Update values
- Iterate over entries

Time Complexity:
- put(): O(1) average
- get(): O(1) average

Space Complexity: O(N)
*/
public class MapBasics {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        // Add key-value pairs
        marks.put("Math", 90);
        marks.put("English", 75);
        marks.put("Science", 88);

        System.out.println("Marks Map: " + marks);

        // Get
        System.out.println("Math marks: " + marks.get("Math"));

        // Update
        marks.put("English", 80);
        System.out.println("After update: " + marks);

        // Check key exists
        System.out.println("Has Science? " + marks.containsKey("Science"));

        // Iterate
        System.out.println("Iterating Map:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
