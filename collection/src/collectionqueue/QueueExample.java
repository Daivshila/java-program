package collectionqueue;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Head Element: " + pq.peek());

        pq.poll();
        System.out.println("After Poll: " + pq);
    }

}
