package collections.advanced;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Demonstrates basic operations of LinkedList.
 *
 * LinkedList internally uses a doubly linked list.
 *
 * Time Complexity:
 * Insert/Delete at ends → O(1)
 * Random access → O(n)
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String>cities=new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.addFirst("Kolkata");
        cities.addLast("Chennai");

         System.out.println("Cities: " + cities);

        cities.removeFirst();
        cities.removeLast();

        System.out.println("After removals: " + cities);

        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
    }
    
}

// LinkedList<String>animal=new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        // LinkedList<String>removeanimal =new LinkedList<>(Arrays.asList("dog","lion"));
        // animal.removeAll(removeanimal);
        // System.out.println(animal);