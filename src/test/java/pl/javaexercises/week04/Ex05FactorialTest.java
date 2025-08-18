package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05FactorialTest {

  @Test
  void testFactorialZero() {assertEquals(1, Ex05Factorial.factorial(0));}

  @Test
  void testFactorialFive() {assertEquals(120, Ex05Factorial.factorial(5));}
}
