package pl.javaexercises.week05.section01;

import java.io.IOException;
import java.util.Arrays;

public class MainWeek05Section01 {
    public static void main(String[] args) throws InterruptedException, IOException {
    System.out.println("=== TaskGenerator (Thread) ===");
        Ex01TaskGenerator ex01TaskGenerator = new Ex01TaskGenerator();
        Thread generatorThread = new Thread(ex01TaskGenerator);

        generatorThread.start();
        generatorThread.join();

        System.out.println("Generated Tasks: " + ex01TaskGenerator.getTasks().size());

    System.out.println("\n=== FileTaskManager (NIO) ===");
    Ex02FileTaskManager ex02FileTaskManager = new Ex02FileTaskManager();
    ex02FileTaskManager.saveTask(Arrays.asList("Task 1 - Write report",
            "Task 2 - Meeting with team",
            "Task 3 - Review code"));
    ex02FileTaskManager.readTask();
  }
}
