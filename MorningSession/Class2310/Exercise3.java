package Claas4.MorningSession.Class2310;

//Exercise 3: Reading and Writing to Files
//Challenge your students to create a program that reads a text file called "input.txt" and writes
// its content to a new file called "output.txt."
//They should use FileReader and FileWriter to accomplish this task.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        String input = "MorningSession/Class2310/input.txt";
        String output = "MorningSession/Class2310/output.txt";
        int symb;

        try {
            FileReader reader= new FileReader(input);
            FileWriter writer= new FileWriter(output);

            while ((symb= reader.read())!=-1){
                writer.write(symb);
            }
            reader.close();
            writer.close();
            System.out.println("File copied succesfully");
        } catch (IOException e) {
            System.out.println("Error  " + e.getMessage());
        }


    }

}
