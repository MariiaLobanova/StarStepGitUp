package scr.MorningSession.Class3010Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// 3.LinkedHashMap with Insertion Order:
//Create a LinkedHashMap named capitalMap to store country-capital pairs.
//Add entries for at least three countries and their respective capitals to the map.
//Ensure that you add the entries in a specific order.
//Demonstrate that the LinkedHashMap maintains insertion order by iterating through it and printing the country-capital pairs.
public class E3 {
    public static void main(String[] args) {

        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Germany", "Berlin");
        capitalMap.put("Russia", "Moskaw");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("France", "Paris");
        capitalMap.put("Spain", "Madrid");
        capitalMap.put("Japan", "Tokyo");

        for(Map.Entry<String, String> entry: capitalMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }

}
