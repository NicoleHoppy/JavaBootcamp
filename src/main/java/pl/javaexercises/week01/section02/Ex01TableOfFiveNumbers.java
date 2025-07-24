package pl.javaexercises.week01.section02;

import java.util.StringJoiner;
import pl.javaexercises.week01.Task;

public class Ex01TableOfFiveNumbers implements Task<String> {

//    1. Create an array of 5 numbers and print each of them.

    int REQUIRED_LENGTH = 5;
    int[] table;

    public Ex01TableOfFiveNumbers(int[] table) {
        this.table = table;
    }

    public String run() {
        if (table.length == REQUIRED_LENGTH) {
            StringJoiner joiner = new StringJoiner(", ");
            for (int t : table) {
                joiner.add(String.valueOf(t));
            }
            return "Numbers from table are as follows: " + joiner;
        }
        return "Wrong table length! Required length is 5!";
    }
}