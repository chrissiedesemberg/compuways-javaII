package Lesson8.Lesson8_4;

import java.util.List;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    // Mail mail, Eng employees < 65
    pl.stream().filter(p -> p.getAge() < 65).filter(p -> p.getGender() == Gender.MALE).filter(p -> p.getDept() == "Eng").forEach(p -> robo.roboMail(p));
  }
}
