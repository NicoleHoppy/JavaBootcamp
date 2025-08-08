package pl.javaexercises.week03;

public class Ex01Cat extends Ex01Animal {

  public Ex01Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says Meow!");
  }
}
