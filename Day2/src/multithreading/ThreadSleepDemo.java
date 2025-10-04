package multithreading;

public class ThreadSleepDemo extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // sleep 1 sec
            } catch(Exception e) { }
        }
    }

    public static void main(String[] args) {
        ThreadSleepDemo t1 = new ThreadSleepDemo();
        ThreadSleepDemo t2 = new ThreadSleepDemo();

        t1.start();
        t2.start();
    }

}
