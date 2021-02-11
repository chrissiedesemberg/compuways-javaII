package Lesson_15.Lesson15_1.src.com.example;

public class CountRunnable implements Runnable{
  
  final int count;
  final String threadName;

  public CountRunnable(int count, String threadName) {
    this.count = count;
    this.threadName = threadName;
  }

  
  public void run(){ 
    // Count with for loop
    for (int i = 0; i <= count; i++) {
      System.out.println("Thread name: " + threadName + " Count: " + count);
    }
  }
}
