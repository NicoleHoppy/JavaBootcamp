package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class Ex09UserServiceTest {

  @Test
  void shouldGetAllUsers() {
    Ex09UserRepository userRepository = mock(Ex09UserRepository.class);
    Ex09UserService userService = new Ex09UserService(userRepository);

    List<Ex09User> mockUsers =
        List.of(new Ex09User(1L, "Alice"), new Ex09User(2L, "Bob"), new Ex09User(3L, "Charlie"));

    when(userRepository.getAllUsers()).thenReturn(mockUsers);

    List<Ex09User> result = userService.getAllUsers();

    assertEquals(3, result.size());
    assertEquals("Alice", result.getFirst().getName());
    verify(userRepository, times(1)).getAllUsers();
  }
}
