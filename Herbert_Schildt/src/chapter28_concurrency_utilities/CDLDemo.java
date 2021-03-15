package chapter28_concurrency_utilities;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Starting");

        new Thread(new MyThread(cdl)).start();

        try {
            cdl.await();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("Done");
    }
}

    class MyThread implements Runnable {
        CountDownLatch latch;

        MyThread(CountDownLatch c) {
            latch = c;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                latch.countDown();
            }
        }
    }