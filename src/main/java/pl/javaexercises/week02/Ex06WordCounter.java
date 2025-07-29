package pl.javaexercises.week02;

public class Ex06WordCounter implements TaskWeek02<Integer>{

    @Override
    public Integer run(String name) {
        String[] nameList = name.trim().split("\\s");
        return nameList.length;
    }

}
