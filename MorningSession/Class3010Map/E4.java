package scr.MorningSession.Class3010Map;

import java.util.HashMap;
import java.util.Map;

// 4.Removing Entries from HashMap:
//Remove an entry from the studentMap by specifying the student's ID as the key to be removed.
//Use the remove method to remove the entry.
//Verify that the entry has been successfully removed by attempting
// to retrieve the student's name by their ID and checking if it returns null.
public class E4 {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(2, "Anna");
        studentMap.put(5, "Veronica");
        studentMap.put(4, "Inna");
        studentMap.put(3, "Boris");
        studentMap.put(1, "Anton");

        studentMap.remove(4);

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
