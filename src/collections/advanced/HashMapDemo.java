package collections.advanced;

import java.util.HashMap;

/**
 * Demonstrates HashMap operations.
 *
 * HashMap stores data in key-value pairs.
 * Keys must be unique.
 * Values can be duplicated.
 *
 * Average Time Complexity:
 * put() → O(1)
 * get() → O(1)
 * remove() → O(1)
 */

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Jay");
        students.put(102, "Rishi");
        students.put(103, "Vidhan");

        // Duplicate key (value replaced)
        students.put(103, "Ayush");

        System.out.println("Students Map: " + students);

        System.out.println("Student with ID 101: " + students.get(101));

        students.remove(103);

        System.out.println("After removing key 103: " + students);

        System.out.println("Contains key 102? " + students.containsKey(102));

        System.out.println("Size: " + students.size());
    }
}