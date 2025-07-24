package pl.javaexercises.week01.section03;

import java.util.List;
import pl.javaexercises.week01.Task;

// 1. Create a list of names (List<String>) and print each name.

public class Ex01ListOfNames implements Task<String> {

    private final List<String> names;

    public Ex01ListOfNames(List<String> names) {
        this.names = names;
    }

    public String run() {
        return "Those are names from the list: " + String.join(", ", names);
    }
}