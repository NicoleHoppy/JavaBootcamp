package pl.javaexercises.week02;

import java.util.List;
import java.util.Map;

public class MainWeek02 {

    public static void main(String[] args) {

    Map<TaskWeek02, List<String>> MAPTASKINPUT =
        Map.of(
            new Ex01CharReplacer(), List.of("nobody@mail.com ###", "@somebody @nobody @anybody"),
                new Ex02PalindromeCheck(), List.of("Kobyła ma mały bok", "cat")
            );

        for (Map.Entry<TaskWeek02, List<String>> entry : MAPTASKINPUT.entrySet()){
            TaskWeek02 task = entry.getKey();
            System.out.printf("Class name: %s \n", entry.getKey().getClass().getSimpleName());
            for (String input : entry.getValue()){
                String result = task.run(input).toString();
                System.out.printf("Input: %s, Result: %s\n", input, result);
            }
        }
    }
}