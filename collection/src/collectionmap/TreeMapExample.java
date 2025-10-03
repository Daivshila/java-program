package collectionmap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 30);
        map.put("Apple", 10);
        map.put("Orange", 20);

        System.out.println("TreeMap (Sorted by Keys): " + map);
    }
}
