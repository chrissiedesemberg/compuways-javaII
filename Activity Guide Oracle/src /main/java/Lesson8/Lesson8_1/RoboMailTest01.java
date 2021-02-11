package Lesson8.Lesson8_1;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Reuse lambda expressions
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    Predicate<Employee> salesExecutives = 
      p -> p.getRole().equals(Role.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<Employee> salesEmployeesOver50 = 
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs ===");
//    robo.mail(pl, salesExecutives); // Convert to stream and forEach
    pl.stream().filter(p -> p.getRole() == Role.EXECUTIVE && p.getDept() == "Sales").forEach(p -> robo.roboMail(p));
//    robo.text(pl, salesExecutives); // Convert to stream and forEach
    pl.stream().filter(p -> p.getRole() == Role.EXECUTIVE && p.getDept() == "Sales").forEach(p -> robo.roboText(p));
    
    System.out.println("\n=== All Sales ===");
//    robo.mail(pl, salesEmployeesOver50); // Convert to stream and forEach
      pl.stream().filter(p -> p.getAge() >= 50 &&  p.getDept() == "Sales").forEach(p -> robo.roboMail(p));
//    robo.text(pl, salesEmployeesOver50); // Convert to stream and forEach   
      pl.stream().filter(p -> p.getAge() >= 50 &&  p.getDept() == "Sales").forEach(p -> robo.roboText(p));
  }
}

