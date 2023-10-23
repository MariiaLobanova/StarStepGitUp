package Claas4.MorningSession.Class2310;
// Exercise 5: Reading and Writing CSV Files
//Have your students create a program that reads data from a CSV file
// (comma-separated values) called "data.csv" and prints it to the console.
//Encourage them to use BufferedReader to read the file line by line.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        String csvFile = "MorningSession/Class2310/data.csv";

        try (BufferedReader reader= new BufferedReader(new FileReader(csvFile))) {
                String line;
                while ((line=reader.readLine())!= null){
                    String[] data = line.split(",");

                    for(String value: data){
                        System.out.print(value);
                    }
                    System.out.println();
            }

            }catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());

        }
    }

}
