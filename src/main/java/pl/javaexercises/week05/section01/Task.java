package pl.javaexercises.week05.section01;

import java.time.LocalDate;

public class Task {
    private final String description;
    private final LocalDate date;

    public Task(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return description + " - " + date;
    }
}
