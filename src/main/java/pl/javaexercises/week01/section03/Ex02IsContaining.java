package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.Task;

import java.util.List;

// 2. Check if the list of names contains the name "Anna".

public class Ex02IsContaining implements Task<String> {

  private final List<String> names;

  public Ex02IsContaining(List<String> names) {
    this.names = names;
  }

  @Override
  public String run() {
    return "Does the list contain name Anna? " + names.contains("Anna") + "\n";
  }
}
