package collections.advanced;
import java.util.TreeMap;

/**
 * Demonstrates TreeMap functionality.
 *
 * TreeMap stores key-value pairs in sorted order of keys.
 * Internally implemented using Red-Black Tree.
 *
 * Time Complexity:
 * put() → O(log n)
 * get() → O(log n)
 * remove() → O(log n)
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String>client=new TreeMap<>();
        client.put(101, "jay");
        client.put(102, "Rishi");
        client.put(103,"Vidhan");
        client.put(104,"Kunal");

        System.out.println("Client Map:"+client);

        System.out.println("First Key: "+client.firstKey());
        System.out.println("Last  Key: "+client.lastKey());

        client.remove(103);

        System.out.println("After Removing Key 2"+client);

    }
}
