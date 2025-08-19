package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex03StringReverserTest {

  @Test
  void testReverseString() {
    assertEquals("olleH", Ex03StringReverser.reverse("Hello"));
  }

  @Test
  void testReverseEmpty() {
    assertEquals("", Ex03StringReverser.reverse(""));
  }

  @Test
  void testReverseNull() {
    assertNull(Ex03StringReverser.reverse(null), "This is null");
  }
}
