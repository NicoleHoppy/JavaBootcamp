package pl.javaexercises.week03.section02;

import java.util.stream.Stream;

public class MainWeek03Section02 {
    public static void main(String[] args){

//    1. Count how many elements in the list are greater than 10.
        long numbersGreaterThanTen = Stream.of(5, 15, 20, 8, 11).filter(n -> n > 10).count();
    System.out.println("Ex01: " + numbersGreaterThanTen);

    }
}
