package polymorphism;
class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles
    double add(double a, double b) {
        return a + b;
    }
}
 public class MethodOverloding {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(5, 15, 25));
        System.out.println("Sum of 2 doubles: " + calc.add(4.5, 3.2));
		
	}

}
