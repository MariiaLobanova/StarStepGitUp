package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class E8Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = (Future<String>) executorService.submit(()->{
            String line = "doing work";
            int result = line.length();
            System.out.println(result);
        });
        System.out.println("doing something");
        future.get();

        executorService.shutdown();
    }
}
