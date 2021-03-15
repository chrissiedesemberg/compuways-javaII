package chapter21_exploring_java_io.byte_array;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

    public static void main(String[] args) {

        String tmp = "abcdefghijklmopqrstuvwxyz";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);


    }

}
