package pl.javaexercises.week04;

// 4. Write a method isEmpty(String str) that returns true if the string is empty or null. Test
// various cases.

public class Ex04IsEmpty {
  public static boolean isEmpty(String str) {
    return str == null || str.isEmpty();
  }
}
