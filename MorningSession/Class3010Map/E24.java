package scr.MorningSession.Class3010Map;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//4.Custom Sorting with TreeSet:
//Create a TreeSet named personSet to store custom objects (e.g., Person) that implement the Comparable interface.
//Define a custom Person class with attributes such as name and age, and implement the compareTo method to define custom ordering.
//Add instances of the custom Person objects to personSet.
//Demonstrate that the TreeSet automatically sorts the Person objects based on the custom ordering.
//Create a loop or iterator to iterate through personSet and print the sorted custom objects.
public class E24 {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person("Anna",22));
        personSet.add(new Person("Valeria",23));
        personSet.add(new Person("Boris",21));
        personSet.add(new Person("Anton",18));

        for (Person person: personSet){
            System.out.println(person);
        }
    }
}
class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
@Override
    public int compareTo(Person other){
        int nameCopare = this.name.compareTo(other.name);
        if (nameCopare!=0){
            return nameCopare;
        }
        return Integer.compare(this.age,other.age);

}

    @Override
    public String toString() {
        return "Person{" + "name='" + name  +", age=" + age + '}';
    }
}