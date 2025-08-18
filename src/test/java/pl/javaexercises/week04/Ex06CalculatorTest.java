package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class Ex06CalculatorTest {

  @Test
  void shouldLogResult() {
    LoggerService loggerService = mock(LoggerService.class);
  Ex06Calculator calculator = new Ex06Calculator(loggerService);
  calculator.add(3, 4);
  verify(loggerService).log("Added: 7");}
}
