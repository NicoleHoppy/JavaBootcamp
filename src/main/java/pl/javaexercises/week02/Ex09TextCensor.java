package pl.javaexercises.week02;

public class Ex09TextCensor implements TaskWeek02<String>{

    @Override
    public String run(String name) {
        return name
                .replaceAll("\\bfuck\\b", "***")
                .replaceAll("\\bdamn\\b", "***");
    }
}
