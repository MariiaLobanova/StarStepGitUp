package scr.MorningSession.Class611Thread;
//Exercise 4

public class E4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
    }
}
class Timer extends Thread{
    @Override
    public void run(){
    for (int i=10; i>=0; i--) {
        System.out.println(i);
        try{ Timer.sleep(100);} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}