package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Exercise 2: Use ExecutorService to execute tasks that print out their names ("Task 1", "Task 2").
public class E4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
        executor.execute(() -> {
             {System.out.println("Task1");}

        });
        executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
        executor.execute(() -> {
            System.out.println("task2");
        });
        executor.shutdown();

    }
}
