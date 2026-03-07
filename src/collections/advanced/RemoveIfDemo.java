package collections.advanced;

import java.util.ArrayList;

/**
 * Demonstrates removeIf() method using lambda expression.
 *
 * removeIf() removes elements based on a condition.
 */

public class RemoveIfDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(15);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        // Remove numbers greater than 20
        numbers.removeIf(num -> num > 20);

        System.out.println("After removeIf (>20): " + numbers);
    }
}