package pl.javaexercises.week03;

public class Ex03Car extends Ex03Vehicle {

  public Ex03Car(int speed) {
    super(speed);
  }

  @Override
  public void move() {
    System.out.println("This car is moving with " + speed + " km/h");
  }
}
