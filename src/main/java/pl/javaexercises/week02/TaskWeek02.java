package pl.javaexercises.week02;

@FunctionalInterface
public interface TaskWeek02<T> {
  T run(String input);
}
