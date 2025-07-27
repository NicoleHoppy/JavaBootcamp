package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.Task;

import java.util.Map;

// 3. Create a map of name → age and print all entries.

public class Ex03MapOfNamesAges implements Task<String> {

  Map<String, Integer> usersDetails;

  public Ex03MapOfNamesAges(Map<String, Integer> usersDetails) {
    this.usersDetails = usersDetails;
  }

  @Override
  public String run() {
    StringBuilder result = new StringBuilder();

    for (Map.Entry<String, Integer> entry : usersDetails.entrySet()) {
      result
          .append("Name: ")
          .append(entry.getKey())
          .append(", Age: ")
          .append(entry.getValue())
          .append("\n");
    }

    return "The results of the map: " + "\n" + result;
  }
}
