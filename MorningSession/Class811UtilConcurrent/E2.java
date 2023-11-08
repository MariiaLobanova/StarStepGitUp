package scr.MorningSession.Class811UtilConcurrent;
import java.util.concurrent.Executor;

//Exercise 2: Use Executor to execute two tasks that print numbers from 1 to 3.
public class E2 {
    public static void main(String[] args) {
        Executor executor = new Task();
        Runnable task1 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
        };
        Runnable task2 = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
        };
        executor.execute(task1);
        executor.execute(task2);
    }

}
class Task implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
}

