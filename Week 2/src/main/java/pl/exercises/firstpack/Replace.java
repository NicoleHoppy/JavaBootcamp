package pl.exercises.firstpack;

public class Replace implements Task<String>{

    @Override
    public String run(String input) {
        return input.replace("@", "(at)")
                .replace("#", "(hash)");
    }
}
