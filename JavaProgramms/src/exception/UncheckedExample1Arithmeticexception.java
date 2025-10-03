package exception;

public class UncheckedExample1Arithmeticexception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // This will throw ArithmeticException at runtime
        int result = a / b;

        System.out.println("Result: " + result);
    }
}
