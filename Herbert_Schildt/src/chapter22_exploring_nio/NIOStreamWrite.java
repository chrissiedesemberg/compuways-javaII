package chapter22_exploring_nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class NIOStreamWrite {
    public static void main(String[] args) {

        try ( OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Path.of("test.txt")))) {
            for (int i=0; i <26; i++) {
                fout.write((byte) ('A' + i));
            }
            } catch (InvalidPathException e) {
                System.out.println("Path Error " + e);
            } catch (IOException ioe) {
                System.out.println("I/O Error " + ioe);
            }
        }
    }
