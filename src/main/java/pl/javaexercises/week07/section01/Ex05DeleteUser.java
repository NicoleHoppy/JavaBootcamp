package pl.javaexercises.week07.section01;

import jakarta.persistence.EntityManager;

public class Ex05DeleteUser {

    public static void execute(EntityManager em) {

        Ex01User user = em.find(Ex01User.class, 2L);

        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();

        System.out.println("User deleted: " + user.getId());
  }
}
