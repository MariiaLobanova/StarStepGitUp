package scr.MorningSession.Class2610Serialization;

import java.io.*;

// Exercise 3: Implement a Vehicle class that has attributes make, model, and year.
// Instead of the usual Serializable interface, this time use the Externalizable interface.
// Implement the necessary methods (writeExternal and readExternal) to manage the serialization process.
// Serialize a Vehicle instance,
// then deserialize it, ensuring the data is correctly recovered.
public class E3 {
    public static void main(String[] args) throws IOException {

        Vehicle vehicle1= new Vehicle("BMW", "X3", 2021);
        Vehicle vehicle2= new Vehicle("VW", "Golf", 2017);
        System.out.println("Before "+ vehicle1);
        System.out.println( vehicle2);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("vehicle.out");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(vehicle1);
            oos.writeObject(vehicle2);

            oos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
           throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("vehicle.out");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Vehicle deserialVehicle1 = (Vehicle) ois.readObject();
            Vehicle deserialVehicle2 = (Vehicle) ois.readObject();

            System.out.println("Deserialized Vehicle 1: " + deserialVehicle1);
            System.out.println("Deserialized Vehicle 2: " + deserialVehicle2);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
class Vehicle implements Externalizable {
    private String make;
    private String model;
    private int year;

    public Vehicle() {
        // When you implement the Externalizable interface in a class, it requires that the class provides a default no-argument constructor
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(make);
        out.writeUTF(model);
        out.writeInt(year);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        make = in.readUTF();
        model = in.readUTF();
        year = in.readInt();

    }
}
