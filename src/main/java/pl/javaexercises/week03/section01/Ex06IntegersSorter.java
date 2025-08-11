package pl.javaexercises.week03.section01;

import java.util.Arrays;

// 6. Read 5 integers from the user, save them into an array, and sort them in ascending order. Use
// Arrays.sort().

public class Ex06IntegersSorter {
  int[] input;

  public Ex06IntegersSorter(int[] input) {
    this.input = input;
  }

  public int[] getInput() {
    return input;
  }

  @Override
  public String toString() {
    return "  " + Arrays.toString(input) + "\n";
  }
}
