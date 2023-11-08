package scr.MorningSession.Class611Thread;
// Exercise 2:
//Create a main thread that performs a task (e.g., printing "Main task")
// and a daemon thread that runs in the background.
public class E2Daemon {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        Thread daemonThread = new Thread(new DaemonThreads());
        daemonThread.setDaemon(true);
        daemonThread.start();

        for(int i=1; i<=5; i++){
            System.out.println("main task "+ i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class DaemonThr implements Runnable{
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
