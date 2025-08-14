package pl.javaexercises.week03.section03;

import java.time.LocalDate;

public class Ex01Task {
    String title;
    LocalDate dueDate;

    @Override
    public String toString() {
        return "Task: " +
                "title = '" + title + '\'' +
                ", dueDate = " + dueDate;
    }

    public Ex01Task(String title, LocalDate dueDate) throws Ex01InvalidTaskException {
        if (title == null || title.isBlank()) throw new Ex01InvalidTaskException("Title cannot be empty");
        if (dueDate.isBefore(LocalDate.now())) throw new Ex01InvalidTaskException("Date cannot be in the past");

        this.title = title;
        this.dueDate = dueDate;
    }
}
