package pl.javaexercises.week03.section02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class MainWeek03Section02 {
    public static void main(String[] args){

//    1. Count how many elements in the list are greater than 10.
        long numbersGreaterThanTen = Stream.of(5, 15, 20, 8, 11).filter(n -> n > 10).count();
    System.out.println("Ex01: " + numbersGreaterThanTen);

//    2. Print all words starting with the letter from a list of strings.
        Map<Character, List<String>> words = Stream.of("Apple", "Banana", "Avocado", "Cherry").collect(groupingBy(word -> word.charAt(0)));
        System.out.println("Ex02: " + words);

//    3. Create a new list containing the squares of numbers from the list.
        List<Integer> listOfSquares = Stream.of(1, 2, 3, 4).map(n -> n*n).toList();
        System.out.println("Ex03: " + listOfSquares);

//    4. Sort a list of names alphabetically.
        List<String> namesAlphabetically = Stream.of("Tom", "Anna", "John", "Zoe").sorted().toList();
        System.out.println("Ex04: " + namesAlphabetically);

//    5. Find the longest word in a list of words (Optional).
        Optional<String> theLongestWords = Stream.of("Java", "Concurrency", "Stream").max(Comparator.comparing(String::length));
        System.out.println("Ex05: " + theLongestWords);

//        6. Check if there is any number greater than 100 in the list.
        boolean numbersGreaterThan100 = Stream.of(10, 20, 99, 500).anyMatch(n -> n > 100);
        System.out.println("Ex06: " + numbersGreaterThan100);

//    7. Calculate the sum of all even numbers in the list.
        int sumOfEvenNumbers = Stream.of(2, 3, 4, 5, 6).filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Ex07: " + sumOfEvenNumbers);

//    8. Transform a list of words into a list of the lengths of those words.
        List<Integer> lengthOfWords = Stream.of("Hi", "Stream", "API").map(String::length).toList();
        System.out.println("Ex08: "+ lengthOfWords);

//    9. Print only unique numbers from a list with duplicates.
        List<Integer> onlyUnique = Stream.of(1, 2, 2, 3, 4, 4).distinct().toList();
        System.out.println("Ex09: " + onlyUnique);

//    10. Print only the first 3 elements from a list of numbers greater than 5.
        List<Integer> top3GreaterThan5 = Stream.of(3, 11, 8, 10, 1, 7).filter(t -> t > 5).limit(3).toList();
        System.out.println("Ex10: " + top3GreaterThan5);
    }
}
