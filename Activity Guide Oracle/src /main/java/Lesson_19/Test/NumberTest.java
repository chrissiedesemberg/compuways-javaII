package Lesson_19.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {

    public static void main(String[] args) {
        Locale loc = Locale.UK;
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        double money = 1_000_000.00d;

        System.out.println("Money: " + nf.format(money) + " in Locale: " + loc);

        System.out.println("\n===============================\n");

        loc = Locale.CHINA;
        nf = NumberFormat.getCurrencyInstance(loc);
        System.out.println("Money: " + nf.format(money) + " in Locale: " + loc);


    }

}


