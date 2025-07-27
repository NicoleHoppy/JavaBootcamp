package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.Task;

import java.util.Map;

// 6. Main task: Filter the task list by status "DONE".

public class Ex06TaskAndDone implements Task<String> {

  Map<String, String> tasks;

  public Ex06TaskAndDone(Map<String, String> task) {
    this.tasks = task;
  }

  @Override
  public String run() {

    StringBuilder result = new StringBuilder();

    for (Map.Entry<String, String> entry : tasks.entrySet()) {
      if (entry.getValue().equalsIgnoreCase("done")) {
        result
            .append("Name: ")
            .append(entry.getKey())
            .append(", Status: ")
            .append(entry.getValue())
            .append("\n");
      }
    }
    return "Task with status done: " + "\n" + result;
  }
}
