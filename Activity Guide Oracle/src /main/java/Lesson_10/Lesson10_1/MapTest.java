package Lesson_10.Lesson10_1;

import java.util.List;

/**
 *
 * @author oracle
 */
public class MapTest {
    
    public static void main(String[] args) {
/*
        Modify the MapTest class to create a sales tax report.
            a. Filter the transactions for the following.
                − Transactions from the state of CA: t.getState().equals(State.CA)
                − Transactions for the Widget Pro product:
                    t.getProduct().equals("Widget Pro")
            b. Use the map method to calculate the sales tax. The calculation is as follows:
                    t.getTransactionTotal() * TaxRate.byState(t.getState())
            c. Print a report similar to the following:
            === Widget Pro Sales Tax in CA ===
            Txn tax: $36,000.00
            Txn tax: $180,000.00
            Note: To get the comma-separated currency, use something like this:
            System.out.printf("Txn tax: $%,9.2f%n", amt)
        */
        
        List<SalesTxn> tList = SalesTxn.createTxnList();
        // Calculate sales tax for CA Transactions
        System.out.println("=== Widget Pro Sales Tax in CA ===");
        tList.stream()
                .filter(s -> s.getState().equals(State.CA))
                .filter(p -> p.getProduct().equals("Widget Pro"))
                .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
                .forEach(tax -> System.out.printf("Txn tax: $%,9.2f%n", tax));

    }
}
