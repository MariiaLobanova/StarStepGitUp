package scr.MorningSession.Class2510.JavaFile;

import java.io.*;

// Exercise 5: Reading and Writing Numbers
//Have your students create a program that reads a series of integers from an "input_numbers.txt" file using FileReader.
//Then, ask them to calculate the sum of these numbers and write the result to an "output_sum.txt" file using FileWriter.
public class E5 {
    public static void main(String[] args) {
        int sum=0;
        try(BufferedReader bufferedReader= new BufferedReader(new FileReader("MorningSession/Class2510/JavaFile/input_numbers.txt"))){
            String line;
            while ((line= bufferedReader.readLine())!= null){
                int number = Integer.parseInt(line);
                sum= sum + number;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fileWriter = new FileWriter("MorningSession/Class2510/JavaFile/output.txt")){
            fileWriter.write("the summ is "+ sum);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



