package pl.javaexercises.week07.section01;

import jakarta.persistence.EntityManager;

public class Ex02AddUser {
    public static void execute(EntityManager em) {
        Ex01User user = new Ex01User();
        user.setName("Anna");
        user.setEmail("anna@example.com");

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        System.out.println("User saved: " + user.getId());
    }
}
