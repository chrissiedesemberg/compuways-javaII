package Lesson_12.Lesson12_2;

import java.time.*;
import static java.time.Month.*;
import java.text.SimpleDateFormat;

public class DepartArrive {

  public static void main(String[] args) {
    // Using the following information:
    //   * Use America/New_York as the time zone for Boston Logan Airport(BOS).
          ZoneId BOS = ZoneId.of("America/New_York");
    //   * Use America/Los_Angeles as the time zone for San Francisco Airport (SFO).
          ZoneId SFO = ZoneId.of("America/Los_Angeles");
    //   * Use Asia/Calcutta as the time zone for Bangalore's Bengaluru International Airport (BLR)
          ZoneId BLR = ZoneId.of("Asia/Calcutta");

    // Flight 123, San Francisco to  Boston, leaves SFO at 10:30 PM June 13, 2014
          LocalDate flightDate1 = LocalDate.of(2014, JUNE, 13);
          LocalTime flightTime1 = LocalTime.of(10, 30); 
          ZonedDateTime flightDetailsSFO = ZonedDateTime.of(flightDate1, flightTime1, SFO);
          flightDetailsSFO.toOffsetDateTime();
          
    // The flight is 5 hours 30 minutes
          LocalTime fl123Duration = LocalTime.of(5, 30);
          
    //   What is the local time in Boston when the flight takes off?
         OffsetDateTime flightOffset = flightDetailsSFO.toOffsetDateTime();
         ZonedDateTime DepartureLocalTimeBOS = flightOffset.atZoneSameInstant(BOS);
        System.out.println("Local time BOS at departure: " + DepartureLocalTimeBOS);
        
    //   What is the local time at Boston Logan airport when the flight arrives?
        ZonedDateTime ArrivalLocalTimeBOS = DepartureLocalTimeBOS.plusHours(5).plusMinutes(30);
        System.out.println("Flight 123 arrives BOS: " + ArrivalLocalTimeBOS);
        
    //   What is the local time in San Francisco when the flight arrives?
        OffsetDateTime flightOffset2 = ArrivalLocalTimeBOS.toOffsetDateTime();
         ZonedDateTime ArrivalLocalTimeSFO = flightOffset2.atZoneSameInstant(SFO);
        System.out.println("Local time SFO at arrival: " + ArrivalLocalTimeSFO);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
    // Flight 456, San Francisco to Bangalore, India, leaves SFO at Saturday, 10:30 PM June 28, 2014
        LocalDate flightDate2 = LocalDate.of(2014, JUNE, 28);
          LocalTime flightTime2 = LocalTime.of(22, 30); 
          ZonedDateTime fl456SFO = ZonedDateTime.of(flightDate2, flightTime2, SFO);
          fl456SFO.toOffsetDateTime();
    // The flight time is 22 hours
    
    //   Will the traveler make a meeting in Bangalore Monday at 9 AM local time?
         OffsetDateTime flightOffset3 = fl456SFO.toOffsetDateTime();
         ZonedDateTime  departureTimeInBLR = flightOffset3.atZoneSameInstant(BLR);
         ZonedDateTime arrivalTimeInBLR = departureTimeInBLR.plusHours(22);
        System.out.println("Flight 456 arrives BLR: " + arrivalTimeInBLR + "\nTraveller would arrive at 09h00, she would be in the country at 09h00 but late for her meeting.");
    //   Can the traveler call her husband at a reasonable time when she arrives?
        OffsetDateTime flightOffset4 = arrivalTimeInBLR.toOffsetDateTime();
        ZonedDateTime arrivalTimeInSFO = flightOffset4.atZoneSameInstant(SFO);
        System.out.println("Local time SFO at arrival: " + arrivalTimeInSFO + "\nThe traveler can still call her husband.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
    // Flight 123, San Francisco to Boston, leaves SFO at 10:30 PM Saturday, November 1st, 2014
        LocalDateTime Localflight123DepartureSFO = LocalDateTime.of(2014, NOVEMBER, 1, 22, 30);
         //Departure time in SFO when flight leaves San Fran
        ZonedDateTime zoned123DepSFO = ZonedDateTime.of(Localflight123DepartureSFO, SFO);
        zoned123DepSFO.toOffsetDateTime();
        OffsetDateTime flightOffset5 = zoned123DepSFO.toOffsetDateTime();
            //Departure time in Boston when flight leaves San Fran
        ZonedDateTime zoned123DepBOS = flightOffset5.atZoneSameInstant(BOS);
        ZonedDateTime arrivalTimeBOS = zoned123DepBOS.plusHours(5).plusMinutes(30);
    // Flight time is 5 hours 30 minutes.
    //   What day and time does the flight arrive in Boston?
        System.out.println("The flight arrives on the following day in Boston: " + arrivalTimeBOS);
    //   What happened?
        System.out.println("The flight arrived 8 hours later due to DST");

  }

}
