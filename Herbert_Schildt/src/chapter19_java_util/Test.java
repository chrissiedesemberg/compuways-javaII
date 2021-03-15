package chapter19_java_util;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Test {

    // Iterator demo

    public static void main(String[] args) {
//
//
//        ArrayList<String> al = new ArrayList<String>();
//
//        al.add("A");
//        al.add("B");
//        al.add("C");
//        al.add("D");
//        al.add("E");
//        al.add("F");
//        al.add("G");
//        al.add("H");
//
//        System.out.println("Original contents of al:" );
//        Iterator<String> itr  = al.iterator();
//        while (itr.hasNext()){
//            String element = itr.next();
//            System.out.print(element + " ");
//        }
//        System.out.println();
//
//
//        System.out.println("Contents of al: ");
//        for (String i : al){
//            System.out.println(i + " ");
//        }

//            HashMap<String, Double> hm = new HashMap<String, Double>();
//
//            hm.put("John Doe", 3434.34);
//            hm.put("Tom Smith", 4444.44);
//            hm.put("Jane Baker", 123.33);
//            hm.put("Tod Hall", 1345.67);
//            hm.put("Ralph Smith", 1212.23);
//
//            Set<Map.Entry<String, Double>> set = hm.entrySet();
//
//            for(Map.Entry<String, Double> me : set){
//                System.out.println(me.getKey() + ":");
//                System.out.println(me.getValue());
//            }
//
//        System.out.println();
//
//            double balance = hm.get("John Doe");
//            hm.put("John Doe", balance + 1000);
//
//        System.out.println("John Doe's new balance is: " + hm.get("John Doe"));

        
        TreeMap<String, Double> tm = new TreeMap<>();

            tm.put("John Doe", 3434.34);
            tm.put("Tom Smith", 4444.44);
            tm.put("Jane Baker", 123.33);
            tm.put("Tod Hall", 1345.67);
            tm.put("Ralph Smith", 1212.23);

            Set<Map.Entry<String, Double>> set = tm.entrySet();

            for(Map.Entry<String, Double> me : set){
                System.out.print(me.getKey() + ": " );
                System.out.println(me.getValue());
            }

             System.out.println();

            double balance = tm.get("Jane Baker");
            tm.put("Jane Baker", balance + 10000);

            System.out.println("Jane Baker's new balance is: " + tm.get("Jane Baker"));

    }
}
