package pl.javaexercises.week04;

import java.util.ArrayList;
import java.util.List;

public class Ex09InMemoryUserRepository implements Ex09UserRepository{
    private final List<Ex09User> users = new ArrayList<>();

    public Ex09InMemoryUserRepository() {
        users.add(new Ex09User(1L, "Alice"));
        users.add(new Ex09User(2L, "Bob"));
        users.add(new Ex09User(3L, "Charlie"));
    }

    @Override
    public List<Ex09User> getAllUsers() {
        return users;
    }
}
