package chapter21_exploring_java_io.file_input_output;


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {


    public static void main(String[] args)  {
        int size;

        System.out.println();
        try (FileInputStream f = new FileInputStream("src/chapter21_exploring_java_io/file_input_output/FileInputStreamDemo.java")) {
            System.out.println("Total average Bytes: " + (size = f.available()));

            System.out.println();
            int n = size / 40;
            System.out.println("First " + n + " bytes of the file on read() at a time");
            for (int i=0; i < n; i++){
                System.out.print((char) f.read());
            }
            System.out.println();
            System.out.println("\n Still available: " + f.available());
            System.out.println("Reading the next " + n + " with one read(b[])");
            byte b[] = new byte[n];
            if(f.read(b) != n) {
                System.err.println("couldnt read " + n + " bytes.");
            }

            System.out.println();
            System.out.println(new String(b, 0, n));
            System.out.println("\n Still available: " + (size = f.available()));
            System.out.println("\n Skipping half of remaining bytes with skip()");
            f.skip(size/2);
            System.out.println("Still Available: " + f.available());

            System.out.println();
            System.out.println(new String(b, 0, b.length));
            System.out.println("\n Still available: " + f.available());
        } catch (IOException ie) {
            System.out.println("I/O Error: " + ie);
        }


    }
    }
