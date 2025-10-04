package multithreading;

public class ThreadJoinDemo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch(Exception e) { }
        }
    }

    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();

        t1.start();
        try {
            t1.join();  // main waits for t1 to finish
        } catch(Exception e) { }

        t2.start();
    }
}

