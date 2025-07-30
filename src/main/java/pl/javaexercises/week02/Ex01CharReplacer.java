package pl.javaexercises.week02;

// 1. Write a method that receives a String and replaces all occurrences of @ with (at) and # with
// (hash). The method returns a new, transformed string.

public class Ex01CharReplacer implements TaskWeek02<String> {

  @Override
  public String run(String input) {
    return input.replace("@", "(at)").replace("#", "(hash)");
  }
}
