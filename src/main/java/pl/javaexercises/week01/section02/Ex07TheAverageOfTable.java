package pl.javaexercises.week01.section02;

import java.util.Arrays;
import pl.javaexercises.week01.Task;

// 7. Write a program that calculates the average (arithmetic mean) of elements in a double array.

public class Ex07TheAverageOfTable implements Task<String> {

  double[] table;

  public Ex07TheAverageOfTable(double[] table) {
    this.table = table;
  }

  @Override
  public String run() {
    double sum = 0.00;
    for (double t : table) sum += t;
    double average = sum / table.length;

    return "For the following table: " + Arrays.toString(table) + " the average is: " + average;
  }
}
