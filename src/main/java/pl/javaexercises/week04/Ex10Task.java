package pl.javaexercises.week04;

// 10. Mock the repository method getAllUsers() so that it returns a list of 3 users. Verify that
// the service reads it correctly.

public class Ex10Task {
  private Ex10TaskStatus status = Ex10TaskStatus.ACTIVE;

  public Ex10TaskStatus getStatus() {
    return status;
  }

  public void complete() {
    this.status = Ex10TaskStatus.COMPLETED;
  }
}
