package DSA_with_Java.tests;

import java.util.Vector;

/*
Problem:
Maintain a thread-safe inventory list.
If the item "Out of Stock" is not present,
insert it at index 2.

Concept Used:
Vector (Thread-safe dynamic array)

Approach:
1. Create a Vector to store inventory items.
2. Add initial items.
3. Traverse the Vector to check if "Out of Stock" exists.
4. If not found, insert it at index 2.
5. Print the final inventory list.

Why Vector?
- Vector is synchronized.
- Suitable for thread-safe operations.

Time Complexity:
- Traversal: O(N)
- Insertion at index: O(N)
Overall: O(N)

Space Complexity:
- O(N) for storing inventory items.
*/

public class ThreadSafeInventory {

    public static void main(String[] args) {

        // Step 1: Create inventory list
        Vector<String> inventory = new Vector<>();

        // Step 2: Add initial items
        inventory.add("Laptop");
        inventory.add("Mouse");
        inventory.add("Keyboard");
        inventory.add("Monitor");
        inventory.add("Printer");

        // Step 3: Check if "Out of Stock" exists
        boolean found = false;

        for (String item : inventory) {
            if (item.equals("Out of Stock")) {
                found = true;
                break;
            }
        }

        // Step 4: Insert if not found
        if (!found) {
            inventory.insertElementAt("Out of Stock", 2);
        }

        // Step 5: Print result
        System.out.println("Final Inventory List: " + inventory);
    }
}
