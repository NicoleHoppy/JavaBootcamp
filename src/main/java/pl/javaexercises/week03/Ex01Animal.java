package pl.javaexercises.week03;

// 1. Create a class Animal with the method makeSound(), then create classes Dog and Cat that inherit from Animal and override makeSound().

public class Ex01Animal {

    public String name;

    public Ex01Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
    System.out.println("Make some random animal's voice");
    }
}
