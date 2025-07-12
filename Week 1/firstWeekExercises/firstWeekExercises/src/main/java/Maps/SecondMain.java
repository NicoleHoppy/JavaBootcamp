package Maps;

import java.util.HashMap;
import java.util.Map;

public class SecondMain {
    public static void main(String[] args) {

        Map<String, Task> tasks = new HashMap<>();

        tasks.put("Task 1", new Task("Task 1"));
        tasks.put("Task 2", new Task("Task 2"));
        tasks.put("Task 3", new Task("Task 3"));

        for (String name : tasks.keySet()) {
            Task task = tasks.getOrDefault(name, new Task(name));
            task.unmarkDone();
            System.out.println(task);
        }
    }
}
