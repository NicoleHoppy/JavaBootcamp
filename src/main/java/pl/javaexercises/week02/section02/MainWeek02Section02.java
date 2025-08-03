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
    MAP.put(new Ex02EmailValidator(), List.of("email@mail.com", "somebodymail.com"));
    MAP.put(new Ex03PasswordValidator(), List.of("P@ssword123", "mybirthdayday0101"));
    MAP.put(new Ex04StringParser(), List.of("John:Smith:38", "Steve:Norris25"));
    MAP.put(new Ex05WordCounterInDescription(), List.of(" Design a text parser that validates input format.", "Exercise now!"));


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