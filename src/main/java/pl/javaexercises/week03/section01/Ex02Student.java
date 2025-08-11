package pl.javaexercises.week03.section01;

// 2. Create a class Student with fields name and averageGrade. Implement the
// Comparable<Student> interface to sort students in descending order by averageGrade. Use
// Collections.sort().

public class Ex02Student implements Comparable<Ex02Student> {
  String name;
  double averageGrade;

  public Ex02Student(String name, double averageGrade) {
    this.name = name;
    this.averageGrade = averageGrade;
  }

  public int compareTo(Ex02Student other) {
    return Double.compare(this.averageGrade, other.averageGrade);
  }

  @Override
  public String toString() {
    return "{" + "name = '" + name + '\'' + ", averageGrade = " + averageGrade + "} ";
  }
}
