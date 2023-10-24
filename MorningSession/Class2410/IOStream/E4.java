package scr.MorningSession.Class2410.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Extend the program from Exercise 3 to create a new binary file named "copy_image.jpg"
// using FileOutputStream and write the content of "image.jpg" to the new file.
// Ensure that the new file is a copy of the original.
public class E4 {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream("MorningSession/Class2410/IOStream/file_example_JPG_100kB.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("MorningSession/Class2410/IOStream/copy.jpg")) {

            int x;
            byte[] buffer = new byte[1024];

            while ((x=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);{
                }
            }

            System.out.println("File copied succesfully!");

            } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
