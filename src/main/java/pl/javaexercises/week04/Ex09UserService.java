package pl.javaexercises.week04;

import java.util.List;

// 9. Mock the repository method getAllUsers() so that it returns a list of 3 users. Verify that the
// service reads it correctly.

public class Ex09UserService {
  private final Ex09UserRepository userRepository;

  public Ex09UserService(Ex09UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<Ex09User> getAllUsers() {
    return userRepository.getAllUsers();
  }
}
