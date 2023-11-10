package scr.MorningSession.Class911UtilConcurrent;

import java.util.concurrent.ThreadFactory;

// Exercise 1: Use ThreadFactory to create a thread with a custom name.
public class ThreadFactoryE1 {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new CustomThreadFactory();
        Thread customThread = threadFactory.newThread(() -> {
            System.out.println("Custom name." + Thread.currentThread().getName());
        });
        customThread.start();
    }

    static class CustomThreadFactory implements ThreadFactory {
        private static int threadCount = 13;

        @Override
        public Thread newThread(Runnable r) {
            // Create a new thread with a custom name
            Thread thread = new Thread(r, "CustomThread-" + threadCount++);
            return thread;
        }
    }
}
