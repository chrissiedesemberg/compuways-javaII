package Lesson_14.Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileList {

    public static void main(String[] args) {

        try(Stream<Path> files = Files.list(Paths.get("."))){
            files.forEach(line -> System.out.println(line));
        } catch (IOException e){
            System.out.println("Message: " + e.getMessage());
        }
    }





}
