package scr.MorningSession.Class2510.JavaFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//  Reading from a File
//Ask your students to create a Java program that reads text from a file called "input.txt" using FileReader.
//Instruct them to display the content of the file on the console.
public class E1 {
    public static void main(String[] args) {
        try(FileReader fileRieder = new FileReader("MorningSession/Class2510/JavaFile/input.txt")){
            int ch;

            while ((ch = fileRieder.read())!=-1){
                char x = (char) ch;
                System.out.print(x);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
