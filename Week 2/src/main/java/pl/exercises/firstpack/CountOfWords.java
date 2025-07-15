package pl.exercises.firstpack;

public class CountOfWords implements Task<Integer>{

    @Override
    public Integer run(String name) {
        String[] nameList = name.trim().split("\\s");
        return nameList.length;
    }
}
