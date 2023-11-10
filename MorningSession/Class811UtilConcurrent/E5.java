package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Exercise 1: Schedule a task to print "I'm scheduled!" after 2 seconds.
public class E5 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(()-> {
            System.out.println("I'm scheduled!");
        },2, TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
