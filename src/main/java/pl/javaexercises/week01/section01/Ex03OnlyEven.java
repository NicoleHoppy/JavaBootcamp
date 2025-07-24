package pl.javaexercises.week01.section01;

import java.util.StringJoiner;
import pl.javaexercises.week01.Task;

//3. Print only even numbers from 1 to 20.

public class Ex03OnlyEven implements Task<String> {

    @Override
    public String run() {
        StringJoiner joiner = new StringJoiner(", ");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) joiner.add(String.valueOf(i));
        }

        return "Only even numbers from 1 to 20: " + joiner;
    }
}