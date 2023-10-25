package scr.MorningSession.Class2510.JavaFile;
// Introduce error handling by asking your students to modify their programs to handle exceptions that may occur during file operations (e.g., FileNotFoundException, IOException).
//Encourage them to use try-catch blocks to gracefully handle these exceptions.
import java.io.*;

public class E6 {
    public static void main(String[] args) {
        int sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("MorningSession/Class2510/JavaFile/input_numbers.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum = sum + number;
            }
        } catch (FileNotFoundException e) {
            System.out.println("You don't have the file" +e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileWriter fileWriter = new FileWriter("MorningSession/Class2510/JavaFile/output.txt")) {
            fileWriter.write("the sum is " + sum); // Added a space after "the sum"
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
