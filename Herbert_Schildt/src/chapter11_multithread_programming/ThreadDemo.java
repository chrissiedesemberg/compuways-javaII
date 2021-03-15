package chapter11_multithread_programming;

public class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();

        try {
            for(int n = 5; n > 0; n--){
                System.out.println("Main thread: " + n);
                Thread.sleep(1000);
                System.out.println("main sleeping");
            }
        } catch (InterruptedException ie) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }

}
