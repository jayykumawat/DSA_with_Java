package collections.advanced;

/**
 * Demonstrates Iterator usage.
 *
 * Iterator is used to traverse collections safely.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Jay");
        names.add("kunal");
        names.add("karan");
        names.add("vishal");

        Iterator<String>it=names.iterator();
        while (it.hasNext()) {
            String name=it.next();
            System.out.println(name);
        }
    }
}
