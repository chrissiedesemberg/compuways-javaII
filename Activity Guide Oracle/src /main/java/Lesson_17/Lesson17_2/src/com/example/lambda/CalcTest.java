package Lesson_17.Lesson17_2.src.com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        /*
        Calculate the total sales for Radio Hut, PriceCo, and Best Deals.
a. Calculate the Radio Hut total using the parallelStream method. The pipeline should
contain the following methods: parallelStream, filter, mapToDouble, and sum.

b. Calculate the PriceCo total using the parallel method. The pipeline should contain
the following methods: filter, mapToDouble, parallel, and sum.

c. Calculate the Best Deals total using the sequential method. The pipeline should
contain the following methods: filter, mapToDouble, sequential, and sum.
         */

        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");

        double t1 = tList.parallelStream()
                .filter(e -> e.getBuyerName().equals("Radio Hut"))
                .mapToDouble(e -> e.getTransactionTotal())
                .sum(); // Radio Hut code here

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

        double t2 = tList.stream()
                .filter(e -> e.getBuyerName().equals("PriceCo"))
                .mapToDouble(e -> e.getTransactionTotal())
                .parallel()
                .sum(); //PriceCo Code Here
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        
        double t3 = tList.stream()
                .filter(e -> e.getBuyerName().equals("Best Deals"))
                .mapToDouble(e -> e.getTransactionTotal())
                .sequential()
                .sum(); // Best Deals Code here
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);                 
        
    }
}
