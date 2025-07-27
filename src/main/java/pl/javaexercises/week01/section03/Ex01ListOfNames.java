package pl.javaexercises.week01.section03;

import java.util.List;
import pl.javaexercises.week01.TaskWeek01;

// 1. Create a list of names (List<String>) and print each name.

public class Ex01ListOfNames implements TaskWeek01<String> {

  private final List<String> names;

  public Ex01ListOfNames(List<String> names) {
    this.names = names;
  }

  @Override
  public String run() {
    return "Those are names from the list: " + String.join(", ", names);
  }
}
