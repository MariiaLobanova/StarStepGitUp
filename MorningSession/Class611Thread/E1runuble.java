package scr.MorningSession.Class611Thread;
// Exercise 1:
//Implement a Runnable that prints the alphabet from A to Z.
public class E1runuble {

    public static void main(String[] args) {
        Thread thread = new Thread(new Alphabet());
        thread.start();

    }
}
class Alphabet implements Runnable{
    @Override
    public void run() {
        for (char ch = 'A'; ch<='Z'; ch ++){
            System.out.print(ch+ "; ");
        }
    }
}
