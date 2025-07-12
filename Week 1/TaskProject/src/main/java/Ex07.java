import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me a number: ");
        int number = scanner.nextInt();

        if (number >= 18) {
            System.out.println("This is adult.");
        }
        else {
            System.out.println("This is child.");
        }
    }
}
