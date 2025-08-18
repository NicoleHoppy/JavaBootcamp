package pl.javaexercises.week04;

//3. Write a method reverse(String input) that reverses the given text. Write tests for a normal string, an empty string, and null

public class Ex03StringReverser {
    public static String reverse (String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
