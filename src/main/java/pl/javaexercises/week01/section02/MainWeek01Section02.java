package pl.javaexercises.week01.section02;

import java.util.List;
import pl.javaexercises.week01.Task;

public class MainWeek01Section02 {
    public static void main(String[] args) {
        List<Task<String>> tasks = List.of(
                new Ex01TableOfFiveNumbers(new int[]{1, 2, 3, 4, 5})
        );

        tasks.forEach(task -> System.out.println(task.run()));
    }
}