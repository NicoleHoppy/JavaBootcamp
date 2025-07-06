import java.util.Scanner;

public class TheBiggest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.printf("Please, give me a second number: ");
        int secondNumber = scanner.nextInt();

        System.out.printf("Please, give me a third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("First number = " + firstNumber + " is the biggest number.");
            }
        }

        else {
            if (secondNumber > thirdNumber) {
                System.out.println("Second number = " + secondNumber + " is the biggest number.");
            }

            else {
                System.out.println("Third number = " + thirdNumber + " is the biggest number.");
            }
        }
    }
}
