package pl.javaexercises.week01.section02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import pl.javaexercises.week01.Task;

// 6. Write a program that counts how many times a given number appears in the array.

public class Ex06HowManyTimes implements Task<String> {

  int[] table;

  public Ex06HowManyTimes(int[] table) {
    this.table = table;
  }

  @Override
  public String run() {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int t : table) {
      counts.put(t, counts.getOrDefault(t, 0) + 1);
    }

    return "For the following table: "
        + Arrays.toString(table)
        + " numbers appear this many times: "
        + counts;
  }
}
