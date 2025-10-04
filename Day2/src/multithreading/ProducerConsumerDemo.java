package multithreading;

class Company {
    int n;
    boolean f = false;

    synchronized public void produce(int n) {
        if(f) { // already produced, wait
            try { wait(); } catch(Exception e) {}
        }
        this.n = n;
        System.out.println("Produced: " + n);
        f = true;
        notify();
    }

    synchronized public void consume() {
        if(!f) { // nothing to consume, wait
            try { wait(); } catch(Exception e) {}
        }
        System.out.println("Consumed: " + n);
        f = false;
        notify();
    }
}

class Producer extends Thread {
    Company c;
    Producer(Company c) { this.c = c; }
    public void run() {
        for(int i = 1; i <= 5; i++) {
            c.produce(i);
        }
    }
}

class Consumer extends Thread {
    Company c;
    Consumer(Company c) { this.c = c; }
    public void run() {
        for(int i = 1; i <= 5; i++) {
            c.consume();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}

