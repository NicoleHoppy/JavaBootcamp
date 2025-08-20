package pl.javaexercises.week04;

import java.util.List;

public class MainWeek04 {

  public static void printResult(Class<?> clazz, String message) {
    System.out.println(clazz.getSimpleName() + ": " + message);
  }

  public static void main(String[] args) {

    printResult(Ex01Calculator.class, "2 + 3 = " + Ex01Calculator.add(2, 3));
    printResult(Ex02IsEven.class, "Is 4 even? " + Ex02IsEven.isEven(4));
    printResult(Ex03StringReverser.class, "Reverse of 'Hello' = " + Ex03StringReverser.reverse("Hello"));
    printResult(Ex04IsEmpty.class, "Is empty (''): " + Ex04IsEmpty.isEmpty(""));
    printResult(Ex05Factorial.class, "Factorial of 5 = " + Ex05Factorial.factorial(5));

    Ex06LoggerService ex06LoggerService = new Ex06ConsoleLoggerService();
    Ex06Calculator calculator = new Ex06Calculator(ex06LoggerService);
    int result = calculator.add(5, 7);
    printResult(Ex06LoggerService.class, "Final result = " + result);

    Ex07InMemoryUserRepository ex07InMemoryUserRepository = new Ex07InMemoryUserRepository();
    ex07InMemoryUserRepository.save(new Ex07User(1, "Alice"));
    ex07InMemoryUserRepository.save(new Ex07User(2, "Bob"));
    Ex07UserService ex07UserService = new Ex07UserService(ex07InMemoryUserRepository);
    Ex07User ex07user = ex07UserService.getUserById(2);
    printResult(Ex07UserService.class, "Found user: " + ex07user);
    Ex07User missing = ex07UserService.getUserById(99);
    printResult(Ex07UserService.class, "Missing user: " + missing);

    Ex08InMemoryUserRepository ex08InMemoryUserRepository = new Ex08InMemoryUserRepository();
    ex08InMemoryUserRepository.save(1L, "Mary");
    ex08InMemoryUserRepository.save(2L, "Chris");
    Ex08UserService ex08UserService = new Ex08UserService(ex08InMemoryUserRepository);
    ex08UserService.deleteUser(1L);
    printResult(Ex08UserService.class, "User 1 deleted");
    try {
      ex08UserService.deleteUser(99L);
    } catch (RuntimeException e) {
      printResult(Ex08UserService.class, "Caught exception: " + e.getMessage());
    }

    Ex09UserRepository ex09UserRepository = new Ex09InMemoryUserRepository();
    Ex09UserService ex09UserService = new Ex09UserService(ex09UserRepository);

    List<Ex09User> ex09Users = ex09UserService.getAllUsers();
    for (Ex09User u : ex09Users) {
      printResult(Ex09UserService.class, u.getName());
    }

    Ex10Task task = new Ex10Task();
    printResult(Ex10Task.class, "Task status before complete(): " + task.getStatus());
    task.complete();
    printResult(Ex10Task.class, "Task status after complete(): " + task.getStatus());
  }
}
