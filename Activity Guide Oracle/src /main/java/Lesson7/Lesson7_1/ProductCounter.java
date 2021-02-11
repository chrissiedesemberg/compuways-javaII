package Lesson7.Lesson7_1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class ProductCounter {
    // Create a Counting Map
    private Map<String, Long> partNumbers = new HashMap<>();
    // Create a Name Mapping Map
    private Map<String, String> productDescription = new TreeMap<>();

    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");

        // Create Product Counter Object and process data
            ProductCounter pc1 = new ProductCounter (productNames);
            pc1.processList(parts);
            pc1.printReport();
             
    }

    public ProductCounter(Map productDescription) {
    // Your code here
        this.productDescription = productDescription;
    }

    public void processList(String[] list) {
    // your code here
        long value = 0;
        for (String itemNumber: list){
            if (partNumbers.containsKey(itemNumber)){
                value = partNumbers.get(itemNumber);
                value++;
                partNumbers.put(itemNumber, new Long(value));
            } 
            else {
                partNumbers.put(itemNumber,new Long(1));
            }
                }
}

    public void printReport() {
        // Your code here
        System.out.println("=== Product Report ===");
        for (String key:productDescription.keySet()){
            System.out.print("Name: " + key);
            System.out.println("\t\tCount: " +
            partNumbers.get(productDescription.get(key)));
        }
    }
}
