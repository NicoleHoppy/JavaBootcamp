package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.Task;

public class Ex08TheBiggestNumber implements Task<String> {

    //    8. The largest of three numbers: Read 3 numbers and print the largest one.

    private final int firstInput;
    private final int secondInput;
    private final int thirdInput;

    public Ex08TheBiggestNumber(int firstInput, int secondInput, int thirdInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.thirdInput = thirdInput;
    }

    @Override
    public String run() {
        int theBiggest = Math.max(firstInput, Math.max(secondInput, thirdInput));
        return "The number " + theBiggest + " is the greatest among: " + firstInput + ", "+ secondInput + " and "+ thirdInput;
    }
}