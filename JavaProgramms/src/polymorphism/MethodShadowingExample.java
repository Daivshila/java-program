package polymorphism;
class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class");
    }
}

public class MethodShadowingExample {
    public static void main(String[] args) {
        Parent.display();   // Calls Parent.display()

        Child.display();   // Calls Child.display()

        Parent.display();  // Calls Parent.display() (not Child!)
    }
}


