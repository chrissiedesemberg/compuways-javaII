package Lesson_14.Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllNio {
        public static void main(String[] args) {
            Path file = Paths.get("tempest.txt");
            List<String> fileArr;
            try{
                fileArr = Files.readAllLines(file);
                fileArr.stream()
                        .filter(line -> line.contains("PROSPERO"))
                        .forEach(line -> System.out.println(line));
            } catch (IOException e){
                System.out.println("Message: " + e.getMessage());
            }
        }
}
