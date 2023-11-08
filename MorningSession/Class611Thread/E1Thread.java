package scr.MorningSession.Class611Thread;
//Exercise 1:
//Create a thread that sleeps for 5 seconds and then prints "Awake". Handle InterruptedException.
public class E1Thread {

    public static void main(String[] args) {
        Thread sleep = new Thread(new SleepTask());
        sleep.start();
    }
}
class SleepTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Awake!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
