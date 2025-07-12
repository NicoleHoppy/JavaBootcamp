package ConditionalStatements;

import java.util.Scanner;

public class CondStatements {

    public static void OnlyEven() {

        System.out.printf("\n" + "Those are only even values from 1 to 20: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    public static void TypeOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n" + "Please, give me a number and I will tell you the type of number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative.");
        } else {
            System.out.println("This is a null.");
        }
    }

    public static void IsDivided() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me next number and I will tell you if it is divided by 3 and 5: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Number " + number + " is divided by 3 and 5.");
        } else {
            System.out.println("Number " + number + " is not divided by 3 and 5.");
        }
    }

    public static void EvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me next number and I will tell you if it is even or odd: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd");
        }
    }

    public static void IsOldEnough() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me your age: ");
        int number = scanner.nextInt();

        if (number < 18) {
            System.out.println("You are still a child!");
        } else {
            System.out.println("You are an adult now!");
        }
    }

    public static void TheBiggest() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Now I will tell you which number of 3 is the biggest. Please, give me the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.printf("The second one, please: ");
        int secondNumber = scanner.nextInt();
        System.out.printf("And the last one: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("Number " + firstNumber + " is the biggest one.");
            }
        } else if (secondNumber > thirdNumber) {
            System.out.println("Number " + secondNumber + " is the biggest one.");
        } else {
            System.out.println("Number " + thirdNumber + " is the biggest one");
        }
    }
}
