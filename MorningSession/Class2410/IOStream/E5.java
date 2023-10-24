package scr.MorningSession.Class2410.IOStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;

// Exercise 5: Implement a program that reads a CSV file named "data.csv"
// using FileInputStream. Parse the CSV data and display it as a table in the console.
public class E5 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("MorningSession/Class2410/IOStream/csvfile.csv")) {
            byte[] buffer = new byte[1024];
            int x;
            StringBuilder currentLine = new StringBuilder();

            while ((x = fileInputStream.read(buffer)) != -1) {
                for (int i = 0; i < x; i++) {
                    char c = (char) buffer[i];
                   if (c == '\n' || c == '\r') {
                        // Newline character found, print the current line
                        System.out.println(currentLine);
                        currentLine.setLength(0); // Clear the line buffer
                    } else {
                        currentLine.append(c);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}



