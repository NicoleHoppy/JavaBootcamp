package pl.javaexercises.week07.section01;

import jakarta.persistence.EntityManager;

// Task 4: Find a user by ID
// Retrieve the user with ID = 1 from the database.

public class Ex03FindUser {
    public static void execute(EntityManager em) {
        Ex01User user = em.find(Ex01User.class, 1);
        System.out.println(user.getName());
    }
}
