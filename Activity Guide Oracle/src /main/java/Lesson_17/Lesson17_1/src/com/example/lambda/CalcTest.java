package Lesson_17.Lesson17_1.src.com.example.lambda;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        
        // Put code here

        Stream<SalesTxn> s1 = tList.stream();
        Stream<SalesTxn> s2 = s1.filter(e -> e.getBuyerName().equals("Radio Hut"));
        DoubleStream s3 = s2.mapToDouble(e -> e.getTransactionTotal());

        double t1 = s3.sum(); // Put result here

        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);

        /*

Create a stream from tList and assign it to: Stream<SalesTxn> s1

Create a second stream and assign the results of the filter method for Radio Hut
transactions: Stream<SalesTxn> s2

Create a third stream and assign the results from a mapToDouble method that returns the
transaction total: DoubleStream s3

Sum the final stream and assign the result to: double t1.
5. Print the results.
Hint: Be mindful of the method return types. Use the API doc to ensure that you are using
the correct methods and classes to create and store results.
6. The output from your test class should be similar to the following:
=== Transactions Totals ===
Radio Hut Total: $3,840,000.00
         */

        

        

        
    }
}
