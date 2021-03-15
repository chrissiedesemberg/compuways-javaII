package chapter17_string_handling;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {

//        char chars[] = {'J', 'a', 'v', 'a'};
//        String s1 = new String(chars);
//        String s2 = new String(s1);
//
//        System.out.println(s1);
//        System.out.println(s2);
//
//        //getChars()
//
//        String s = "This is a demo of the getChars method.";
//        int start = 10;
//        int end = 14;
//        char buff[] = new char[end - start];
//
//        s.getChars(start, end, buff, 0);
//        System.out.println(buff);
//
        //String comparison

        String a = "This is a String in a variable";
        String b = "this is a string";

        System.out.println(a.equalsIgnoreCase(b));
        System.out.println("Region matches: " + a.regionMatches(true, 0, b, 0, 4));
        System.out.println("endsWith: " + a.endsWith("ing"));
        System.out.println("startsWith: " + b.startsWith("this"));

        // compareTo()
        
        String arr[] = {"Now", "is", "the", "time", "for", "all", "food", "men", "to",
                "come", "to", "the", "aid", "of", "their", "country"};
        
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i <arr.length; i++){
                if(arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }}
            System.out.println(arr[j]);
        }

        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));

//        String a = "This is a String in a variable";
//        String b = "this is a string";
        int indexOf = a.lastIndexOf("in");
        String c = a.substring(indexOf, a.length());
        System.out.println(c);
        System.out.println();

        b = b.toUpperCase(Locale.ROOT);
        System.out.println(b);

        StringBuffer sb = new StringBuffer("Hello123");
        sb.setLength(14);
        System.out.println("buffer = " + sb );
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println(sb.indexOf("1"));
        sb.delete(5, sb.length());
//        sb.deleteCharAt(5);
        System.out.println(sb);

    }

}
