package pl.javaexercises.week01.section02;

import pl.javaexercises.week01.TaskWeek01;

import java.util.Arrays;

// 3. Find the largest number in the array.

public class Ex03MaximumInTable implements TaskWeek01<String> {

  int[] table;

  public Ex03MaximumInTable(int[] table) {
    this.table = table;
  }

  @Override
  public String run() {

    int maximum = table[0];

    for (int t : table) {
      maximum = Math.max(maximum, t);
    }

    return "The maximum of the following table: " + Arrays.toString(table) + " is: " + maximum;
  }
}
