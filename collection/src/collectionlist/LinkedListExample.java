package collectionlist;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(25);

        System.out.println("LinkedList: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first & last: " + numbers);
    }
}
