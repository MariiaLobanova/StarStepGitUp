package scr.MorningSession.Class611Thread;
// Exercise 2:

public class E2runnable {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Cooking());
        thread1.start();
        Thread thread2 = new Thread(new Eating());
        thread2.start();

    }
}
class Cooking implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Cooking");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Eating implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Eating");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}