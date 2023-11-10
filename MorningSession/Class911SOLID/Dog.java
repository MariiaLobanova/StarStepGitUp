package scr.MorningSession.Class911SOLID;
//magine a class Dog that barks and eats. Separate these behaviors into two classes: DogSound and DogFood

public class Dog {
    private DogSound dogSound;
    private DogFood dogFood;

    public Dog() {
        this.dogSound = new DogSound();
        this.dogFood = new DogFood();
    }

    public void makeSound() {
        dogSound.bark();
    }

    public void eat() {
        dogFood.consume();
    }
}
class DogSound{
    public void bark() {
        System.out.println("Woof! Woof!");
    }

}
class DogFood {
    public void consume() {
        System.out.println("Dog is eating.");
    }
}
    class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.makeSound(); // Outputs: Woof! Woof!
            myDog.eat();       // Outputs: Dog is eating.
        }
    }

