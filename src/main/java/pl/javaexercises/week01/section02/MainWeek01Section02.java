package pl.javaexercises.week01.section02;

import java.util.List;
import pl.javaexercises.week01.TaskWeek01;

public class MainWeek01Section02 {
  public static void main(String[] args) {
    List<TaskWeek01<String>> tasks =
        List.of(
            new Ex01TableOfFiveNumbers(new int[] {1, 2, 3, 4, 5}),
            new Ex02CountNumbersAboveTen(new int[] {1, 2, 13, 16, 49}),
            new Ex03MaximumInTable(new int[] {1, 25, 3, 4, 5}),
            new Ex04SumOfTable(new int[] {1, 2, 3, 4, 5}),
            new Ex05ReversedTable(new int[] {1, 2, 3, 4, 5}),
            new Ex06HowManyTimes(new int[] {1, 2, 3, 4, 3, 12, 2, 2, 2}),
            new Ex07TheAverageOfTable(new double[] {1.09, 6.34, 2.45, 23.56}));

    tasks.forEach(task -> System.out.println(task.getClass().getSimpleName() + ": " + task.run()));
  }
}
