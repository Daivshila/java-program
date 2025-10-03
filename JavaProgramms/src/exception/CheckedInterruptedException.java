package exception;

public class CheckedInterruptedException {
	 public static void main(String[] args) {
	        System.out.println("Program starts...");
	        try {
	            Thread.sleep(2000); // Checked exception
	        } catch (InterruptedException e) {
	            System.out.println("Caught Checked Exception: " + e);
	        }
	        System.out.println("Program ends...");
	    }
}
