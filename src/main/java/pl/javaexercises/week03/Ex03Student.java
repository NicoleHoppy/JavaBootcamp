package pl.javaexercises.week03;

// 3. Instead of sorting by grades, sort students alphabetically by name using a Comparator.

public class Ex03Student implements Comparable<Ex03Student> {
  String name;
  double averageGrade;

  public Ex03Student(String name, double averageGrade) {
    this.name = name;
    this.averageGrade = averageGrade;
  }

  @Override
  public int compareTo(Ex03Student ex03Student) {
    return Double.compare(this.averageGrade, ex03Student.averageGrade);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "{" + "name = '" + name + '\'' + ", averageGrade = " + averageGrade + "} ";
  }
}
