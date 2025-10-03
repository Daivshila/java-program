package abstraction;

abstract class Animal {
	
 abstract void sound();
 void sleep() {
     System.out.println("Sleeping...");
 }
}
class Dog extends Animal {
 void sound() {
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 void sound() {
     System.out.println("Cat meows");
 }
}

public class AbstractClassExample {
 public static void main(String[] args) {
     Animal a1 = new Dog();
     Animal a2 = new Cat();

     a1.sound();
     a1.sleep();

     a2.sound();
     a2.sleep();
 }
}

