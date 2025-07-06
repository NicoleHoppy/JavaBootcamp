import java.util.Scanner;

public class WhatIs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, give me a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("This is a negative number.");
        }
        else if (number > 0) {
            System.out.println("This is a positive number.");
        }
        else {
            System.out.println("This number equals zero.");
        }

    }
}
