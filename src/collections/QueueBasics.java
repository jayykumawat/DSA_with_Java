package collections;

import java.util.LinkedList;
import java.util.Queue;

/*
Problem:
Demonstrate Queue operations using LinkedList.

Queue Rule:
- FIFO (First In First Out)

Approach:
- offer() -> insert
- peek() -> front element
- poll() -> remove front element

Time Complexity:
- offer(): O(1)
- poll(): O(1)
- peek(): O(1)

Space Complexity: O(N)
*/
public class QueueBasics {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Insert elements
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        // Peek
        System.out.println("Front element (peek): " + queue.peek());

        // Remove
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Remove again
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
