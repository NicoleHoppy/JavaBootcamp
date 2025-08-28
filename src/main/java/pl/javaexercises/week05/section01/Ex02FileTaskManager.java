package pl.javaexercises.week05.section01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//2. File write and read (NIO)
//
//- Save a list of tasks into a text file and read from it.
//- Create a List<String> with task descriptions.
//- Write the file.
//- Read the file.
//- Additionally, check whether the file exists before reading (Files.exists()).

public class Ex02FileTaskManager {
    private static final Path FILE_PATH = Paths.get("src/main/resources/tasks.txt");

    public static void main(String[] args){
        List<String> tasks = Arrays.asList("Task 1 - Write report",
                "Task 2 - Meeting with team",
                "Task 3 - Review code");

        try {
            Files.write(FILE_PATH, tasks);
            System.out.println("Tasks written to file");

            if (Files.exists(FILE_PATH)) {
                List<String> readTasks = Files.readAllLines(FILE_PATH);
        System.out.println("Read tasks from file: ");
        readTasks.forEach(System.out::println);
            } else {System.out.println("File doesn't exist.");
        }} catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
