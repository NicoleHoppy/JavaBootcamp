package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.TaskWeek01;

import java.util.Map;

// 7. Add tasks to a map of status → list of tasks and print all tasks with theTODO status.

public class Ex07TodoTaskPrinter implements TaskWeek01<String> {

  Map<String, String> statusMap;

  public Ex07TodoTaskPrinter(Map<String, String> statusMap) {
    this.statusMap = statusMap;
  }

  @Override
  public String run() {

    StringBuilder onlyToDo = new StringBuilder();

    for (Map.Entry<String, String> entry : statusMap.entrySet()) {
      if (entry.getValue().equalsIgnoreCase("TODO")) {
        onlyToDo
            .append("Name: ")
            .append(entry.getKey())
            .append(", Status: ")
            .append(entry.getValue())
            .append("\n");
      }
    }

    return "The tasks with the TODO status: " + "\n" + onlyToDo + "\n";
  }
}
