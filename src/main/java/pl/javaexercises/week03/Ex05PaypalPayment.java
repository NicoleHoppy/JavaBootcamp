package pl.javaexercises.week03;

public class Ex05PaypalPayment extends Ex05Payment {

  @Override
  public void processPayment() {
    System.out.println("The payment was confirmed and processed using Paypal payment.");
  }
}
