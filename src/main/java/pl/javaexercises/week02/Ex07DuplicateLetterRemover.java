package pl.javaexercises.week02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex07DuplicateLetterRemover implements TaskWeek02<String>{

    @Override
    public String run(String name) {
        char[] nameList = name.toCharArray();
    Set<Character> nameSet = new LinkedHashSet<>();
        for (char c : nameList) {
            for (char value : nameList) {
                if (c == value) {
                    nameSet.add(c);
                }
            }
        }
        return nameSet.toString();
    }
}
