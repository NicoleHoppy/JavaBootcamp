package pl.javaexercises.week01.section02;

import java.util.Arrays;
import pl.javaexercises.week01.Task;

public class Ex04SumOfTable implements Task<String> {

//    4. Write a program that calculates the sum of all elements in an int array.

    int[] table;

    public Ex04SumOfTable(int[] table) {
        this.table = table;
    }

    public String run() {
        int sum = 0;

        for (int t : table) sum += t;

        return "The sum of the following table " + Arrays.toString(table) + " is: " + sum;
    }
}