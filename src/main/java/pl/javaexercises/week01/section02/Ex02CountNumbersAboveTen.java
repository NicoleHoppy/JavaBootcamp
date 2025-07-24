package pl.javaexercises.week01.section02;

import pl.javaexercises.week01.Task;

import java.util.Arrays;

public class Ex02CountNumbersAboveTen implements Task<String> {

    //    2. Count how many numbers in the array are greater than 10.

    int[] table;

    public Ex02CountNumbersAboveTen(int[] table) {
        this.table = table;
    }

    public String run() {
        int count = 0;
        for (int t : table) {
            if (t > 10) count++;
        }
        return "There are " + count + " numbers greater than 10 in the following table: " + Arrays.toString(table);
    }
}