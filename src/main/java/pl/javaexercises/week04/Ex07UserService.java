package pl.javaexercises.week04;

public class Ex07UserService {
    private final Ex07UserRepository userRepository;

    public Ex07UserService(Ex07UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Ex07User getUserById(int id) {
        return userRepository.findById(id);
    }
}
