package pl.javaexercises.week01.section02;

import java.util.Arrays;
import java.util.StringJoiner;
import pl.javaexercises.week01.Task;

public class Ex05ReversedTable implements Task<String> {

//    5. Write a program that prints the array in reverse order.

    int[] table;

    public Ex05ReversedTable(int[] table) {
        this.table = table;
    }

    public String run() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = table.length - 1; i >= 0 ; i--) joiner.add(String.valueOf(table[i]));

        return "For the following table: " + Arrays.toString(table) + " the reversed table is as follows: [" + joiner + "]";
    }
}