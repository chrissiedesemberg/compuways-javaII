package chapter29_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "000-0001", "larry@email.com" ));
        myList.add(new NamePhoneEmail("Susan", "000-0002", "susan@email.com" ));
        myList.add(new NamePhoneEmail("Jerry", "000-0003", "jerry@email.com" ));
        myList.add(new NamePhoneEmail("Adam", "000-0004", "adam@email.com" ));
        myList.add(new NamePhoneEmail("Denise", "000-0005", "denise@email.com" ));

        Stream<NamePhone> nameAndPhone = myList.stream().map( (a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("===================================================");

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers in a List:");
        for(NamePhone e : npList) {
            System.out.println(e.name + ": " + e.phone);
        }

        System.out.println("\n===================================================\n");

        nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Names and phone numbers in a Set:");
        for(NamePhone e: npSet){
            System.out.println(e.name + ": " + e.phone);
        }

    }

}
