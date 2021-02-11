package Lesson_10.Lesson10_1;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class PeekTest {
    
    public static void main(String[] args) {
    
    List<SalesTxn> tList = SalesTxn.createTxnList();
    tList.stream()
                .filter(s -> s.getState().equals(State.CA))
                .filter(p -> p.getProduct().equals("Widget Pro"))
                .peek(t -> System.out.printf("Id: " + t.getTxnId() + 
                    " Buyer: " + t.getBuyerName() + 
                    " Txn amt: $%,9.2f ", t.getTransactionTotal()))
                .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
                .forEach(tax -> System.out.printf("Txn tax: $%,9.2f%n", tax));
           
    // Write report using peek
    System.out.println("=== Widget Pro Sales Tax in CA ===");

        
        
    }
}
