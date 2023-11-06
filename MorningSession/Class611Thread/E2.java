package scr.MorningSession.Class611Thread;
//Exercise 2:
//Create two threads where one thread prints even numbers and the other prints odd numbers from 1 to 20.
public class E2 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.start();
        OddNumber oddNumber= new OddNumber();
        oddNumber.start();
    }
}
class Number extends Thread{
    @Override
    public void run(){
    for (int i=1; i<=10; i++) {
        System.out.println(i);
    }
    }
}
class OddNumber extends Thread{
    @Override
    public void run(){
        for (int i=1; i<=20; i += 2) {
            System.out.println(i);
        }

    }
}