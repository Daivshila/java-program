package exception;

public class UncheckedExample4Numformat {
	 public static void main(String[] args) {
	        String s = "abc";

	        // Trying to convert non-numeric string to number
	        int num = Integer.parseInt(s);

	        System.out.println(num);
	    }

}
