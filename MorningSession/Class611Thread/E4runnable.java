package scr.MorningSession.Class611Thread;
// Exercise 2:

public class E4runnable {

    public static void main(String[] args) {

        String[] names ={"Runner1","Runner2","Runner3","Runner4","Runner5"};
         for (String name : names){
             Thread racerThread = new Thread(new Ricer(name));
             racerThread.start();
         }
    }
}
class Ricer  implements Runnable{

    private String racerName;

    public Ricer(String racerName) {
        this.racerName = racerName;
    }

    @Override
    public void run() {
        System.out.println( racerName +" is running ");

    }
}
