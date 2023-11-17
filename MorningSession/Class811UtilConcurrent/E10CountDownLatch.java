package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
//xercise 2: Use CyclicBarrier to make 2 threads print "We are done!" at the same time.

//explanation: main is working
//first is doing some work.
//Thread 2 is doing some work.
//We are done!
//Thread 4 is doing some work.
//We are done!
//Thread 3 is doing some work.
//We are done!
//We are done!  Поскольку порядок выполнения потоков не гарантируется,
// вы можете наблюдать различный порядок сообщений "выполняем работу",
// но сообщение "Мы закончили!" всегда будет выводиться после того, как
// первые два потока завершат свою работу и достигнут барьера. Хаотичный вывод -
// это ожидаемое поведение при одновременном выполнении потоков.
public class E10CountDownLatch {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        Thread thread1 = new Thread(new Workers(cyclicBarrier, "first"));
        Thread thread2 = new Thread(new Workers(cyclicBarrier, "Thread 2"));
        Thread thread3 = new Thread(new Workers(cyclicBarrier, "Thread 3"));
        Thread thread4 = new Thread(new Workers(cyclicBarrier, "Thread 4"));

        System.out.println(" main is working");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class Workers implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final String name;

    public Workers(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // Perform some work
            System.out.println(name + " is doing some work.");
            // Wait for other threads to reach the barrier
            cyclicBarrier.await();
            // Print "We are done!" after reaching the barrier
            System.out.println("We are done!");

     //   } catch (BrokenBarrierException e) {
       //     throw new RuntimeException(e);
     //   } catch (InterruptedException e) {
      //      throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
