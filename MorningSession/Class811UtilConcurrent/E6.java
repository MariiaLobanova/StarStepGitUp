package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Exercise 2: Create a task that prints "Repeating task" every second.
public class E6 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(()-> {
            System.out.println("Repeating task");
        },1,1, TimeUnit.SECONDS);
    }
}
