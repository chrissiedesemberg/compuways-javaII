package Lesson_12.Lesson12_1;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {
      
    LocalDate now = LocalDate.now();
    
    // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
    LocalDate abeBirthDate, abeDeathDate;
    abeBirthDate = LocalDate.of(1809, 2, 12);
    abeDeathDate = LocalDate.of(1855, 4, 15);
    
    int abeBirthYear = abeBirthDate.getYear();
    int AveDeathYear = abeDeathDate.getYear();
    
    long abeDaysLived = abeBirthDate.until(abeDeathDate, DAYS);
    
    //   How old when he died?
      System.out.println("Abe was " + (AveDeathYear-abeBirthYear) + " years old when he died.");
    //   How many days did he live? 
      System.out.println("Abe lived for " + abeDaysLived + " days.");

          System.out.println("\n************************************************\n");
    // Bennedict Cumberbatch, July 19, 1976
    LocalDate benBirthDate = LocalDate.of(1976, 2, 12);
    
    //   Born in a leap year?
        System.out.println("Bennedict was born in a leap year: " + benBirthDate.isLeapYear());
    
    //   How many days in the year he was born?
        System.out.println("Days in the year he was born: " + benBirthDate.lengthOfYear());
    //   How many decades old is he?
        System.out.println("Bennedict is " + benBirthDate.until(now, DECADES) + " decades old.");
    //   What was the day of the week on his 21st birthday?
        System.out.println("It was a " + benBirthDate.plusYears(21).getDayOfWeek() + " on his 21st birthday.");
    
      System.out.println("\n************************************************\n");
    // Train departs Boston at 1:45PM and arrives New York 7:25PM
    LocalTime depBoston = LocalTime.of(13, 45);
    LocalTime arrNY = LocalTime.of(19, 25);
    //   How many minutes long is the train ride?
      System.out.println("Planned Travel time: " + depBoston.until(arrNY, MINUTES));
    //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
      System.out.println("Delayed arrival time: " + arrNY.plusHours(1).plusMinutes(19));
          System.out.println("\n************************************************\n");
          
          
    // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
    LocalDateTime depFLBoston =  LocalDateTime.of(2020, MARCH, 24, 21, 15);
    LocalDateTime arrFLMiami =  depFLBoston.plusHours(4).plusMinutes(15);
      System.out.println("Miami arrival time: " + arrFLMiami);
    //   When does it arrive in Miami?
    System.out.println("The flight arrives in Miami: " + arrFLMiami);
    //   When does it arrive if the flight is delays 4 hours 27 minutes?
    System.out.println("The delayed arrival time is: " + arrFLMiami.plusHours(4).plusMinutes(27));
          System.out.println("\n************************************************\n");
   
          // School semester starts the second Tuesday of September of this year.
              //   Hint: Look at the TemporalAdjusters class
          LocalDate schoolSemStart = now.with(SEPTEMBER)
                  .with(TemporalAdjusters.dayOfWeekInMonth(2,TUESDAY));
    //   What is the date?
        System.out.println("School starts: " + schoolSemStart);
    //   School summer vacation starts June 25th
         LocalDate juneHolidayStart = LocalDate.of(2020, 6, 25);
         long juneHolidays = juneHolidayStart.until(schoolSemStart, DAYS);
         LocalDate lastDayOfYear = LocalDate.of(2020, 12, 31);
    //   Assuming:
    //     *  Two weeks off in December
         long decHolidays = 14;
    //     *  Two other vacation weeks
        long otherHolidays = 14;
    //     *  School is taught Monday - Friday
        long excludeDays = juneHolidays + decHolidays + otherHolidays;

        long daysLeft = ((schoolSemStart.until(lastDayOfYear, DAYS) - excludeDays) * 5);
    //   How many days of school are there?
        System.out.println("There are " + daysLeft + " days of school left for this year");
    //   Hint: keep track of the short weeks also
          System.out.println("\n************************************************\n");
          
    // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
    //   What is the time of the week's meetings?
        LocalTime mtTime = LocalTime.of(13, 30);
        LocalDate mtDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
        LocalDateTime meeting = LocalDateTime.of(mtDate, mtTime);
        System.out.println("The meeting is on/at: " + meeting + "\n");
    
  }
  
}
