package scr.MorningSession.Class911SOLID;
//Create a class Animal with a method makeSound().
// Extend this class to create Dog and Cat classes.
// Ensure that you can add more animals without changing the Animal class.
public class AnimalO {

    void makeSound(){
        System.out.println("make a sound");
    }

}
class Cat extends AnimalO{
    void makeSound(){
        System.out.println("make meow meow");
    }

}
class Dog1 extends AnimalO{
    void makeSound(){
        System.out.println("make woff woff");
    }
}
class Main2{
    public static void main(String[] args) {
        AnimalO an = new AnimalO();
        an.makeSound();

        Dog1 myDog= new Dog1();
        myDog.makeSound();

        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
