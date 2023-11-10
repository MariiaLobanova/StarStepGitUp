package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class E7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(()->{
            int number1 = 5;
            int number2 = 15;
            return number1*number2;
        });
        try {
            Integer result;
        } finally {

        }

    }
}
