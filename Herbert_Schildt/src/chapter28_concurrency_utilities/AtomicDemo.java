package chapter28_concurrency_utilities;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {


        new Thread(new AtomicThread("A")).start();
        new Thread(new AtomicThread("B")).start();
        new Thread(new AtomicThread("C")).start();
    }
}

class Shared2 {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable {
    String name;

    AtomicThread(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Starting: " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " got: " + Shared2.ai.getAndSet(i));
        }
    }
}