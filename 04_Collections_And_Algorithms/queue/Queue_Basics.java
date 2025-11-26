import java.util.*;

public class Queue_Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        System.out.println("Queue: "+q);
        
        System.out.println("Dequeued: "+q.poll());
        
        System.out.println("Front: "+q.peek());
        
        System.out.println("Size: "+q.size());
        
        System.out.println("Is Empty? "+q.isEmpty());
        
        System.out.println("Queue now:"+ q);
        
    }
}
