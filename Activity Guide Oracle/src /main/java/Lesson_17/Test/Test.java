package Lesson_17.Test;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int r2 = IntStream.rangeClosed(1, 5).parallel()
        .reduce(5, (sum, element) -> sum + element);

        System.out.println("Result: " + r2);

    }

}
