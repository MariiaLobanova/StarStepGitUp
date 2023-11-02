package scr.MorningSession.Class3010Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 1.Basic HashSet:
//Create a HashSet named integerSet to store a collection of unique integers.
//Use the add method to add at least four different integers to the set.
//Attempt to add a duplicate integer to the set to demonstrate that the set ensures uniqueness.
//Create a loop or iterator to iterate through integerSet and print its contents.
public class E21 {

    public static void main(String[] args) {
        Set<Integer> integerSet= new HashSet<>();

        integerSet.add(100);
        integerSet.add(300);
        integerSet.add(500);
        integerSet.add(200);

        System.out.println(integerSet);

        integerSet.add(500);

        System.out.println(integerSet);

        Iterator<Integer> i = integerSet.iterator();
        while (i.hasNext()){
        System.out.println("**********");
        System.out.println(i.next());}
    }
}
