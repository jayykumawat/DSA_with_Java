package collections;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
Demonstrate basic List operations using ArrayList.

Approach:
- Create ArrayList
- Add elements
- Access element by index
- Update element
- Remove element
- Iterate using for-each loop

Time Complexity:
- Add: O(1) amortized
- Get/Set: O(1)
- Remove (by index): O(N)

Space Complexity: O(N)
*/
public class ListBasics {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // Add
        names.add("Aman");
        names.add("Riya");
        names.add("Jay");
        names.add("Rahul");

        System.out.println("Original List: " + names);

        // Get
        System.out.println("Element at index 1: " + names.get(1));

        // Update
        names.set(2, "Jayy");
        System.out.println("After update: " + names);

        // Remove
        names.remove(0);
        System.out.println("After remove: " + names);

        // Iterate
        System.out.println("Iterating List:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
