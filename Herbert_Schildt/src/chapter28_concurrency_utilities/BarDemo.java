package chapter28_concurrency_utilities;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

    public static void main(String[] args) {

        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Starting");

        new Thread(new MyThread1(cb, "A")).start();
        new Thread(new MyThread1(cb, "B")).start();
        new Thread(new MyThread1(cb, "C")).start();
        new Thread(new MyThread1(cb, "X")).start();
        new Thread(new MyThread1(cb, "Y")).start();
        new Thread(new MyThread1(cb, "Z")).start();
    }
}

class MyThread1 implements Runnable {
     CyclicBarrier cbar;
     String name;

     MyThread1(CyclicBarrier c, String n) {
         cbar = c;
         name = n;
     }

     public void run() {
         System.out.println(name);
     try {
         cbar.await();
     } catch (BrokenBarrierException bbe){
         System.out.println(bbe);
     } catch (InterruptedException ie) {
         System.out.println(ie);
     }
     }
}

class BarAction implements Runnable {
    public void run() {
        System.out.println("Barrier Reached!");
    }
}