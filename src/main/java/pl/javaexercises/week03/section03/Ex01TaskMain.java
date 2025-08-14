package pl.javaexercises.week03.section03;

import java.time.LocalDate;

public class Ex01TaskMain {
    public static void main(String[] args){
        try {
            Ex01Task validTask = new Ex01Task("Cooking", LocalDate.now().plusDays(3));
            System.out.println(validTask);
        } catch (Ex01InvalidTaskException e) {
      System.out.println("The task couldn't be created: " + e.getMessage());
        }

        try   {
            Ex01Task invalidDateTask = new Ex01Task("Cleaning", LocalDate.now().minusDays(3));
            System.out.println(invalidDateTask);
        } catch (Ex01InvalidTaskException e) {
      System.out.println("The task couldn't be created: " + e.getMessage());
        }

        try {
            Ex01Task invalidTitleTask = new Ex01Task("", LocalDate.now().plusDays(1));
            System.out.println(invalidTitleTask);
        } catch (Ex01InvalidTaskException e) {
            System.out.println("The task couldn't be created: " + e.getMessage());
        }
    }
}
