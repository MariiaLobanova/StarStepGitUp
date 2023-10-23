package Claas4.MorningSession.Class2310;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exercise 1: Counting Words in a File
//Create a Java program that reads a text file and counts the number of words in it.
public class E1 {

    public static void main(String[] args) {
        String fileName ="MorningSession/Class2310/input.txt";
        try{
            int wordcount= countWords(fileName);
            System.out.println("The number of words:  " +wordcount);
        } catch (FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }

    }
    public static int countWords(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner= new Scanner(file);
        int wordcount = 0;

        while (scanner.hasNext()){
            scanner.next();
            wordcount++;
        }
        scanner.close();
        return  wordcount;
    }


}
