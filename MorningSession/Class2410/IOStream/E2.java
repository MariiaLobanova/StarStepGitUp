package scr.MorningSession.Class2410.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Exercise 2: Enhance the program from Exercise 1 to handle exceptions gracefully.
// Implement error handling to catch and display any FileNotFoundException that
// may occur when attempting to read the file.
public class E2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("MorningSession/Class2410/IOStream/input.text")) {
            int x = 0;
            while ((x = fileInputStream.read()) != -1) {
                System.out.print((char)x);
            }
            fileInputStream.close();
        }
        catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

