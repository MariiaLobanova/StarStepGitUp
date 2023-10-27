package scr.MorningSession.Class2710.Deserialization;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Exercise 1:
//Learn how to deserialize a simple Java object from a file.
//Create a class called Person with fields for name (String) and age (int).
//Serialize an instance of the Person class to a file.
//Deserialize the object from the file and print the name and age.
// Exercise 3:
//Learn how to handle exceptions during deserialization.
//Modify the code from Exercise 1 to introduce a wrong file path intentionally.
//Handle the FileNotFoundException and IOException appropriately.
//Hints:   Use try-catch blocks to handle exceptions.
//Exercise 4:
//Add a transient field named salary to the Person class from Exercise 1.
//Serialize and then deserialize an object of the Person class.
//Print the value of the salary field after deserialization.
//Hints: Observe how the transient field is affected by serialization and deserialization.

public class E1 {
    public static void main(String[] args) {
        Person person1 = new Person("Anna",27,1500.00);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.out"))){

            oos.writeObject(person1);

        } catch (FileNotFoundException e) {
            System.out.println( "File is not found! " + e.getMessage());
        } catch (IOException e) {
            System.out.println( "IO Exception: " + e.getMessage());
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("person.out");   // Deserialization
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Person deserialPerson = (Person) ois.readObject();

            System.out.println("Deserialized Person: " + deserialPerson);
            System.out.println("Salary after deserialization" + deserialPerson.getSalary()); // =0.0 because of transient field



        } catch (FileNotFoundException e) {
            System.out.println("File in not found" + e.getMessage());
        } catch (InvalidClassException e) {
            System.out.println("File is invalid" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println( "Invalid Class Exception: " + e.getMessage());
        }

    }
}
class Person implements Serializable {
    String name;
    int age;
    transient double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Person{" + "salary=" + salary + '}';
    }
}


