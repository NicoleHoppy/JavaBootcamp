package pl.javaexercises.week01.section01;

import java.util.StringJoiner;
import pl.javaexercises.week01.TaskWeek01;

// 2. Print numbers from 10 to 1 (in reverse order).

public class Ex02ReversedLoop implements TaskWeek01<String> {

  @Override
  public String run() {
    StringJoiner joiner = new StringJoiner(", ");
    for (int i = 10; i > 0; i--) joiner.add(String.valueOf(i));

    return "Reversed loop from 10 to 1: " + joiner;
  }
}
