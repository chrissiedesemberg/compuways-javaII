package chapter21_exploring_java_io.serialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {

        try ( ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serialization: " + e);
        }

        try( ObjectInputStream objIstrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIstrm.readObject();
            System.out.println("object 2: " + object2);
        } catch (Exception e) {
            System.out.println("Exception during serialization: " + e);
        }
    }
}
