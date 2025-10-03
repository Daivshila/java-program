package inheritance;

class GrandParent {
    void showGrandParent() {
        System.out.println("I am GrandParent");
    }
}

class Parent1 extends GrandParent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child1 extends Parent1 {
    void showChild() {
        System.out.println("I am Child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.showGrandParent();
        c.showParent();
        c.showChild();
    }
}



