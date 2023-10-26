package scr.MorningSession.Class2510.JavaFile;

//При запуске приложения прочитайте файл "output.txt" (если он существует) и покажите его содержимое пользователю.
//Постоянно предлагать пользователю ввести текст.
//Проверка слова на уникальность по сравнению с ранее введенными словами и содержимым существующего файла.
//Если пользователь набирает "Export", то новые уникальные слова добавляются в файл "output.txt".
//При повторном запуске приложения повторите описанные выше действия.

import java.io.*;
import java.util.Scanner;

public class E1ADD {
    public static void main(String[] args) {
        try (FileReader fileReader= new FileReader("MorningSession/Class2510/JavaFile/input.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line= bufferedReader.readLine())!= null){
            System.out.println(line);
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add something else");
        String str= scanner.nextLine();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("MorningSession/Class2510/JavaFile/input.txt", true))) {
            bufferedWriter.append(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
