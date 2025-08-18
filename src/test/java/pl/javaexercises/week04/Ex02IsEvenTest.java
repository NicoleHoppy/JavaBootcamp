package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex02IsEvenTest {

  @Test
  void testIsEvenWithEvenNumbers() {assertTrue(Ex02IsEven.isEven(4));}

  @Test
  void testIsOddWithOddNumbers() {assertFalse(Ex02IsEven.isEven(5));}
}
