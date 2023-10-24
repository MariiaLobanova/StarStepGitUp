package scr.MorningSession.Class2410.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Exercise 1: Write a Java program that reads a text file named "input.txt" using
// FileInputStream and displays its contents to the console.
public class E1 {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("MorningSession/Class2410/IOStream/input.text")) {
            int x = 0;
            while ((x = fileInputStream.read()) != -1) {
                System.out.print((char)x);
            }
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
