package scr.MorningSession.Class2710.Deserialization;

import java.io.*;

// Exercise 2:
//Learn how to deserialize an array of objects from a file.
//Create a class called Student with fields for id (int) and grade (double).
//Serialize an array of Student objects to a file.
//Deserialize the array from the file and print each student's id and grade.
public class E2 {
    public static void main(String[] args) {
        Student student1 = new Student("Anna",1, 95.5);
        Student student2 = new Student("Boris", 2, 88.0);

        System.out.println("Before serialization" );
        System.out.println(student1);
        System.out.println(student2);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.out"))){

            oos.writeObject(student1);
            oos.writeObject(student2);

        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage());
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("student.out");   // Deserialization
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Student deserialStudent1 = (Student) ois.readObject();
            Student deserialStudent2 = (Student) ois.readObject();

            System.out.println("Deserialized Person: " + deserialStudent1);
            System.out.println("Deserialized Person: " + deserialStudent2);

        } catch (FileNotFoundException e) {
            System.out.println("File in not found" + e.getMessage());
        } catch (InvalidClassException e) {
            System.out.println("File is invalid" + e.getMessage());
        } catch (IOException e) {
            System.out.println( e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student implements Serializable {
    transient private String name;
    private int id;
    private double grade;


    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id=" + id + ", grade=" + grade + '}';
    }
}

