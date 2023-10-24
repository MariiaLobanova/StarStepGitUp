package Claas4.MorningSession.Class2310;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Exercise 4: Copying a File
//Instruct your students to create a Java program that copies the content of one file (e.g., "source.txt")
// to another file (e.g., "destination.txt").
//They should use FileInputStream and FileOutputStream for binary file copying.
public class Exercise4 {
    public static void main(String[] args) {
        String sourceFile = "MorningSession/Class2310/output.txt";
        String destinationFile = "MorningSession/Class2310/destFile.txt";
        try{
            FileInputStream inputStream= new FileInputStream(sourceFile);
            FileOutputStream outputStream= new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int b;

            while((b = inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,b);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied");
        } catch(IOException e){
            System.out.println("Error "+ e.getMessage());
        }
    }


}
