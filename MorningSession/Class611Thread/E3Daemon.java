package scr.MorningSession.Class611Thread;
// Exercise 3:
//Simulate a garbage collector by creating a daemon thread that periodically prints "Cleaning up resources".
public class E3Daemon {

    public static void main(String[] args) {
        Thread maintread = Thread.currentThread();

        Thread garbageCol = new Thread(new GarbageCollections());
        garbageCol.setDaemon(true);
        garbageCol.start();

        for(int i = 1; i <=5; i++){
            System.out.println("main task is running......");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class GarbageCollections implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Cleaning up resources");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
