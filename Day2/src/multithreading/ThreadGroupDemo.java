package multithreading;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyGroup");

        Thread t1 = new Thread(tg, () -> {
            System.out.println("Thread 1 running");
        });
        Thread t2 = new Thread(tg, () -> {
            System.out.println("Thread 2 running");
        });

        t1.start();
        t2.start();

        System.out.println("Thread Group Name: " + tg.getName());
    }
}

