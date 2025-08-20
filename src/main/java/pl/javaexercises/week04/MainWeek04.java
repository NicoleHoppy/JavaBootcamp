package pl.javaexercises.week04;

import java.util.List;

public class MainWeek04 {
    public static void main(String[] args) {

    System.out.println(Ex01Calculator.class.getSimpleName() + ": 2 + 3 = " + Ex01Calculator.add(2, 3));
    System.out.println(Ex02IsEven.class.getSimpleName() + ": Is 4 even? " + Ex02IsEven.isEven(4));
    System.out.println(Ex03StringReverser.class.getSimpleName() + ": Reverse of 'Hello' = " + Ex03StringReverser.reverse("Hello"));
    System.out.println(Ex04IsEmpty.class.getSimpleName() + ": Is empty (''): " + Ex04IsEmpty.isEmpty(""));
    System.out.println(Ex05Factorial.class.getSimpleName() + ": Factorial of 5 = " + Ex05Factorial.factorial(5));
    Ex06LoggerService loggerService = new Ex06ConsoleLoggerService();
    Ex06Calculator calculator = new Ex06Calculator(loggerService);
    int result = calculator.add(5, 7);
    System.out.println(Ex06Calculator.class.getSimpleName() + ": Final result = " + result);
    Ex07InMemoryUserRepository inMemoryUserRepository = new Ex07InMemoryUserRepository();
    inMemoryUserRepository.save(new Ex07User(1, "Alice"));
    inMemoryUserRepository.save(new Ex07User(2, "Bob"));
    Ex07UserService userService = new Ex07UserService(inMemoryUserRepository);
    Ex07User user = userService.getUserById(2);
    System.out.println("Found user: " + user);
    Ex07User missing = userService.getUserById(99);
    System.out.println("Missing user: " + missing);
    Ex08InMemoryUserRepository memoryUserRepository = new Ex08InMemoryUserRepository();
    memoryUserRepository.save(1L, "Mary");
    memoryUserRepository.save(2L, "Chris");

    Ex08UserService newUserService = new Ex08UserService(memoryUserRepository);

    newUserService.deleteUser(1L);
    System.out.println("User 1 deleted");
    try{
        newUserService.deleteUser(99L);
    } catch (RuntimeException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }

    Ex09UserRepository ex09UserRepository = new Ex09InMemoryUserRepository();
    Ex09UserService ex09UserService = new Ex09UserService(ex09UserRepository);

        List<Ex09User> ex09Users = ex09UserService.getAllUsers();
        for (Ex09User u : ex09Users) {
      System.out.println(u.getName());
        }

        Ex10Task task = new Ex10Task();
    System.out.println("Task status before complete(): " + task.getStatus());
    task.complete();
    System.out.println("Task status after complete(): " + task.getStatus());

  }
}
