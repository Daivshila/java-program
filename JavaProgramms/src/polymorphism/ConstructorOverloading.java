package polymorphism;

class Student {
    String name;
    int age;

    Student(String n) {
        name = n;
        age = 18;  // default age
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student("daivshila");
        Student s2 = new Student("gita", 21);

        s1.display();
        s2.display();
    }
}