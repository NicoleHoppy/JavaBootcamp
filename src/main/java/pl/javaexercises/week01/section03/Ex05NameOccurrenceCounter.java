package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 5. Count how many times a given name appears in the list.

public class Ex05NameOccurrenceCounter implements Task<String> {

  List<String> names;

  public Ex05NameOccurrenceCounter(List<String> names) {
    this.names = names;
  }

  @Override
  public String run() {
    Map<String, Integer> counts = new HashMap<>();
    for (String name : names) {
      counts.put(name, counts.getOrDefault(name, 0) + 1);
    }

    return "The names in the following list: " + names + " appears this many times: " + counts + "\n";
  }
}
