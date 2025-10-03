package inheritance;
interface A {
    void methodA();
}

class B {
    void methodB() {
        System.out.println("Method B from class B");
    }
}

interface C {
    void methodC();
}

class D extends B implements A, C {
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}



