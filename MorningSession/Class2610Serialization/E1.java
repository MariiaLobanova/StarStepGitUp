package scr.MorningSession.Class2610Serialization;

import java.io.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Exercise 1: Write a Java class named Person with attributes name, age,
// and address. Implement the Serializable interface. Design methods to serialize a Person object
// to a file named person.ser and to deserialize it back.
// Create a Person instance, serialize it, and then deserialize to ensure the data is accurately restored.
public class E1 {

    public static void main(String[] args) {
        Person person1 = new Person("Anton", 2, "Georg-Hermann-Allee,36");
        Person person2 = new Person("Anna", 23, "Brandenburgerstr 1");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.out"); //serialization
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage());
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("person.out");   // Deserialization
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Person deserialPerson1 = (Person) ois.readObject();
            Person deserialPerson2 = (Person) ois.readObject();

            System.out.println("Deserialized Person 1: " + deserialPerson1);
            System.out.println("Deserialized Person 2: " + deserialPerson2);


        } catch (FileNotFoundException e) {
            System.out.println("File in not found" + e.getMessage());
        } catch (InvalidClassException e) {
            System.out.println("File is invalid" + e.getMessage());
        } catch (IOException e) {
            System.out.println( e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println( e.getMessage());
        }

    }
}
 class Person implements Serializable {
     String name;
     int age;
     String address;
     transient LocalDateTime currentDateTime;

     public Person(String name, int age, String address) {
         this.name = name;
         this.age = age;
         this.address = address;
         this.currentDateTime = LocalDateTime.now();
     }

     @Override
     public String toString() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         if (currentDateTime != null) {
             String formattedDateTime = currentDateTime.format(formatter);
             return name + ":" + age + " years old : " + "live in " + address + " Current DateTime: " + formattedDateTime;
         } else {
             return name + ":" + age + " years old : " + "live in " + address + " Current DateTime: N/A"; // for seeing result of deseriliazation if we have "trancient

         }
     }
 }