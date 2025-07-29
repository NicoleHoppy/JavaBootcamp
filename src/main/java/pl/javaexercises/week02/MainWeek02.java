package pl.javaexercises.week02;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainWeek02 {

    public static void main(String[] args) {

        Map<TaskWeek02, List<String>> MAP = new LinkedHashMap<>();
        MAP.put(new Ex01CharReplacer(), List.of("nobody@mail.com ###", "@somebody @nobody @anybody"));
        MAP.put(new Ex02PalindromeCheck(), List.of("Kobyła ma mały bok", "cat"));
        MAP.put(new Ex03VowelCounter(), List.of("I have a cat", "Hello world"));
        MAP.put(new Ex04InitialsGenerator(), List.of("Tom Smith", "Kate Jackson"));
    MAP.put(new Ex05CaseConverter(), List.of("programming", "HELLO"));
            MAP.put(new Ex06WordCounter(), List.of("There are no words", "Hello world"));

        for (Map.Entry<TaskWeek02, List<String>> entry : MAP.entrySet()){
            TaskWeek02 task = entry.getKey();
            System.out.printf("Class name: %s \n", entry.getKey().getClass().getSimpleName());
            for (String input : entry.getValue()){
                String result = task.run(input).toString();
                System.out.printf("Input: %s, Result: %s\n", input, result);
            }
        }
    }
}