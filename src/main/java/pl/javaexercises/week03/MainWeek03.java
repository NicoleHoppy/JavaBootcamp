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
    }}
