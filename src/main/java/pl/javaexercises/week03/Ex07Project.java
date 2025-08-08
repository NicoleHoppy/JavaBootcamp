package pl.javaexercises.week03;

import java.util.ArrayList;
import java.util.List;

// 7. Task: Create a Project class aggregating Task:
//
// Task should include title, dueDate, status.
//
// Project should have a name and a list of tasks List<Task>.
//
// Implement the method addTask(Task task) in Project.
//
// Create a base class Item with title, which Task may inherit.
//
// Create an interface Completable with the method complete(), which Task will implement.

public class Ex07Project {
  public String name;
  public List<Ex07Task> tasks;

  public Ex07Project(String name) {
    this.name = name;
    this.tasks = new ArrayList<>();
  }

  public void addTask(Ex07Task task) {
    tasks.add(task);
  }

  public void showTasks() {
    System.out.println("Project: " + name);
    for (Ex07Task t : tasks) {
      System.out.println(" - " + t);
    }
  }
}
