package pl.javaexercises.week01.section01;

import java.util.StringJoiner;

import pl.javaexercises.week01.TaskWeek01;

// 1. Print numbers from 1 to 10.

public class Ex01StandardLoop implements TaskWeek01<String> {

  @Override
  public String run() {
    StringJoiner joiner = new StringJoiner(", ");
    for (int i = 1; i <= 10; i++) joiner.add(String.valueOf(i));

    return "Normal loop from 1 to 10: " + joiner;
  }
}
