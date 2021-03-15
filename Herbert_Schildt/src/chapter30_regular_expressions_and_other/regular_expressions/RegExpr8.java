package chapter30_regular_expressions_and_other.regular_expressions;

import java.util.regex.Pattern;

public class RegExpr8 {

    public static void main(String[] args) {

        Pattern pat = Pattern.compile("[ ,.!]");
        String strs[] = pat.split("one two, alpha9 12!done.");

        for (int i=0; i< strs.length; i++){
            System.out.println("Next token: " + strs[i]);
        }


    }

}
