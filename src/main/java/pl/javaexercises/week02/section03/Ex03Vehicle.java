package pl.javaexercises.week02.section03;

// 3. Create a class Vehicle with a speed field and a method move(), then a class Car inheriting
// from Vehicle and overriding move() to display the speed.

public class Ex03Vehicle {

  int speed;

  public Ex03Vehicle(int speed) {
    this.speed = speed;
  }

  void move() {
    System.out.println("The vehicle is moving");
  }
}
