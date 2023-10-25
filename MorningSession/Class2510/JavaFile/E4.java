package scr.MorningSession.Class2510.JavaFile;

// Exercise 4: Appending to a File
//Instruct your students to modify the previous program to append additional text to the "destination.txt" file instead of overwriting its content.
//They should use FileWriter in append mode to achieve this.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class E4 {
    public static void main(String[] args) {
        try (FileReader fileRieder = new FileReader("MorningSession/Class2510/JavaFile/input.txt")) {
            int ch;
            try (FileWriter fileWriter = new FileWriter("MorningSession/Class2510/JavaFile/destination.txt")) {
String data = " Exercise 4: Appending to a File";

                while ((ch = fileRieder.read()) != -1) {
                    char x = (char) ch;
                    System.out.print(x);
                }
                fileWriter.append(data);
            }
            System.out.println( "for adding text we used fileWriter.append");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
