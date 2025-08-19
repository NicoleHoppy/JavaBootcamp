package pl.javaexercises.week04;

// 7. Implement UserService that uses UserRepository. The getUserById(id) method should return a
// user. Mock the repository and write a test that verifies the result is correct.

public class Ex07UserService {
  private final Ex07UserRepository userRepository;

  public Ex07UserService(Ex07UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Ex07User getUserById(int id) {
    return userRepository.findById(id);
  }
}
