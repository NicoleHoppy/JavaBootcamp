package pl.javaexercises.week07.section01;

import jakarta.persistence.*;

// Task 5: Add a many-to-one (ManyToOne) relationship
// Create a Project class and add a ManyToOne relationship to User.

@Entity
public class Ex04Project {
        @Id
        @GeneratedValue
        private Long id;

        private String name;

        @ManyToOne
        private Ex01User owner;
}

