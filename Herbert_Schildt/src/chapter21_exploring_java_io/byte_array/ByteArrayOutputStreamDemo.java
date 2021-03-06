package chapter21_exploring_java_io.byte_array;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {

        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte buf[] = s.getBytes();

        System.out.println();
        System.out.println();
        try{
            f.write(buf);
        } catch( IOException ioe) {
            System.out.println("Error writing Buffer");
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        byte b[] = f.toByteArray();
        for (int i=0; i < b.length; i++) System.out.print((char) b[i]);
            System.out.print("\n To an OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch ( IOException ioe) {
            System.out.println("I/O Error: " + ioe);
            return;
        }
        System.out.println("Doing a reset");
        f.reset();

        for (int i=0; i<3; i++) f.write('X');
        System.out.print(f.toString());


    }

}
