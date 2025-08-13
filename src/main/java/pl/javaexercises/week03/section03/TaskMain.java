package pl.javaexercises.week03.section03;

import java.time.LocalDate;

public class TaskMain {
    public static void main(String[] args){
        try {
            Task validTask = new Task("Cooking", LocalDate.now().plusDays(3));
            System.out.println(validTask);
        } catch (InvalidTaskException e) {
      System.out.println("The task couldn't be created: " + e.getMessage());
        }

        try   {
            Task invalidDateTask = new Task("Cleaning", LocalDate.now().minusDays(3));
            System.out.println(invalidDateTask);
        } catch (InvalidTaskException e) {
      System.out.println("The task couldn't be created: " + e.getMessage());
        }

        try {
            Task invalidTitleTask = new Task("", LocalDate.now().plusDays(1));
            System.out.println(invalidTitleTask);
        } catch (InvalidTaskException e) {
            System.out.println("The task couldn't be created: " + e.getMessage());
        }
    }
}
