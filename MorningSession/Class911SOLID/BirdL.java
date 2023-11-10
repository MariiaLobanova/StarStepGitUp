package scr.MorningSession.Class911SOLID;
// Exercise 1:
//Given a class Bird with a method fly(),
// ensure that subclasses like Penguin and Sparrow can be used interchangeably without causing errors.
public class BirdL {

    interface birdCanFly {
        void fly();
    }

    class bird implements birdCanFly {
        @Override
        public void fly() {
            System.out.println("bird can flying");
        }
    }

    class Penguin extends bird {
    }

    class Sperrow extends bird {
        @Override
        public void fly() {
            System.out.println("sperrow can flying");
        }
    }

    public void main(String[] args) {
        bird mybird = new bird();
        mybird.fly();

        birdCanFly penguin = new Penguin();
        penguin.fly();

        birdCanFly sperrow = new Sperrow();
        sperrow.fly();


    }
}


