package pl.javaexercises.week04;

// 5. Implement a method factorial(int n) that returns the factorial of a number. Handle the 0 case
// and test for 5.

public class Ex05Factorial {
  public static int factorial(int n) {
    return n == 0 ? 1 : n * factorial(n - 1);
  }
}
