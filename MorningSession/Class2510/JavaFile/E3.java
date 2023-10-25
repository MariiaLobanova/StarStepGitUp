package scr.MorningSession.Class2510.JavaFile;

// Exercise 3: Copying a File
//Challenge your students to create a Java program that reads content from one file (e.g., "source.txt")
// using FileReader and writes it to another file (e.g., "destination.txt") using FileWriter.
//Make sure they handle any potential exceptions that may occur during file operations.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E3 {
    public static void main(String[] args) {
        try(FileReader fileRieder = new FileReader("MorningSession/Class2510/JavaFile/input.txt")){
            int ch;
            try(FileWriter fileWriter = new FileWriter("MorningSession/Class2510/JavaFile/destination.txt")) {
                while ((ch = fileRieder.read()) != -1) {
                    char x = (char) ch;
                    System.out.print(x);
                    fileWriter.write(x);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
