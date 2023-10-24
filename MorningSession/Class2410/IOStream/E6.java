package scr.MorningSession.Class2410.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//Exercise 6: Modify the program from Exercise 5 to handle exceptions.
// Implement error handling to catch and display any IOException that may occur while reading the file.
public class E6 {
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
        } catch (FileNotFoundException a) {
            System.out.println("File is not exist" + a.getMessage());
        } catch (IOException v){
            System.out.println("Error" + v.getMessage());
        }
    }


}



