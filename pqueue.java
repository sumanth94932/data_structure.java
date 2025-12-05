import java.util.PriorityQueue;
import java.util.Collections;

public class pqueue {
    public static void main(String args[]) {
        
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        p.add(15);
        p.add(5);
        p.add(20);

        // Peek at the largest element
        System.out.println("Peek: " + p.peek());

        // Remove elements in max-priority order
        System.out.println("Removed: " + p.remove());
        System.out.println("Removed: " + p.remove());
        System.out.println("Removed: " + p.remove());
    }
}
