package pl.javaexercises.week01.section03;

import java.util.List;
import java.util.Map;
import pl.javaexercises.week01.TaskWeek01;

public class MainWeek01Section03 {
  public static void main(String[] args) {
    List<TaskWeek01<String>> tasks =
        List.of(
            new Ex01ListOfNames(List.of("Kate", "Peter", "Anna", "Tom")),
            new Ex02IsContaining(List.of("Kate", "Peter", "Anna")),
            new Ex03MapOfNamesAges(Map.of("Anne", 20, "Kate", 25)),
            new Ex04AboveEighteen(Map.of("Tom", 17, "Ann", 20, "Kate", 30)),
            new Ex05NameOccurrenceCounter(
                List.of("Tom", "Ann", "Emma", "Joe", "Emma", "Kate", "Josh", "Joe")),
            new Ex06TaskAndDone(Map.of("Cooking", "Done", "Cleaning", "done", "Shopping", "todo")),
            new Ex07TodoTaskPrinter(
                Map.of("Cooking", "Done", "Cleaning", "done", "Shopping", "todo")));

    tasks.forEach(task -> System.out.println(task.getClass().getSimpleName() + ": " + task.run()));
  }
}
