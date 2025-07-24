package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.Task;

public class Ex06EvenOrOdd implements Task<String> {

    //    6. Even or odd: Read an integer and print whether it is even or odd.

    private final int input;

    public Ex06EvenOrOdd(int input) {
        this.input = input;
    }

    @Override
    public String run() {
        if (input % 2 == 0) return "Number " + input + " is even.";
        return "Number " + input + " is odd.";
    }
}