package pl.javaexercises.week02.section01;

// 2. Write a method that counts how many vowels (a, e, i, o, u, y) are present in the given String,
// regardless of case.

import pl.javaexercises.week02.TaskWeek02;

public class Ex02PalindromeCheck implements TaskWeek02<String> {

  @Override
  public String run(String input) {
    String lowerCaseNoSpace = input.replaceAll("\\s+", "").toLowerCase();
    String reversed = new StringBuilder(lowerCaseNoSpace).reverse().toString();
    return String.valueOf((lowerCaseNoSpace.equals(reversed)));
  }
}
