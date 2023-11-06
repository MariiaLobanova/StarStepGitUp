package scr.MorningSession.Class611Thread;
//Exercise 1:
//Create a thread that prints numbers from 1 to 10.
public class E1 {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.start();
    }
}
class Numbers extends Thread{
    @Override
    public void run(){
    for (int i=1; i<=10; i++) {
        System.out.println(i);
    }

    }
}