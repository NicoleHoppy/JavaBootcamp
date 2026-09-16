package pl.javaexercises.week07.section01;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Task 1: Mark the class as an entity and add a primary key. Add name and email fields to the User
// entity
// Create a User class and mark it as an entity, with the id field as the primary key. Add the name
// and email fields to the User entity.

// Task 6: Add a one-to-many (OneToMany) relationship
// In the User class, add a list of projects (List<Project>).

// Task 7: Set the LAZY fetch type for the list of projects
// Change the default fetch type of the projects relationship to LAZY.

@Entity
public class Ex01User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private final List<Ex04Project> projects= new ArrayList<>();
}




