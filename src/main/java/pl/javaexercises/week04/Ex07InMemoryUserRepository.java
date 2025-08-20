package pl.javaexercises.week04;

import java.util.HashMap;
import java.util.Map;

public class Ex07InMemoryUserRepository implements Ex07UserRepository {
    private final Map<Integer, Ex07User> userMap = new HashMap<>();

    @Override
    public Ex07User findById(int id){
        return userMap.get(id);
    }

    public void save(Ex07User user) {
        userMap.put(user.id(), user);
    }
}
