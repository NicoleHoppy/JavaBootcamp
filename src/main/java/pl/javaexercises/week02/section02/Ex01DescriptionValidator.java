package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

// 1. Write a method that validates a task description. A valid description:
//
// has 5 to 100 characters,
//
// contains only letters, digits, spaces, periods, and commas,
//
// cannot start or end with a space.

public class Ex01DescriptionValidator implements TaskWeek02<String> {

  @Override
  public String run(String desc) {
    if (desc == null || desc.length() < 5 || desc.length() > 100) return String.valueOf(false);
    if (desc.startsWith(" ") || desc.endsWith(" ")) return String.valueOf(false);
    return String.valueOf(desc.matches("[a-zA-Z0-9., ]+"));
  }
}
