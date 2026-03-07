package collections.advanced;

/**
 * Demonstrates ListIterator.
 *
 * ListIterator allows bidirectional traversal.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bengalore");

        ListIterator<String>it=cities.listIterator();
        
        System.out.println("forward_Traverse");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward_Traverse");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
