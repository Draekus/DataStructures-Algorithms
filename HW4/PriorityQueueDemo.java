package HW4;

/*
 *  Patrick Gould
 *  CSC-242-01
 *  Priority Queues HW 20.10
 * 
 *  This program creates two priority queues and applies the union,
 *  difference, and intersection set operations on them.
 */

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Create a priority stack called queue
        PriorityQueue<String> queue = new PriorityQueue<String>();
        // Add names to the queue
        queue.offer("Patrick");
        queue.offer("Danny");
        queue.offer("Carrol");
        queue.offer("Tammy");
        queue.offer("Reginald");
        queue.offer("James");

        // Create a priority stack called queue2
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        // Add names to the queue
        queue2.offer("Tammy");
        queue2.offer("Patrick");
        queue2.offer("Barry");
        queue2.offer("Sally");
        queue2.offer("Sam");
        queue2.offer("Nancy");

        // Print first queue to console
        System.out.println("First Queue: " + queue);
        // Print second queue to console
        System.out.println("Second Queue: " + queue2 + "\n");

        // Perform the union, difference, and intersection set operations on both priority queues
        PriorityQueue<String> union = union(queue, queue2);
        PriorityQueue<String> difference = difference(queue, queue2);
        PriorityQueue<String> intersection = intersection(queue, queue2);
        
        System.out.println("Union: " + union);
        System.out.println("Difference:" + difference);
        System.out.println("Intersection: " + intersection);
    }

    // Merges two priority queues and returns it
    public static <T> PriorityQueue<T> union(PriorityQueue<T> queue, PriorityQueue<T> queue2) {
        PriorityQueue<T> union = new PriorityQueue<T>(queue);
		union.addAll(queue2); 
		return union;
    }

    // Merges only the unique items from two priority queues and returns it
    public static <T> PriorityQueue<T> difference(PriorityQueue<T> queue, PriorityQueue<T> queue2) {
        PriorityQueue<T> difference = new PriorityQueue<T>(queue);
		difference.removeAll(queue2);
		return difference;
    }

    // Merges only the duplicates between two priority queues and returns it
    public static <T> PriorityQueue<T> intersection(PriorityQueue<T> queue, PriorityQueue<T> queue2) {
        PriorityQueue<T> intersection = new PriorityQueue<>(queue);
		intersection.retainAll(queue2);
		return intersection;
    }

  

}