package pl.javaexercises.week02.section03;

public class Ex05CreditCardPayment extends Ex05Payment {

  @Override
  public void processPayment() {
    System.out.println("The payment was confirmed and processed using credit card.");
  }
}
