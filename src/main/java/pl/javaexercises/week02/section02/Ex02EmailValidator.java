package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

// 2. Validate an email address

public class Ex02EmailValidator implements TaskWeek02<String> {

  @Override
  public String run(String name) {
    return String.valueOf(name.matches("[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}"));
  }
}
