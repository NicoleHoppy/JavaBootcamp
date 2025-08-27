package pl.javaexercises.week05.section01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//1: Running a test thread that generates a list of tasks:
//
//- Create a class TaskGenerator implementing Runnable.
//- In the run() method, generate 10 tasks (Task) with different dates.
//- Run the thread:
//
//Thread generatorThread = new Thread(new TaskGenerator());
//generatorThread.start();
//generatorThread.join();

public class Ex01TaskGenerator implements Runnable {
    private final List<Ex01Task> tasks = new ArrayList<>();

    @Override
    public void run() {
        for(int i = 1; i <= 10 ; i++) {
            tasks.add(new Ex01Task("Task " + i, LocalDate.now().plusDays(i)));
        }
    tasks.forEach(System.out::println);
    }

}
