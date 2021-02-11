package Lesson_14.Tests;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    public static void main(String[] args) {

        Path p1 = Paths.get("/Lesson_14/Tests/PathTest.java");
        System.out.format("getFileName: %s%n", p1.getFileName());
        System.out.format("getParent: %s%n", p1.getParent());
        System.out.format("getNameCount: %d%n", p1.getNameCount());
        System.out.format("getRoot: %s%n", p1.getRoot());
        System.out.format("isAbsolute: %b%n", p1.isAbsolute());
        System.out.format("toAbsolutePath: %s%n", p1.toAbsolutePath());
        System.out.format("toURI: %s%n", p1.toUri());

        System.out.println("==========================================================");

        Path p = Paths.get("/Lesson_14/Tests");
        System.out.format("Path %s exists: %b%n", p,
                Files.exists(p, LinkOption.NOFOLLOW_LINKS));
    }

}
