package Lesson_15.Tests;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayListTest implements Runnable {

    private CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayListTest test = new ArrayListTest();

        es.submit(test); es.submit(test); es.shutdown();
    }

    @Override
    public void run() {
        wordList.add("A");
        System.out.println(wordList);
        wordList.add("B");
        System.out.println(wordList);
        wordList.add("C");
        System.out.println(wordList);
    }
}
