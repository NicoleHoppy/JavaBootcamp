package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

// 4. Parse a string formatted like "firstName:lastName:age" into separate parts.

public class Ex04StringParser implements TaskWeek02<String> {

  @Override
  public String run(String input) {
    if (!input.matches("^[a-zA-Z0-9]+:[a-zA-Z0-9]+:[a-zA-Z0-9]+$")) {
      return "This name doesn't match the pattern! Please, correct it.";
    } else {
      return input.trim().replaceAll(":", ", ");
    }
  }
}
