package chapter11_multithread_programming;

public class NewThread implements Runnable{

    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("\nChild thread: " + t);
    }

    // This is the entry point for the second thread.

    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread " + i);
                Thread.sleep(1000);
                System.out.println("child sleeping");
            }
            } catch (InterruptedException ie) {
            System.out.println("Child interrupted");
        }
        System.out.println("Existing child thread");
        }

    }

