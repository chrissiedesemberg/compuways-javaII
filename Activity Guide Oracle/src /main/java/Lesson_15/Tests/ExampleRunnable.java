package Lesson_15.Tests;

public class ExampleRunnable implements Runnable {

    private final String name;

    public ExampleRunnable(String name){
        this.name = name;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }
    }
}
