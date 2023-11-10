package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Exercise 1: Create an ExecutorService to execute a task that prints "ExecutorService in action!".
public class E3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            System.out.println("ExecutorService in action!");
        });

        executorService.shutdown();
    }
}

