package chapter28_concurrency_utilities;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        new Thread((Runnable) new LockThread(lock, "A")).start();
        new Thread((Runnable) new LockThread(lock, "B")).start();
    }
}

class Shared {
    static int count = 0;

}

class LockThread {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
    }

    public void run() {
        System.out.println("Starting: " + name);

        try {
            System.out.println(name + " is waiting to lock count.");
            lock.lock();
            System.out.println(name + " is locking count.");
            Shared.count++;
            System.out.println(name + ": " + Shared.count);

            System.out.println(name + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        } finally {
            System.out.println(name + " is unlocking count.");
            lock.unlock();
        }
    }
}