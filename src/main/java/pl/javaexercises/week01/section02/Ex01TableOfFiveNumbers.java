package pl.javaexercises.week01.section02;

import java.util.Arrays;
import java.util.StringJoiner;
import pl.javaexercises.week01.Task;

// 1. Create an array of 5 numbers and print each of them.

public class Ex01TableOfFiveNumbers implements Task<String> {

  int REQUIRED_LENGTH = 5;
  int[] table;

  public Ex01TableOfFiveNumbers(int[] table) {
    this.table = table;
  }

  @Override
  public String run() {
    if (table.length == REQUIRED_LENGTH) {
      StringJoiner joiner = new StringJoiner(", ");
      for (int t : table) {
        joiner.add(String.valueOf(t));
      }
      return "Numbers from the following table: "
          + Arrays.toString(table)
          + " are as follows: "
          + joiner;
    }
    return "Wrong table length! Required length is 5!";
  }
}
