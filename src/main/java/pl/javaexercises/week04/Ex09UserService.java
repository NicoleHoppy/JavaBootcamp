package pl.javaexercises.week04;

import java.util.List;

public class Ex09UserService {
    private final Ex09UserRepository userRepository;

    public Ex09UserService(Ex09UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Ex09User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
