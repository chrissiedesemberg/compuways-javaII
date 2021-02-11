package Lesson_12.Lesson12_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.*;
import java.util.Date;
import java.time.format.*;

public class TimeBetween {

  public static void main(String[] args) {
    // Create a formatter to accept date entries using the USA common standard,
    // month day, year = for example, April 8, 1970
    LocalDate theDate = null;

    boolean validStr = false;
    
    // Create a formatter
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!validStr) {
      System.out.print("Enter a date: " + "(" + formatter + ")");
      try {
        String sdateEntered = br.readLine();
        // Use the parse method with the formatter to create a date
        theDate = LocalDate.parse(sdateEntered, formatter);
       
        validStr = true;
      } catch (IOException | DateTimeParseException  ex) {
        validStr = false;
      }
    }
   
    // Print the date out
    System.out.println("Date entered was: " + theDate);
    LocalDate now = LocalDate.now();
    
    // Calculate the years, months and days between now and the date entered
        Period between;
        if (theDate.isBefore(now)) {
            between = Period.between(theDate, now);
        }
        else {
            between = Period.between(now, theDate);
        }
    // Print out the 
    int years = between.getYears();
    int months = between.getMonths();
    int days = between.getDays();
    System.out.println("There are " + years + " years, " 
            + months + " months, " 
            + days + " days between now and the date entered.");
  }
}