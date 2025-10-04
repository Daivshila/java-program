package multithreading;

public class ThreadYieldDemo extends Thread {
	 public void run() {
	        for(int i=0; i<5; i++) {
	            System.out.println(Thread.currentThread().getName() + " : " + i);
	            Thread.yield(); // give chance to other threads
	        }
	    }
	    public static void main(String[] args) {
	    	ThreadYieldDemo t1 = new ThreadYieldDemo();
	    	ThreadYieldDemo t2 = new ThreadYieldDemo();
	        t1.start();
	        t2.start();
	    }
	}



