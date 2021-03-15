package chapter30_regular_expressions_and_other.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr6 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test");

        while(mat.find())
            System.out.println("Match: " + mat.group());
    }
}
