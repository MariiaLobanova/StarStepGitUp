package scr.MorningSession.Class3010Map;

import java.util.HashMap;
import java.util.Map;

// .Using HashMap for Counting:
//Create a HashMap named wordCountMap to count the frequency of words in a given text.
//Split a sample text into words by using a space as the delimiter and store the words in an array.
//Iterate through the array of words and update the counts in wordCountMap. Use the put method to add new words to the map or update the count if the word already exists.
//Print the word frequencies stored in the map to verify that each word's count has been correctly calculated.
public class E5 {
    public static void main(String[] args) {
        String text ="Create a HashMap named wordCountMap to count the frequency of words in a given text " +
                "split a sample text into words by using a space as the delimiter and store the words in an array.";

        Map<String,Integer> wordCountMap = new HashMap<>();

        String[] words = text.split(" ");

        for(String word: words){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
}
