package collections;

import java.util.HashSet;
import java.util.Set;

/*
Problem:
Demonstrate Set behavior using HashSet.

Key Concept:
- Set never stores duplicate values.

Approach:
- Add duplicate values
- Print the set
- Check contains()

Time Complexity:
- add(): O(1) average
- contains(): O(1) average

Space Complexity: O(N)
*/
public class SetBasics {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // duplicate
        numbers.add(20); // duplicate

        System.out.println("Set values: " + numbers);

        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println("Contains 99? " + numbers.contains(99));
    }
}
