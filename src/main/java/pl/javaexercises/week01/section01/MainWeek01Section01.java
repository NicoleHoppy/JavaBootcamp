package pl.javaexercises.week01.section01;

import java.util.List;
import pl.javaexercises.week01.Task;

public class MainWeek01Section01 {
    public static void main(String[] args) {

    List<Task<String>> tasks =
        List.of(new Ex01StandardLoop(),
                new Ex02ReversedLoop(),
                new Ex03OnlyEven());

        tasks.forEach(task -> System.out.println(task.run()));
    }
}
