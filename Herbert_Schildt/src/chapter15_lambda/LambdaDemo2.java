package chapter15_lambda;

public class LambdaDemo2 {

    public static void main(String[] args) {

        NumberTest isEven = (n) -> (n%2) == 0;

        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");

        NumberTest isNonNeg = (n) -> (n>0);

        if(isNonNeg.test(10)) System.out.println("10 is not negative");
        if(!isNonNeg.test(-9)) System.out.println("9 is negative");

//        NumberTest2<Integer> sum1 = (a, b) -> (a + b);
//        System.out.println("The sum of 3 + 4 = " + sum1.add(3, 4));

        NumberTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.testFact(10,2)) System.out.println("2 is a factor of 10");
        if(!isFactor.testFact(10,3)) System.out.println("3 is not a factor of 10");
    }

}
