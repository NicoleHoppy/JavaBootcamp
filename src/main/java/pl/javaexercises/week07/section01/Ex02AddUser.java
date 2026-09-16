package pl.javaexercises.week07.section01;

import jakarta.persistence.EntityManager;

public class Ex02AddUser {
    public static void execute(EntityManager em) {

        Ex01User user1 = new Ex01User();
        user1.setName("Anna");
        user1.setEmail("anna@example.com");

        Ex01User user2 = new Ex01User();
        user2.setName("Bob");
        user2.setEmail("bob@example.com");

        em.getTransaction().begin();
        em.persist(user1);
        em.persist(user2);
        em.getTransaction().commit();

        System.out.println("User saved: " + user1.getId());
        System.out.println("User saved: " + user2.getId());
    }
}
