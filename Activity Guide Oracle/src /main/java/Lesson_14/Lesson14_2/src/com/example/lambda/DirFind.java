package Lesson_14.Lesson14_2.src.com.example.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirFind {
    
    public static void main(String[] args) {
        

        try(Stream<Path> dir = Files.walk(Paths.get("."))) {

            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
            dir.forEach(line -> System.out.println(line));
                
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    } 
}
