package Lesson_14.Tests;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

    public static void main(String[] args)  {

        try (BufferedReader bReader = new BufferedReader(new FileReader("tempest.txt"))) {
            bReader.lines().forEach(line -> System.out.println("Line: " + line));
        } catch (IOException ioe) {
            System.out.println("Message: " + ioe.getMessage());
        }
    }}