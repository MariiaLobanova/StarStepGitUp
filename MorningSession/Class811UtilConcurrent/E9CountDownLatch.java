package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
//1:  elizabeth
// create 3 threads that wait for each other to start at the same time.
public class E9CountDownLatch extends Thread {

    private static final CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) {
        Thread thread1 = new E9CountDownLatch();

        Thread thread2 = new E9CountDownLatch();

        Thread thread3 = new E9CountDownLatch();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + "all threads completed treir work");
        latch.countDown();

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "is starting");
    }
}

