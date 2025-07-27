package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.TaskWeek01;

// 4. Check whether the given number is positive, negative, or zero.

public class Ex04NumberType implements TaskWeek01<String> {

  private final int input;

  public Ex04NumberType(int input) {
    this.input = input;
  }

  @Override
  public String run() {
    if (input < 0) return "Number " + input + " is negative.";
    else if (input > 0) return "Number " + input + " is positive.";
    return "Number " + input + " is zero.";
  }
}
