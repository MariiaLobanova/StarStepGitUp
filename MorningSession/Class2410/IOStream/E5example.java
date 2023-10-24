package scr.MorningSession.Class2410.IOStream;

import java.io.FileInputStream;
import java.io.IOException;


// Exercise 5: Implement a program that reads a CSV file named "data.csv"
// using FileInputStream. Parse the CSV data and display it as a table in the console.
public class E5example {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("MorningSession/Class2410/IOStream/csvfile.csv"))
        { int x;
            byte[] buffer = new byte[1024];
            while ((x=fileInputStream.read(buffer))!=-1){
                for (int i = 0; i < x; i++) {
                    System.out.println(buffer[i]);
                }
                }
            } catch (IOException e) {
            System.out.print(e.getMessage()); // made this code how I already made E3; but for our case it is not right
        }

    }
}
