package collectionset;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);

        System.out.println("TreeSet (Sorted): " + ts);
        System.out.println("First Element: " + ts.first());
        System.out.println("Last Element: " + ts.last());
    }
}
