package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class Ex07UserServiceTest {

  @Test
  void shouldReturnUserFromRepository() {
      // given
      Ex07UserRepository repo = mock(Ex07UserRepository.class);
      Ex07User expectedUser = new Ex07User(1, "Alice");
      when(repo.findById(1)).thenReturn(expectedUser);

      Ex07UserService service = new Ex07UserService(repo);

      // when
      Ex07User result = service.getUserById(1);

      // then
      assertEquals(expectedUser, result);
  }
}
