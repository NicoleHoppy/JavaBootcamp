package Maps;

import java.util.ArrayList;
import java.util.List;

public class FirstMain {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));

        tasks.get(0).markDone();
        tasks.get(1).markDone();
        tasks.get(0).unmarkDone();

        for (Task task : tasks) {
            if (task.done) {
                System.out.println(task);
            }
        }

    }
}

