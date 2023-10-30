package scr.MorningSession.Class3010Map;

import java.util.HashMap;
import java.util.Map;

// .Iterating Over HashMap:
//Iterate through the studentMap using a for-each loop or an iterator.
//For each entry, print both the student ID (key) and the student name (value).
//Emphasize that the order of the entries in a HashMap is not guaranteed to be in any specific order.
public class E2 {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(2, "Anna");
        studentMap.put(5, "Veronica");
        studentMap.put(4, "Inna");
        studentMap.put(3, "Boris");
        studentMap.put(1, "Anton");

        for(Map.Entry<Integer, String> entry: studentMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}


