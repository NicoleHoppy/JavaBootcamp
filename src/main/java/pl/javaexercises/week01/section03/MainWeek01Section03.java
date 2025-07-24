package pl.javaexercises.week01.section03;

import java.util.List;
import java.util.Map;
import pl.javaexercises.week01.Task;

public class MainWeek01Section03 {
    public static void main(String[] args) {
        List<Task<String>> tasks = List.of(
                new Ex01ListOfNames(List.of("Kate", "Peter", "Anna", "Tom"))
        );

        tasks.forEach(task -> System.out.println(task.run()));
    }
}