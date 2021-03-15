package chapter14_generics;

interface MinMax <T extends Comparable<T>>{

    T min();
    T max();



}
