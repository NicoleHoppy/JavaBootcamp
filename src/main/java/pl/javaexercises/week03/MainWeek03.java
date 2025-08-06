package pl.javaexercises.week03;

import static java.lang.System.*;

public class MainWeek03 {

    public static void main(String[] args) {

    out.print(Ex01Dog.class.getSimpleName() + ": ");
        Ex01Dog dog = new Ex01Dog("Burek");
        dog.makeSound();

    out.print(Ex01Cat.class.getSimpleName() + ": ");

        Ex01Cat cat = new Ex01Cat("Mruczek");
        cat.makeSound();

    out.print(Ex02Guitar.class.getSimpleName() + ": ");

    Ex02Guitar guitar = new Ex02Guitar();
    guitar.play();

    out.print(Ex03Car.class.getSimpleName() + ": ");
    Ex03Car car = new Ex03Car(60);
    car.move();

    out.print(Ex04Circle.class.getSimpleName() + ": ");
    Ex04Circle circle = new Ex04Circle(2);
    circle.area();

    out.print(Ex04Rectangle.class.getSimpleName() + ": ");
    Ex04Rectangle rectangle = new Ex04Rectangle(2, 6);
    rectangle.area();

    out.print(Ex05CreditCardPayment.class.getSimpleName()+ ": ");
    Ex05CreditCardPayment creditCard = new Ex05CreditCardPayment();
    creditCard.processPayment();

    out.print(Ex05PaypalPayment.class.getSimpleName() + ": ");
    Ex05PaypalPayment paypalPayment = new Ex05PaypalPayment();
    paypalPayment.processPayment();
  }
}
