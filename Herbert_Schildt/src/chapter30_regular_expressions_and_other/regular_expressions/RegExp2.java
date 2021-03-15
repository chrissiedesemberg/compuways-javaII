package chapter30_regular_expressions_and_other.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java SE");
        System.out.println("Looking for Java in Java SE");

        if(mat.find())
            System.out.println("Subsequence found");
        else
            System.out.println("No Match");

    }

}
