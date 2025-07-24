package pl.javaexercises.week01;

@FunctionalInterface
public interface Task<T> {
    T run();
}