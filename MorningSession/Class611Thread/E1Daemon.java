package scr.MorningSession.Class611Thread;
// Create a daemon thread that prints "Background task running" every second.
public class E1Daemon {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThreads());
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class DaemonThreads implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Background task running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
