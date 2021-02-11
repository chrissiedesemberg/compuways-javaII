package Lesson_13.Lesson13_1.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        }
        catch (IOException ie) {
            System.out.println(ie.getMessage());
        }// try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) throws Exception {
        // Your code goes here

//        if (args.length < 1) {
//            System.out.println("File contains less than 1 argument");
//            System.exit(-1);
//        }

        String file = "src/main/java/Lesson_13/Lesson13_1/src/DeclarationOfIndependence.txt";

        FileScanInteractive fileScan = new FileScanInteractive();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String search = "";
            System.out.println("searching through file: " + file);
            while (true) {
                System.out.println("Enter search term or press q to exit: ");
                search = in.readLine().trim();
                if(search.equalsIgnoreCase("q")){
                    break;
                }
                int count = fileScan.countTokens(file, search);
                System.out.println("The term: " + search + " appears in the file " + file + " " + count + " times.");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
            System.exit(-1);
        }






        
        
//        Code the main method to check the number of arguments passed. The application expects
//at least one argument (a string representing the file to open). If the number of arguments is
//less than one, exit the application with an error code (-1).

//a. The main method is passed an array of Strings. Use the length attribute to determine
//whether the array contains less than one argument.

//b. Print a message if there is less than one argument, and use System.exit to return
//an error code. (-1 typically is used to indicate an error.)

//4. Save the first argument passed into the application as a String.

//5. Create an instance of the FileScanInteractive class. You will need this instance to
//call the countTokens method.
        
        
        
    }
}