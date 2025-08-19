package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01CalculatorTest {

  @Test
  public void addTest() {
    assertEquals(3, Ex01Calculator.add(1, 2));
  }
}
