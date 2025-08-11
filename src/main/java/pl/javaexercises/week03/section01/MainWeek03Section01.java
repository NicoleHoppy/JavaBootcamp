package pl.javaexercises.week03.section01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Stream;

public class MainWeek03Section01 {

  public static void main(String[] args) {

    printSection(
        Ex01BookComparer.class,
        new HashSet<>(
            Arrays.asList(
                new Ex01BookComparer("The Witcher", "Andrzej Sapkowski", 1990),
                new Ex01BookComparer("The Witcher", "Andrzej Sapkowski", 2000),
                new Ex01BookComparer("Harry Potter", "J.K. Rowling", 1997),
                new Ex01BookComparer("Harry Potter", "Anonymous", 1997))));

    printSection(
        Ex02Student.class,
        Stream.of(
                new Ex02Student("Tom Smith", 4.22),
                new Ex02Student("Kate Williams", 3.98),
                new Ex02Student("Peter Johnson", 4.82),
                new Ex02Student("Sam Potter", 3.59))
            .sorted());

    printSection(
        Ex03Student.class,
        Stream.of(
                new Ex03Student("Mary Benn", 4.79),
                new Ex03Student("John Bale", 4.79),
                new Ex03Student("Sam Garry", 4.79),
                new Ex03Student("Martha Smith", 4.79))
            .sorted(Comparator.comparing(Ex03Student::getName)));

    printSection(
        Ex04Employee.class,
        new HashSet<>(
            Arrays.asList(
                new Ex04Employee(201, "John Smith", 3),
                new Ex04Employee(203, "Emily Johnson", 5),
                new Ex04Employee(203, "Michael Brown", 2),
                new Ex04Employee(204, "Sarah Davis", 4))));

    printSection(
        Ex05Product.class,
        Stream.of(
                new Ex05Product("Phone", 999.99, 8),
                new Ex05Product("Tablet", 499.99, 5),
                new Ex05Product("Laptop", 499.99, 7))
            .sorted(
                Comparator.comparingDouble(Ex05Product::getPrice)
                    .thenComparing(Ex05Product::getRating)
                    .reversed()));

    Ex06IntegersSorter integersSorter = new Ex06IntegersSorter(new int[] {7, 4, 8, 2, 1});
    Arrays.sort(integersSorter.getInput());
    printSection(Ex06IntegersSorter.class, integersSorter);

    printSection(
        Ex07Person.class,
        Stream.of(
                new Ex07Person("Ann", 25), new Ex07Person("Mary", 21), new Ex07Person("Peter", 23))
            .sorted(Comparator.comparingInt(Ex07Person::getAge)));

    printSection(
        Ex08NamesSorter.class,
        Stream.of(
                new Ex08NamesSorter("Bob"),
                new Ex08NamesSorter("Ann"),
                new Ex08NamesSorter("Tom"),
                new Ex08NamesSorter("Barry"),
                new Ex08NamesSorter("Sam"))
            .sorted(Comparator.comparing(Ex08NamesSorter::getName)));
  }

  private static void printSection(Class<?> clazz, Object data) {
    System.out.println(clazz.getSimpleName() + ": ");

    if (data instanceof Stream<?> stream) {
      stream.forEach(System.out::print);

    } else if (data instanceof Collection<?> collection) {
      collection.forEach(System.out::println);

    } else {
      System.out.print(data);
    }
    System.out.println();
  }
}
