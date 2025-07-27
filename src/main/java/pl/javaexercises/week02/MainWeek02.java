package pl.javaexercises.week02;

import java.util.List;
import java.util.Map;

public class MainWeek02 {

    public static void main(String[] args) {

    Map<TaskWeek02<String>, List<String>> MAPTASKINPUT =
        Map.of(
            new Ex01CharReplacer(), List.of("nobody@mail.com ###", "@somebody @nobody @anybody")
            );

        for (Map.Entry<TaskWeek02<String>, List<String>> entry : MAPTASKINPUT.entrySet()){
            TaskWeek02<String> task = entry.getKey();
            System.out.printf("Class name: %s \n", entry.getKey().getClass().getSimpleName());
            for (String input : entry.getValue()){
                String result = task.run(input);
                System.out.printf("Input: %s, Result: %s\n", input, result);
            }
        }
    }
}