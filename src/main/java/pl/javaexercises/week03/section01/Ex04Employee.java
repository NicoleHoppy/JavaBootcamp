package pl.javaexercises.week03.section01;

// 4. Create a class Employee with fields: id, name, position. Employees are considered equal if
// they have the same id. Implement equals() and hashCode() so that a HashSet does not add
// duplicates.

import java.util.Objects;

public class Ex04Employee {
  int id;
  String name;
  int position;

  public Ex04Employee(int id, String name, int position) {
    this.id = id;
    this.name = name;
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Ex04Employee that)) return false;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return " {" + "name = '" + name + '\'' + ", position = " + position + "} ";
  }
}
