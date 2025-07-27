package pl.javaexercises.week02;

public class Ex01CharReplacer implements TaskWeek02<String> {

    @Override
    public String run(String input) {
        return input.replace("@", "(at)")
                .replace("#", "(hash)");
    }
}

