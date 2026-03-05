package collections.advanced;

import java.util.HashSet;

/**
 * Demonstrates HashSet functionality.
 *
 * HashSet stores unique elements only.
 * Internally it uses a HashMap.
 *
 * Time Complexity:
 * add() → O(1) average
 * remove() → O(1) average
 * contains() → O(1) average
 */
public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<String>fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate
        System.out.println("Fruits Set: "+fruits);

        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        fruits.remove("Banana");

        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size());
    }
}
