import pl.exercises.firstpack.CountOfWords;
import pl.exercises.firstpack.IsPalindrome;
import pl.exercises.firstpack.Replace;
import pl.exercises.firstpack.SecondUpperCase;
import pl.exercises.firstpack.ShorterName;
import pl.exercises.firstpack.Task;
import pl.exercises.firstpack.Vowel;

import java.util.List;

public class Main {

    private static final String INPUT = "djfuwyger@@@vfjbgj# hfkfjfj bjebwwbfjb@#";

    private static final List<Task> TASKS = List.of(
            new Replace(),
            new IsPalindrome(),
            new Vowel(),
            new ShorterName(),
            new SecondUpperCase(),
            new CountOfWords()
    );

    public static void main(String[] args) {

        for (Task task : TASKS){
        System.out.printf("Class name: %s, Result: %s \n", task.getClass().getSimpleName(), task.run(INPUT));
        }
    }
}
