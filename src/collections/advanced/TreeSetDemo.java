package collections.advanced;

import java.util.TreeSet;

/**
 * Demonstrates TreeSet functionality.
 *
 * TreeSet stores unique elements in sorted order.
 * Internally implemented using Red-Black Tree.
 *
 * Time Complexity:
 * add() → O(log n)
 * remove() → O(log n)
 * contains() → O(log n)
 */

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // duplicate ignored

        System.out.println("Numbers: " + numbers);

        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        numbers.remove(30);

        System.out.println("After removing 30: " + numbers);
    }
}