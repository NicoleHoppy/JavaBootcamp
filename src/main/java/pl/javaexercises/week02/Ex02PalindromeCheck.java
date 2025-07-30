package pl.javaexercises.week02;

// 2. Write a method that counts how many vowels (a, e, i, o, u, y) are present in the given String,
// regardless of case.

public class Ex02PalindromeCheck implements TaskWeek02<Boolean> {

  @Override
  public Boolean run(String input) {
    String lowerCaseNoSpace = input.replaceAll("\\s+", "").toLowerCase();
    String reversed = new StringBuilder(lowerCaseNoSpace).reverse().toString();
    return (lowerCaseNoSpace.equals(reversed));
  }
}
