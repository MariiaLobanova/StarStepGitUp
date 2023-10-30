package scr.MorningSession.Class3010Map;

import java.util.HashMap;
import java.util.Map;

// 1. Basic HashMap:
//Create a HashMap named studentMap to store student information as key-value pairs.
//Define the key as the student ID (integer) and the value as the student's name (string).
//Add at least three students with their IDs and names to the map.
//Retrieve and print the name of a specific student by providing their ID using the get method.
//Confirm that the retrieval works as expected.
public class E1 {
    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(2, "Anna");
        studentMap.put(5, "Veronica");
        studentMap.put(4, "Inna");
        studentMap.put(3, "Boris");
        studentMap.put(1, "Anton");


        System.out.println(studentMap.get(3));

    }
}

