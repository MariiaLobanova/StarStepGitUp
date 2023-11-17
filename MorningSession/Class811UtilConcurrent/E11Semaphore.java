package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.Semaphore;

//Exercise 1: Limit access to a resource so that only 2 threads can access it at a time.
public class E11Semaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        Thread thread1 = new Thread( new Worker(semaphore, "thread1"));
        Thread thread2 = new Thread( new Worker(semaphore, "thread2"));
        Thread thread3 = new Thread( new Worker(semaphore, "thread3"));
        Thread thread4 = new Thread( new Worker(semaphore, "thread4"));
        Thread thread5 = new Thread( new Worker(semaphore, "thread5"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
class Worker implements Runnable {
    private final Semaphore semaphore;
    private final String name;

    public Worker(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // Acquire a permit from the semaphore (blocks if no permits are available)
            semaphore.acquire();
            System.out.println(name + " is accessing the resource.");

            // Simulate some work being done
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Release the permit when done
            semaphore.release();
            System.out.println(name + " has released the resource.");
        }
    }
}