package pl.javaexercises.week02.section01;

// 1. Write a method that receives a String and replaces all occurrences of @ with (at) and # with
// (hash). The method returns a new, transformed string.

import pl.javaexercises.week02.TaskWeek02;

public class Ex01CharReplacer implements TaskWeek02<String> {

  @Override
  public String run(String input) {
    return input.replace("@", "(at)").replace("#", "(hash)");
  }
}
