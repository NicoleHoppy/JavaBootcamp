package pl.javaexercises.week03;

public class Ex04Circle implements Ex04Shape {

  public double radius;

  public Ex04Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
