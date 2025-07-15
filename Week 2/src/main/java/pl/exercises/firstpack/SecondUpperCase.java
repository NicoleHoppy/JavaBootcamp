package pl.exercises.firstpack;

public class SecondUpperCase implements Task<String> {

    @Override
    public String run(String input) {

        char[] nameList = input.toLowerCase().toCharArray();

        for (int i = 1; i < nameList.length; i+=2) {
            nameList[i] = Character.toUpperCase(nameList[i]);
        }
        return new String(nameList);
    }
}
