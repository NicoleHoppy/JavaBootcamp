package pl.javaexercises.week02.section01;

import pl.javaexercises.week02.TaskWeek02;

public class Ex06WordCounter implements TaskWeek02<String> {

  @Override
  public String run(String name) {
    String[] nameList = name.trim().split("\\s");
    return String.valueOf(nameList.length);
  }
}
