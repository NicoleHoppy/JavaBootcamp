package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

import java.util.HashMap;
import java.util.Map;

// 6. Count the number of occurrences of a given character (e.g., commas) in a string.

public class Ex06CharCounter implements TaskWeek02<String> {
    public String run(String desc) {

        char[] charArray = desc.trim().toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();

        for (char c : charArray) {
            charCounter.put(c,charCounter.getOrDefault(c, 0) + 1);
        }

        return "The occurrence of characters is as follows: " + charCounter;

    }
}
