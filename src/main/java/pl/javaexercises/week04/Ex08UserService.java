package pl.javaexercises.week04;

// 8. The UserRepository throws an exception when deleting a non-existent user. Verify that
// UserService.deleteUser(id) reacts correctly to the exception. Mock an object and verify that its
// method was called exactly a specified number of times.

public class Ex08UserService {
  private final Ex08UserRepository userRepository;

  public Ex08UserService(Ex08UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }
}
