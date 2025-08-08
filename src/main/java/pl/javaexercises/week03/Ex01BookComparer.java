package pl.javaexercises.week03;

// 1. Create a class Book with fields: title, author, year. Two books are considered equal if they have the same title and author. Implement equals() and hashCode(). Then add objects to a HashSet and verify that duplicates are ignored.

import java.util.Objects;

public class Ex01BookComparer {

    String title;
    String author;
    int year;

    public Ex01BookComparer(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ex01BookComparer that)) return false;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
