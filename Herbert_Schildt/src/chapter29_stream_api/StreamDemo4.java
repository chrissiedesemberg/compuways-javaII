package chapter29_stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo4 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Aplha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
