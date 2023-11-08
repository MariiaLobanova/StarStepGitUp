package scr.MorningSession.Class611Thread;

public class E4Daemon {

    public static void main(String[] args) {
        Thread playingMusic = Thread.currentThread();

        Thread background = new Thread(new BackgroundMusic());
        background.setDaemon(true);
        background.start();

        for(int i = 1; i <=5; i++){
            System.out.println("music......");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class BackgroundMusic implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Background music is playing.....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
