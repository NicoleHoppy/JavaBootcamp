package pl.javaexercises.week02.section03;

public class Ex01Dog extends Ex01Animal {

  public Ex01Dog(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says Woof!");
  }
}
