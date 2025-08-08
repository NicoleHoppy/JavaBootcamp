package pl.javaexercises.week03;
import java.util.List;

public class MainWeek03 {
    public static void main(String[] args) {
        runAnimalDemo();
        runPlayableDemo();
        runVehicleDemo();
        runShapeDemo();
        runPaymentDemo();
        runPolymorphismDemo();
        runProjectDemo();
    }

    private static void runAnimalDemo() {
        System.out.print(Ex01Dog.class.getSimpleName() + ": ");
        new Ex01Dog("Burek").makeSound();

        System.out.print(Ex01Cat.class.getSimpleName() + ": ");
        new Ex01Cat("Mruczek").makeSound();
    }

    private static void runPlayableDemo() {
        System.out.print(Ex02Guitar.class.getSimpleName() + ": ");
        new Ex02Guitar().play();
    }

    private static void runVehicleDemo() {
        System.out.print(Ex03Car.class.getSimpleName() + ": ");
        new Ex03Car(60).move();
    }

    private static void runShapeDemo() {
        System.out.print(Ex04Circle.class.getSimpleName() + ": ");
        System.out.println("Area = " + new Ex04Circle(2).area());

        System.out.print(Ex04Rectangle.class.getSimpleName() + ": ");
        System.out.println("Area = " + new Ex04Rectangle(2, 6).area());
    }

    private static void runPaymentDemo() {
        System.out.print(Ex05CreditCardPayment.class.getSimpleName() + ": ");
        new Ex05CreditCardPayment().processPayment();

        System.out.print(Ex05PaypalPayment.class.getSimpleName() + ": ");
        new Ex05PaypalPayment().processPayment();
    }

    private static void runPolymorphismDemo() {
        System.out.print(Ex06Animal.class.getSimpleName() + " list: ");
    List<Ex06Animal> animals =
        List.of(
            new Ex06Cat(), new Ex06Cat(), new Ex06Dog(),
            new Ex06Dog(), new Ex06Dog(), new Ex06Cat(),
            new Ex06Cat());
        for (Ex06Animal animal : animals) {
            animal.makeSound();
        }
    }

    private static void runProjectDemo() {
        System.out.print("\n" + Ex07Project.class.getSimpleName() + ": ");
        Ex07Project project = new Ex07Project("Java OOP Project");
        Ex07Task task1 = new Ex07Task("Design class diagrams", "2025-08-01", "In progress");
        Ex07Task task2 = new Ex07Task("Implement features", "2025-08-10", "Not started");
        project.addTask(task1);
        project.addTask(task2);
        project.showTasks();
        task1.complete();
        project.showTasks();
    }
}
