package Claas4.MorningSession.Class2310;

//Exercise 1: Reading from the Console
//Ask your students to create a Java program that reads a line of text from the console using the Scanner class.
//Instruct them to display the entered text on the console.
//Exercise 2: Writing to the Console
//Have your students create a Java program that prompts the user for their name and
// then displays a greeting message on the console.
//They should use the System.out.println() method to print the message.

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name?");

        String input = scanner.nextLine();
        System.out.println("Hello, " + input +"!" +
                "");


    }
}
