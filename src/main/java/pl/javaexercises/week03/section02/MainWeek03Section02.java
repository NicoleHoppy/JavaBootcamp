package pl.javaexercises.week03.section02;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class MainWeek03Section02 {
  public static void main(String[] args) {

    printExample(1, "Count of numbers greater than 10", Stream.of(5, 15, 20, 8, 11).filter(n -> n > 10).count());
    printExample(2, "Words grouped by starting letter", Stream.of("Apple", "Banana", "Avocado", "Cherry").collect(groupingBy(word -> word.charAt(0))));
    printExample(3, "List of squares", Stream.of(1, 2, 3, 4).map(n -> n * n).toList());
    printExample(4, "Names sorted alphabetically", Stream.of("Tom", "Anna", "John", "Zoe").sorted().toList());
    printExample(5, "The longest word", Stream.of("Java", "Concurrency", "Stream").max(Comparator.comparing(String::length)).orElse("None"));
    printExample(6, "Is there any number greater than 100?", Stream.of(10, 20, 99, 500).anyMatch(n -> n > 100));
    printExample(7, "Sum of even numbers", Stream.of(2, 3, 4, 5, 6).filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum());
    printExample(8, "Length of each word", Stream.of("Hi", "Stream", "API").map(String::length).toList());
    printExample(9, "Unique numbers", Stream.of(1, 2, 2, 3, 4, 4).distinct().toList());
    printExample(10, "First 3 numbers greater than 5", Stream.of(3, 11, 8, 10, 1, 7).filter(t -> t > 5).limit(3).toList());

  }

  public static void printExample(int number, String taskDescription, Object result) {
    System.out.printf("Ex%02d: %s: %s%n", number, taskDescription, result);
  }
}
