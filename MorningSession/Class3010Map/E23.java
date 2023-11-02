package scr.MorningSession.Class3010Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//3.TreeSet with Natural Ordering:
//Create a TreeSet named sortedSet to store a collection of integers.
//Add at least four integers to the set.
//Demonstrate that the TreeSet automatically sorts the integers in natural (ascending) order.
//Create a loop or iterator to iterate through sortedSet and print its sorted contents.
public class E23 {

    public static void main(String[] args) {
        Set<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(28);
        sortedSet.add(13);
        sortedSet.add(54);
        sortedSet.add(2);
        sortedSet.add(41);

        System.out.println(sortedSet);
        System.out.println("********");

        Iterator<Integer> i= sortedSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
