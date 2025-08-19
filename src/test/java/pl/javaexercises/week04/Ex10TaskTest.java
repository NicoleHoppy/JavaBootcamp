package pl.javaexercises.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex10TaskTest {

  @Test
  void shouldChangeStatusFromActiveToComplete() {
    //given
    Ex10Task task = new Ex10Task();
    //then
    assertEquals(Ex10TaskStatus.ACTIVE, task.getStatus());
    //when
    task.complete();
    //then
    assertEquals(Ex10TaskStatus.COMPLETED, task.getStatus());
  }
}
