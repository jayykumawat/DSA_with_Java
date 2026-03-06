package collections.advanced;
import java.util.LinkedHashMap;

/**
 * Demonstrates LinkedHashMap functionality.
 *
 * LinkedHashMap maintains insertion order.
 * Internally uses HashMap + Doubly Linked List.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>people=new LinkedHashMap<>();
        people.put(101, "Jay");
        people.put(102,"Rishi");
        people.put(103, "Vidhan");
        people.put(104, "Vishwas");

        System.out.println("People's Map: "+people);
        people.remove(104);

        System.out.println("After Removing Key-104"+people);

    }
}
