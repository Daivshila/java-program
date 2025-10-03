package collectionset;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored

        System.out.println("HashSet: " + set);

        set.remove("Banana");
        System.out.println("After Remove: " + set);
    }
}
