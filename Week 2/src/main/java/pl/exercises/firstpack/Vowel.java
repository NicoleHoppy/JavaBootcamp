package pl.exercises.firstpack;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Vowel implements Task<String>{

    @Override
    public String run(String name) {
        Set<Character> vowelList = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'y'));
        char[] nameModified = name.toLowerCase().toCharArray();

        int count = 0;
        for (char letter : nameModified) {
            for (char vowels : vowelList) if (letter == vowels) count++;
        }
        return ("There are " + count + " vowels in the sentence");
    }
}
