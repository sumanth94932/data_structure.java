import java.util.PriorityQueue;
import java.util.Collections;

public class heap {

    // Method to demonstrate max-heap
    public void maxheap() {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        p.add(15);
        p.add(5);
        p.add(20);
        q.add(50);
        q.add(10);
        q.add(40);

        // Peek at the largest element
        System.out.println("Peek: " + p.peek());

        // Remove elements in max-priority order
        System.out.println("Removed: " + p.remove());
        System.out.println("Removed: " + p.remove());
        System.out.println("Removed: " + p.remove());
         System.out.println("Peek: " + q.peek());

        // Remove elements in max-priority order
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.maxheap(); // Call the method
    }
}
