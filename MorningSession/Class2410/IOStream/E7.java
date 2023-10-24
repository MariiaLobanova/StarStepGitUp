package scr.MorningSession.Class2410.IOStream;

import java.io.*;

//Exercise 7: Create a Java program that reads a large text file (e.g., "large_data.txt")
// in chunks using a buffer. Display the contents of the file in chunks, and specify the buffer size.
public class E7 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("MorningSession/Class2410/IOStream/sampletext.txt");
            BufferedInputStream bufferedReader = new BufferedInputStream(fileInputStream);) {
       byte[] buffer = new byte[1024];
       int x;
       long startTime = System.currentTimeMillis();

       while ((x= fileInputStream.read(buffer))!=-1){
           System.out.println(new String(buffer,0, x));
       }

       System.out.println("***********");
       long endTime = System.currentTimeMillis();

       System.out.println("Time for a reading:  " + (endTime - startTime));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
