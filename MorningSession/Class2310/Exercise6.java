package Claas4.MorningSession.Class2310;
// Exercise 6: Error Handling
//Introduce error handling by asking your students to modify their programs to handle
// exceptions that may occur during I/O operations.
//Encourage them to use try-catch blocks to gracefully handle these exceptions.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args) {
        String csvFile = "data.csv";

        try (BufferedReader reader= new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line=reader.readLine())!= null){
                try {
                    String[] data = line.split(",");

                    for (String value : data) {
                        System.out.println(value + "\t");
                    }
                    System.out.println();
                } catch (Exception e){
                    System.out.println("Error occurred while processing a line: " + e.getMessage());
                }
            }

        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        }
    }



}
