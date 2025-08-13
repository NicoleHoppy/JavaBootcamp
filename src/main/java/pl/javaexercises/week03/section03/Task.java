package pl.javaexercises.week03.section03;

import java.time.LocalDate;

public class Task {
    String title;
    LocalDate dueDate;

    @Override
    public String toString() {
        return "Task: " +
                "title = '" + title + '\'' +
                ", dueDate = " + dueDate;
    }

    public Task(String title, LocalDate dueDate) throws InvalidTaskException {
        if (title == null || title.isBlank()) throw new InvalidTaskException("Title cannot be empty");
        if (dueDate.isBefore(LocalDate.now())) throw new InvalidTaskException("Date cannot be in the past");

        this.title = title;
        this.dueDate = dueDate;
    }
}
