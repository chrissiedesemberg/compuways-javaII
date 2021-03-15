package chapter10_exception_handling;

import java.util.Random;

public class Tests {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12 / (b / c);
                System.out.println("\n a = " + a + "\n b = " + b + "\n c = " + c);
            } catch (ArithmeticException ae) {
                System.out.println("Exception caught" + ae.getMessage());
                a = 0;
            }
        System.out.println("Try and catch completed");
    }
    }
}
