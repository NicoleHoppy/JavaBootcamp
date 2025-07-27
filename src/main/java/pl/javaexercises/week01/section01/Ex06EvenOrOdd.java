package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.TaskWeek01;

// 6. Even or odd: Read an integer and print whether it is even or odd.

public class Ex06EvenOrOdd implements TaskWeek01<String> {

  private final int input;

  public Ex06EvenOrOdd(int input) {
    this.input = input;
  }

  @Override
  public String run() {
    if (input % 2 == 0) return "Number " + input + " is even.";
    return "Number " + input + " is odd.";
  }
}
