package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class Ex08UserServiceTest {

  @Test
  void shouldDeleteUser() {
    Ex08UserRepository userRepository = mock(Ex08UserRepository.class);
    Ex08UserService userService = new Ex08UserService(userRepository);

    Long userId = 123L;

    doThrow(new IllegalArgumentException("User not found")).when(userRepository).deleteById(userId);

    assertThrows(IllegalArgumentException.class, () -> userService.deleteUser(userId));

    verify(userRepository, times(1)).deleteById(userId);

      }
    }

