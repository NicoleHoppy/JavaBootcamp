package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.Task;

// 5. Check if a number is divisible by both 3 and 5.

public class Ex05IsDivided implements Task<String> {

  private final int input;

  public Ex05IsDivided(int input) {
    this.input = input;
  }

  @Override
  public String run() {
    if (input % 3 == 0 && input % 5 == 0) return "Number " + input + " is divided by 3 and 5.";
    return "Number " + input + " is not divided by 3 and 5.";
  }
}
