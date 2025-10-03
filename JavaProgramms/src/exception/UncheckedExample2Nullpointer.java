package exception;

public class UncheckedExample2Nullpointer {
	private static String str;

	public static void main(String[] args) {
        str = null;

        // This will throw NullPointerException at runtime
        System.out.println(str.length());
    }
}
