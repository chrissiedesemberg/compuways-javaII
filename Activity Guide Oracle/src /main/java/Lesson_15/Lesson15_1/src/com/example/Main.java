package Lesson_15.Lesson15_1.src.com.example;

import Lesson_15.Tests.ExampleRunnable;

import java.util.concurrent.*;

public class Main {

  public static void main(String[] args) {
    // Setup Executor
    ExecutorService es = Executors.newCachedThreadPool();

    // Submit Runnable
    Future cr1 = es.submit(new CountRunnable(20, "A"));
    Future cr2 = es.submit(new CountRunnable(20, "B"));
    Future cr3 = es.submit(new CountRunnable(20, "C"));

    // Showndown ExectuorService

    es.shutdown();
  }
}
