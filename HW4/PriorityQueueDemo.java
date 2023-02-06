package HW4;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> demoQueue = new PriorityQueue<String>();
        demoQueue.offer("Patrick");
        demoQueue.offer("Danny");
        demoQueue.offer("Carrol");
        demoQueue.offer("Tammy");
        demoQueue.offer("Reginald");

        PriorityQueue<String> demoQueue2 = new PriorityQueue<String>();
        demoQueue2.offer("Tammy");
        demoQueue2.offer("Patrick");
        demoQueue2.offer("Barry");
        demoQueue2.offer("Sally");
        demoQueue2.offer("Sam");

        System.out.println("Demoqueue: \n" + demoQueue);
        System.out.println("Demoqueue Two: \n" + demoQueue2);

        PriorityQueue<String> duplicates = new PriorityQueue<>(demoQueue);
        duplicates.retainAll(demoQueue2);
        System.out.println("Duplicates:\n" + duplicates);
    }
}