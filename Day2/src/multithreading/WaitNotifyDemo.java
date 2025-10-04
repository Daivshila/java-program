package multithreading;

class Shared {
    synchronized void printMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + ": " + msg);
        try {
            wait(); // waits until notify() is called
        } catch(Exception e) {}
        System.out.println(Thread.currentThread().getName() + " resumed...");
    }

    synchronized void resumeThread() {
        notify(); // wakes up waiting thread
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Shared shared = new Shared();

        Thread t1 = new Thread(() -> shared.printMessage("Waiting..."));
        Thread t2 = new Thread(() -> {
            try { Thread.sleep(2000); } catch(Exception e) {}
            shared.resumeThread();
        });

        t1.start();
        t2.start();
    }
}
