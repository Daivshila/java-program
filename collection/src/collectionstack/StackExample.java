package collectionstack;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        stack.pop();
        System.out.println("After Pop: " + stack);
    }
}
