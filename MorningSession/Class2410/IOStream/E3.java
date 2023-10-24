package scr.MorningSession.Class2410.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

// Create a Java program that reads a binary file named "image.jpg"
// using FileInputStream and displays its content to the console.
// This exercise demonstrates reading binary data.
public class E3 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("MorningSession/Class2410/IOStream/file_example_JPG_100kB.jpg"))
        { int x;
            byte[] buffer = new byte[1024];
            while ((x=fileInputStream.read(buffer))!=-1){
                for (int i = 0; i < x; i++) {
                    System.out.print(x + " ");
                }
                }
            } catch (IOException e) {
            System.out.print(e.getMessage());
        }

    }
}
