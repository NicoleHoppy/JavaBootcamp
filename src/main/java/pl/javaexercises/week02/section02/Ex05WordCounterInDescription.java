package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

import java.util.Arrays;

//5. Count the number of words in a task description.

public class Ex05WordCounterInDescription implements TaskWeek02<String> {
    public String run(String desc) {
        int counter;
        String[] descList = desc.trim().split(" ");

        counter = (int) Arrays.stream(descList).count();

        return "This description contains " + counter + " words.";
    }
}
