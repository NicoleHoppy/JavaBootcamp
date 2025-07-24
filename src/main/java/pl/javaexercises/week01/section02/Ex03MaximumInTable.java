package pl.javaexercises.week01.section02;

import pl.javaexercises.week01.Task;

import java.util.Arrays;

public class Ex03MaximumInTable implements Task<String> {

    //    3. Find the largest number in the array.

    int[] table;

    public Ex03MaximumInTable(int[] table) {
        this.table = table;
    }

    public String run() {

        int maximum = table[0];

        for (int t : table) {
            maximum = Math.max(maximum, t);
        }

        return "The maximum of the following table: " + Arrays.toString(table) + " is: " + maximum;
    }
}