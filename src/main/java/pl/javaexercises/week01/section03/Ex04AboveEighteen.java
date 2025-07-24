package pl.javaexercises.week01.section03;

import pl.javaexercises.week01.Task;

import java.util.Map;

// 4. Print only the people older than 18 from the name → age map.

public class Ex04AboveEighteen implements Task<String> {
    Map<String,Integer> usersDetails;

    public Ex04AboveEighteen(Map<String, Integer> usersDetails) {
        this.usersDetails = usersDetails;
    }

    public String run() {
        StringBuilder result = new StringBuilder();


        for (Map.Entry<String, Integer> entry : usersDetails.entrySet()) {
            if (entry.getValue() > 18) result.append("Imię: ").append(entry.getKey()).append(", Wiek: ").append(entry.getValue()).append("\n");
        }

        return "The people above 18 years old are as follows: " + "\n" + result;
    }
}

