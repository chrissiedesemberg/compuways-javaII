package Lesson_10.Lesson10_3;

import java.util.List;
import java.util.function.Consumer;
import java.util.Comparator;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .forEach(radioReport);
      
        
        // Print out the total number of transactions
        System.out.print("\nTotal Transactions: ");
        System.out.println(
                tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .count());
        
        // Print largest transaction
        System.out.println("\n=== Radio Hut Largest ===" );
        Optional <SalesTxn> tLargest = 
                tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .max(Comparator.comparing(SalesTxn::getTransactionTotal));
       
        if (tLargest.isPresent()) {
            radioReport.accept(tLargest.get());
        }
 
        // Print smallest transaction
        System.out.println("\n=== Radio Hut Smallest ===");
        Optional <SalesTxn> tSmallest = 
                tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .min(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if (tSmallest.isPresent()) {
        radioReport.accept(tSmallest.get());}
        
    }
}
