package pl.javaexercises.week02.section03;

public class Ex07Task extends Ex07Item implements Ex07Completable {
  public String dueDate;
  public String status;

  public Ex07Task(String title, String dueDate, String status) {
    super(title);
    this.dueDate = dueDate;
    this.status = status;
  }

  @Override
  public void complete() {
    this.status = "Completed";
    System.out.println(title + " completed.");
  }

  @Override
  public String toString() {
    return title + " (" + dueDate + ") - " + status;
  }
}
