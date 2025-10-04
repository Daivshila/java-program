package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String msg) { this.message = msg; }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) msg = " + message);
        try { Thread.sleep(1000); } catch(Exception e) {}
        System.out.println(Thread.currentThread().getName() + " (End)");
    }
}
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads pool
        for(int i=1; i<=6; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }
        executor.shutdown();
    }
}

