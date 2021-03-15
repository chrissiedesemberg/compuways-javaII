package chapter14_generics;

public class MinMaxDemo {

    public static void main(String[] args) {
        Integer inums[] = {3, 4, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MinMaxClass<Integer> iOb = new MinMaxClass<Integer>(inums);
        MinMaxClass<Character> cOb = new MinMaxClass<Character>(chs);

        System.out.println("Max value in inums: " + iOb.max());
        System.out.println("Min value in inums: " + iOb.min());

        System.out.println("Max value in chs: " + cOb.max());
        System.out.println("Min value in chs: " + cOb.min());

    }

}
