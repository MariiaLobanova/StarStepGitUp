package scr.MorningSession.Class911SOLID;
//You have an interface AnimalBehavior with methods fly(), swim(),
// and run(). Split this interface so that Fish, Bird, and Dog classes don't implement irrelevant methods.
public class AnimalBehavior {
}
interface Flying{
    void fly();
};
interface Swimming{
    void swim();
};
interface Running{};

class Fish{}

class Bird{}

class Dog2{}