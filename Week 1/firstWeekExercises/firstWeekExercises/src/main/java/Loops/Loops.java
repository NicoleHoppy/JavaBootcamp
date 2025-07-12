package Loops;

public class Loops {

    public static void NormalLoop() {

        System.out.printf("This is the result of normal loop: ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " ");
        }
    }

    public static void ReverseLoop() {

        System.out.printf("\n" + "And here is the results of reversed loop: ");
        for (int i = 10; i > 0; i--) {
            System.out.printf(i + " ");
        }
    }
}

