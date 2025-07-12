import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        }
        else {
            System.out.println("This number is odd.");
        }
    }
}
