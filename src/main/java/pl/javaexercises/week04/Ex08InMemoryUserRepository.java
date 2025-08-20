package pl.javaexercises.week04;

import java.util.HashMap;
import java.util.Map;

public class Ex08InMemoryUserRepository implements Ex08UserRepository{
    private final Map<Long, String> users = new HashMap<>();

    public void save(Long id, String name){
        users.put(id, name);
    }

    @Override
    public void deleteById(Long id) {
        if (!users.containsKey(id)) {
            throw new RuntimeException("User with id: " + id + " does not exist!");
        }
    }
}
