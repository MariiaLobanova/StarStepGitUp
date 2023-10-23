package Claas4.MorningSession.Class2310;

// Exercise 2: Reading User Input until 'Exit'
//Create a program where users can keep entering strings
// into the console. The program should terminate when the user types 'Exit'.

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Write some text. wenn you would like to stop, write: exit");
        ArrayList<String> textLines = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){
                System.out.println("Good! terminating the program");
                break;
            }
           // System.out.println("Your text: " + input);
            textLines.add(input);
        }
        System.out.println("Your text: " );
        for (String line:textLines){
            System.out.println(line);
        }
        scanner.close();
        writeUserInputsToFile(textLines);

    }
    public  static void writeUserInputsToFile(ArrayList<String> textLines){
        try(FileWriter writer = new FileWriter("MorningSession/Class2310/destFile.txt")){
            for( String input: textLines){
                writer.write(input + System.lineSeparator());
            }
            System.out.println("Entered strings have been saved to 'userInputs.txt'.");
        } catch (IOException e) {
            System.out.println("An error!");;
        }
    }

}
