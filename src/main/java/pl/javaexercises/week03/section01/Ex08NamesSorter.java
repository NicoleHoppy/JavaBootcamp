package pl.javaexercises.week03.section01;

import java.util.Comparator;

// 8. Create a list of 5 names (Strings) and sort them alphabetically.

public class Ex08NamesSorter implements Comparator<Ex08NamesSorter> {
  String name;

  public Ex08NamesSorter(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compare(Ex08NamesSorter ex08NamesSorter, Ex08NamesSorter t1) {
    return 0;
  }

  @Override
  public String toString() {
    return name + ", ";
  }
}
