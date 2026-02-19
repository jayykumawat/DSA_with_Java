package DSA_with_Java.tests;

import java.util.ArrayList;
import java.util.Iterator;

/*
Problem:
Given a list of product prices, remove all prices
that are greater than 500.

Important Rule:
Do NOT remove elements using a normal for-loop
because it causes ConcurrentModificationException.

Concept Used:
- ArrayList
- Iterator
- Safe removal using Iterator.remove()

Approach:
1. Create an ArrayList of prices.
2. Use an Iterator to traverse the list.
3. If price > 500, remove it using it.remove().
4. Print the filtered list.

Why Iterator?
- Removing elements while iterating using
  normal loop causes runtime error.
- Iterator.remove() safely removes elements.

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class PriceFilter {

    public static void main(String[] args) {

        // Step 1: Create price list
        ArrayList<Integer> prices = new ArrayList<>();

        prices.add(200);
        prices.add(650);
        prices.add(450);
        prices.add(900);
        prices.add(300);
        prices.add(700);

        System.out.println("Original Prices: " + prices);

        // Step 2: Use Iterator
        Iterator<Integer> it = prices.iterator();

        while (it.hasNext()) {
            int price = it.next();

            if (price > 500) {
                it.remove(); // Safe removal
            }
        }

        // Step 3: Print filtered result
        System.out.println("Filtered Prices (<= 500): " + prices);
    }
}

