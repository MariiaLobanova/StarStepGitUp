package scr.MorningSession.Class811UtilConcurrent;

import java.util.concurrent.Executor;

//' Exercise 1: Use Executor to run a task that prints "Hello from Executor!".'
public class E1 {
    public static void main(String[] args) {
        Executor executor = new Invoker();
        executor.execute( () -> {
            System.out.println("Hello from Executor!");
        });
    }

}
class Invoker implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
}

