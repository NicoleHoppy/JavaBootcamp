package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainWeek02Section02 {

    public static void main(String[] args) {

        Map<TaskWeek02<String>, List<String>> MAP = new LinkedHashMap<>();
    MAP.put(
        new Ex01DescriptionValidator(),
        List.of("Update login page design", " Fix user login bug"));

        for (Map.Entry<TaskWeek02<String>, List<String>> entry : MAP.entrySet()) {
            TaskWeek02<String> task = entry.getKey();
            System.out.printf("\nClass name: %s \n", entry.getKey().getClass().getSimpleName());
            for (String input : entry.getValue()) {
                String result = task.run(input);
                System.out.printf("Input: %s, Result: %s\n", input, result);
            }
        }
    }
}