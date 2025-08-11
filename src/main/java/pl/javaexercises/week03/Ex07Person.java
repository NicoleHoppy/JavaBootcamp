package pl.javaexercises.week03;

import java.util.Comparator;

// 7. Create a class Person with fields name and age. Create a list of 3 people and sort them by age
// ascending using a Comparator.

public class Ex07Person implements Comparator<Ex07Person> {

  String name;
  int age;

  public Ex07Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int compare(Ex07Person ex07Person, Ex07Person t1) {
    return Integer.compare(ex07Person.age, t1.age);
  }

  @Override
  public String toString() {
    return "{" + "name = '" + name + '\'' + ", age = " + age + "} ";
  }
}
