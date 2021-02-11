package Lesson9.Lesson9_4;

import java.time.LocalDate;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    //Write your BiPredicate here
    BiPredicate<Employee, String> eBiPred = (e, s) -> e.getState().equals(s); 
      
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (true){// Use BiPredicate for test
          eBiPred.test(first, searchState);
        e.printSummary();
      }
    }
  }
}
