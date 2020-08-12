package WiproTalentNext;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
        Employee employee = new Employee(100, "Avish", "chandigarh", "99999999999");
        final String filename = "serial.txt";

        serialize(filename, employee);
        System.out.println(deserialize(filename));
    }
    private static void serialize(String filename, Employee employee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //serialize
            objectOutputStream.writeObject(employee);
            System.out.println("Object serialized");

            fileOutputStream.close();
            objectOutputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Employee deserialize(String filename) {
        Employee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //deserialize
            employee = (Employee) objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }
}

class Employee implements Serializable {
    int id;
    String name;
    String address;
    String number;

    public Employee(int id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
