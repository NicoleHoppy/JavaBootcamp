import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("This number can be divided by 3 and 5.");
        }
        else {
            System.out.println("This number cannot be divided by 3 and 5.");
        }
    }
}
