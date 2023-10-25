package scr.MorningSession.Class2510.JavaFile;

import java.io.FileWriter;
import java.io.IOException;

// Writing to a File
//Have your students create a Java program that writes a sentence of their choice to a file called "output.txt" using FileWriter.
//Encourage them to use FileWriter to write the sentence to the file
public class E2 {
    public static void main(String[] args) {
        String str = "It isn't funny to learn coding";

        try(FileWriter fileWriter = new FileWriter("MorningSession/Class2510/JavaFile/output.txt")){
            fileWriter.write(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("your text is added");
    }

}
