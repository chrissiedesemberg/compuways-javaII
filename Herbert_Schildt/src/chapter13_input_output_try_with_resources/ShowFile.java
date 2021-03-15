package chapter13_input_output_try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException fnf) {
            System.out.println("Cannot open file (" + fnf.getMessage() + ")");
        }

        try {
            do{
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException ioe) {
            System.out.println("Error Reading File");
        }

        try {
            fin.close();
        } catch (IOException ioe) {
            System.out.println("Error closing file");
        }
    }
}
