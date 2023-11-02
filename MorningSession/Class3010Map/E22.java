package scr.MorningSession.Class3010Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// .HashSet for String Deduplication:
//Create a HashSet named uniqueStrings to store unique strings.
//Define an array of strings with some duplicate values (e.g., "apple", "banana", "apple", "cherry").
//Iterate through the array of strings and add each string to uniqueStrings to deduplicate the list.
//Create a loop or iterator to iterate through uniqueStrings and print the unique strings.
public class E22 {
    public static void main(String[] args) {

        Set<String> uniqueStrings = new HashSet<>();

        uniqueStrings.addAll(Arrays.asList("apple", "banana", "apple", "cherry"));
        uniqueStrings.add("cucumber");
        uniqueStrings.add("watermelon");

        System.out.println(uniqueStrings);
        System.out.println("***********");

        Iterator<String> i = uniqueStrings.iterator();
        while (i.hasNext()){

            System.out.println(i.next());}

    }
}
