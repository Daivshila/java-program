package polymorphism;
class Parentp {
    String name = "Parent Variable";
}

class Childc extends Parentp {
    String name = "Child Variable";
}

public class VariableShadowingExample {
    public static void main(String[] args) {
        Parentp p = new Parentp();
        System.out.println(p.name);   // Parent Variable

        Childc c = new Childc();
        System.out.println(c.name);   // Child Variable

        Parentp pc = new Childc(); 
        System.out.println(pc.name);  // Parent Variable (NOT Child!)
    }
}



