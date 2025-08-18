package pl.javaexercises.week04;

public class Ex05Factorial {
    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
