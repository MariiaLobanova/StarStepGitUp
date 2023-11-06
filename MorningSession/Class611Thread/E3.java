package scr.MorningSession.Class611Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

//Simulate a clock by creating a thread that prints the current time every second.
public class E3 {

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }
}
class Clock extends Thread{
    @Override
    public void run(){
        while(true){
            SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
            String curentTime= sdf.format(new Date());

            System.out.println(curentTime);

        try {
            Clock.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}