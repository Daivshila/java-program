package inheritance;
class Parent {
    void displayParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is Child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayParent();
        c.displayChild();
    }
}


