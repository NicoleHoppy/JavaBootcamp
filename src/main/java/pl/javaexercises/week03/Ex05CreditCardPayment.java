package pl.javaexercises.week03;

public class Ex05CreditCardPayment extends Ex05Payment {

    @Override
    public void processPayment() {
    System.out.println("The payment was confirmed and processed using credit card.");
    }
}
