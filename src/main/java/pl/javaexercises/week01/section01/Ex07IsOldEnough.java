package pl.javaexercises.week01.section01;

import pl.javaexercises.week01.Task;

public class Ex07IsOldEnough implements Task<String> {

  //    7. Age check: Read the user's age. If they are at least 18 years old, print "Adult", otherwise print "Child".

  private final int input;

    public Ex07IsOldEnough(int input) {
        this.input = input;
    }

    @Override
    public String run() {
        if (input > 0) {
            if (input < 18) return "You are " + input + " years old. You are a child!";
            return "You are " + input + " years old. You are an adult!";
        }
        return "The age cannot be negative number!";
    }
}